package day17.jdbc.jdbcTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MainEntry {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {  // 예외처리 위임
		
		//1. Driver load..... exception 발생
		Class.forName("org.mariadb.jdbc.Driver");
		System.out.println("driver load success!!!");
		
		//2. Connection & Open
					// driver:IP:portNumber/DBName
		String url = "jdbc:mariadb://localhost:3306/sampledb";  // localhost 대신 127.0.0.1 or 192.168.0.50 도 사용 가능 // SQL 자신의 계정에 있는 db명
		String uid = "root";  // SQL 본인 계정명
		String pwd = "maria"; // SQL 본인 계정 비밀번호
		
		Connection conn = DriverManager.getConnection(url, uid, pwd);
		System.out.println("connection success!!!");
		
		//3. SQL 사용 (DML 명령어)
		
		//4. 닫기 (자원 반환)
	}
}
