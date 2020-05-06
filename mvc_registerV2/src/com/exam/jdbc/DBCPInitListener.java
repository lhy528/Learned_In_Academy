package com.exam.jdbc;

import java.io.IOException;
import java.io.StringReader;
import java.sql.DriverManager;
import java.util.Properties;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.apache.commons.dbcp2.ConnectionFactory;
import org.apache.commons.dbcp2.DriverManagerConnectionFactory;
import org.apache.commons.dbcp2.PoolableConnection;
import org.apache.commons.dbcp2.PoolableConnectionFactory;
import org.apache.commons.dbcp2.PoolingDriver;
import org.apache.commons.pool2.impl.GenericObjectPool;
import org.apache.commons.pool2.impl.GenericObjectPoolConfig;


public class DBCPInitListener implements ServletContextListener { // 웹 애플리케이션이 시작될때 호출
	
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		
		String poolConfig = sce.getServletContext().getInitParameter("poolConfig");
		
		Properties prop = new Properties();
		try {
			prop.load(new StringReader(poolConfig));
		} catch (IOException e) {
			System.out.println("config load failed : "+e.getMessage());
		}
		
		// jdbcdriver load
		loadJDBCDriver(prop);
		initConnectionPooling(prop);
	} // contextInitalized() end
	
	private void loadJDBCDriver(Properties prop) {
		String driver = prop.getProperty("jdbcdriver");
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			System.out.println("jdbc driver load failed : "+e.getMessage());
		}
	} // loadJDBCDriver() end
	
	private void initConnectionPooling(Properties prop) {
		String url = prop.getProperty("jdbcUrl");
		String user = prop.getProperty("dbUser");
		String pass = prop.getProperty("dbPass");
		
		ConnectionFactory connFactory = 
				new DriverManagerConnectionFactory(url, user, pass);
		PoolableConnectionFactory poolableConnectionFactory = 
				new PoolableConnectionFactory(connFactory, null);
		
		String validationQuery = prop.getProperty("validationQuery");
		if(validationQuery != null && !validationQuery.isEmpty()) {
			poolableConnectionFactory.setValidationQuery(validationQuery);
		}
		
		// Connection Pool 설정
		GenericObjectPoolConfig poolConfig = new GenericObjectPoolConfig();
		poolConfig.setTimeBetweenEvictionRunsMillis(1000L * 60 * 5L); // 하나 빼서 쓰면 5분지나면 닫게
		poolConfig.setTestWhileIdle(true);
		
		int minIdle = getIntProperty(prop, "minIdle", 5);
		poolConfig.setMinIdle(minIdle);
		
		int maxIdle = getIntProperty(prop, "maxIdle", 50);
		poolConfig.setMaxIdle(maxIdle);
		
		// Connection Pool 생성
		GenericObjectPool<PoolableConnection> connectionPool = 
				new GenericObjectPool<PoolableConnection>(poolableConnectionFactory, poolConfig);
		poolableConnectionFactory.setPool(connectionPool);
		
		// Connection Pool을 사용할 수 있는 드라이버 정보를 등록
		try {
			Class.forName("org.apache.commons.dbcp2.PoolingDriver");
			PoolingDriver driver = 
					(PoolingDriver) DriverManager.getDriver("jdbc:apache:commons:dbcp:");
			
			String poolName = prop.getProperty("poolName");
			driver.registerPool(poolName, connectionPool);
			
			
			
		} catch (Exception e) {
			throw new RuntimeException();
		}
		
		
	} // initConnectionPooling() end
	
	private int getIntProperty(Properties prop, String propName, int defaultValue) {
		String value = prop.getProperty(propName);
		if(value==null) return defaultValue;
		return Integer.parseInt(value);
	}

}
