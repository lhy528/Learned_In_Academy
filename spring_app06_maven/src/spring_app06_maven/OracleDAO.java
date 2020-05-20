package spring_app06_maven;

import java.sql.Connection;

public class OracleDAO implements CommonDAO {
	/*
	 * public OracleDAO() { // 생성자를 통해 커넥션을 호출하면 dao를 new 호출 할 때마다 새로운 커넥션이 생긴다
	 * OracleXEConnection.getInstance().getConnection(); }
	 */

	@Override
	public Connection connect() {
		return OracleXEConnection.getInstance().getConnection();
	}

	@Override
	public void selectAll() {
		System.out.println("전부 다 출력했다~");
	}
}
