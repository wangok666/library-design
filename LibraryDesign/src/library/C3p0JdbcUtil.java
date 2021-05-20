package library;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class C3p0JdbcUtil {

	private static ComboPooledDataSource ds = null;
	
	static {
		try {
			ds = new ComboPooledDataSource("MySQL");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection() throws SQLException{
		return ds.getConnection();
	}
	
	public static void release(Connection conn, Statement st, ResultSet rs) {
		if(rs!=null) {
			try {
				rs.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
			rs=null;
		}
		if(st!=null) {
			try {
				st.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
			st=null;
		}
		if(conn!=null) {
			try {
				conn.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
			conn=null;
		}
	}
	
}
