package spring_app06_maven;

import java.sql.Connection;

public interface CommonDAO {
	public Connection connect();
	public void selectAll(); // 원래라면 ArrayList 등으로 리턴받아야 하는 곳 > 지금은 void처리
}
