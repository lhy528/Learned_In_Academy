package spring_app06_maven;

import java.sql.Connection;

public class MysqlDAO implements CommonDAO{
	
	@Override
	public Connection connect() {
		return MyConnection.getInstance().getConnection();
	}

	@Override
	public void selectAll() {
		System.out.println("전부다 출력됨!");
	}
	
}
