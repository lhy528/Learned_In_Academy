package main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import connection.OracleXEConnection;

public class TestMain {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		ResultSet rs = null;
		PreparedStatement pstmt = null;
		Connection conn = null;
		conn = OracleXEConnection.getInstance().getConnection();
		
		System.out.println(conn);
	}
}
