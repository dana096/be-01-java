package day18.jdbc.mvc.connUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/*
 if( rs != null ) try { rs.close() } catch ( SQLException e ) { e.printStackTrace(); }
 if( stmt != null ) try { stmt.close() } catch ( SQLException e ) { e.printStackTrace(); }
 if( connection != null ) try { connection.close() } catch ( SQLException e ) { e.printStackTrace(); }
 */

public class CloseHelper {
	
	public static void close(Connection conn) {
		if( conn != null ) {
			try {
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();  // 니가 알아서 해줘
			}
		}
	}
	
	public static void close(Statement stmt) {
		if( stmt != null ) {
			try {
				stmt.close();
			} catch (Exception e) {
				e.printStackTrace();  // 니가 알아서 해줘
			}
		}
	}
	
	public static void close(PreparedStatement pstmt) {
		if( pstmt != null ) {
			try {
				pstmt.close();
			} catch (Exception e) {
				e.printStackTrace();  // 니가 알아서 해줘
			}
		}
	}
	
	public static void close(ResultSet rs) {
		if( rs != null ) {
			try {
				rs.close();
			} catch (Exception e) {
				e.printStackTrace();  // 니가 알아서 해줘
			}
		}
	}

}
