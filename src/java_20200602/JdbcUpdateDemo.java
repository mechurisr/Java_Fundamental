package java_20200602;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcUpdateDemo {
	
	public static void main(String[] args) {
		//1. 드라이버 로드
		try {
			Class.forName("org.mariadb.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			//2. 데이터 베이스 연결 => Connection 객체를 생성한다.
			//localhost : 데이터 베이스 설치 ip
			//3306 : 데이터 베이스 포트
			//kpc : 데이터베이스명
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kpc", "kpc12", "kpc1234");
			//3. SQL문을 전송할 수 있는 PreparedStatement 객체를 생성
			StringBuffer sql = new StringBuffer();
			sql.append("UPDATE member ");
			sql.append("SET NAME = ?, addr = ? ");
			sql.append("WHERE num = ? ");
			// sql문은 끝에 한칸씩 띄어놓는 것이 중요
			pstmt = con.prepareStatement(sql.toString());
			
			//4. 바인딩변수 처리
			
			int index = 0;
			pstmt.setString(++index, "샤넬2");
			pstmt.setString(++index, "프랑스2");
			pstmt.setInt(++index, 9);
			
			//5. SQL문 전송
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
