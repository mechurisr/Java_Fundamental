package practiceNote;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PracDao {
	
private static PracDao dao;

	public static PracDao getInstance() {
		if (dao == null) {
			dao = new PracDao();
		}
		return dao;
	}
private PracDao() {
	try {
		Class.forName("org.mariadb.jdbc.Driver");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
		}

public int insert(PracDto e) {
	int resultCount = 0;
	Connection con = null;
	PreparedStatement pstmt = null;
	
	try {
		con = DriverManager.getConnection(
			"jdbc:mysql://localhost/kpc", "kpc12", "kpc1234");
		StringBuffer sql = new StringBuffer();
		sql.append("INSERT INTO emp (empno, ename, job, mgr, ");
		sql.append("hiredate, sal, comm, deptno) VALUES ");
		sql.append("(?, ?, ?, ?, CURDATE(), ?, ?, ?)");
		
		pstmt = con.prepareStatement(sql.toString());
		
		int index = 0;
		pstmt.setInt(++index, e.getNo());
		pstmt.setString(++index, e.getName());
		pstmt.setString(++index, e.getJob());
		pstmt.setInt(++index, e.getMgr());
		pstmt.setInt(++index, e.getSal());
		pstmt.setInt(++index, e.getComm());
		pstmt.setInt(++index, e.getDeptNo());
		
		resultCount = pstmt.executeUpdate();
	} catch (SQLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
		
		
	}
	return resultCount;

	
	}

}
