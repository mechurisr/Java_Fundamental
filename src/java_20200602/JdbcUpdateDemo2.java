package java_20200602;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcUpdateDemo2 {
	public static void main(String[] args) {
		
		try {
			Class.forName("org.mariadb.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		
	try {
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kpc", "kpc12", "kpc1234");
		StringBuffer sql = new StringBuffer();
		sql.append("UPDATE member ");
		sql.append("SET NAME = ?, addr = ? ");
		sql.append("WHERE num = ? ");
		pstmt = con.prepareStatement(sql.toString());
		
		int index = 0;
		pstmt.setString(++index, "");
		pstmt.setString(++index, "");
		pstmt.setInt(++index, 9);
		
		int resultCount = pstmt.executeUpdate();
		
		System.out.println("전송결과 : " + resultCount);
		
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} finally { 
		try {
			if(con != null) con.close();
			if(pstmt != null) pstmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
		
	}
}
