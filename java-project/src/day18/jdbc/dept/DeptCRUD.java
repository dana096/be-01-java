package day18.jdbc.dept;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DeptCRUD {
	
	static Scanner sc = new Scanner(System.in);
	static Connection conn;
	
	public static void main(String[] args) {
		// 구현하기
		try {
			while (true) {
				menu();
				int su = sc.nextInt();
				
				try {
					switch (su) {
					case 0:
						selectAll();
						break;
					case 1:
						System.out.println("INPUT DEPTNO >> ");
						selectByGno(sc.nextInt());
						break;
					case 2:
						System.out.println("INPUT DEPTNO >> ");
						insert(sc.nextInt());
						selectAll();
						break;
					case 3:
						System.out.println("INPUT DEPTNO >> ");
						update(sc.nextInt());
						break;
					case 4:
						delete();
						break;
					case 5:
						System.out.println("PROGRAM EXIT!!!");
						conn.close();
						System.exit(0);
						break;
					default:
						System.out.println("\nERROR!! ONE MORE SELECT PLEASE~");
						break;
					}
				} catch (Exception e) {
					System.out.println("ERROR!!! EXIT!!!");
				}
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// 연결 메소드
	public static void Connection() throws ClassNotFoundException, SQLException {
		System.out.println("LOADING....");
		Class.forName("org.mariadb.jdbc.Driver"); // exception
		String url = "jdbc:mariadb://localhost:3306/sampledb";
		String uid = "root";
		String pwd = "maria";
		conn = DriverManager.getConnection(url, uid, pwd);
	}
	
	// selectAll()
	public static void selectAll() throws ClassNotFoundException, SQLException {
		Connection();
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM DEPT"); // cmd+shift+x :대문자

		System.out.println("DEPTNO\tDNAME\tLOC");
		while (rs.next()) {
			int DEPTNO = rs.getInt(1);
			String DNAME = rs.getString("DNAME");
			String LOC = rs.getString("LOC");

			System.out.println(DEPTNO + "\t" + DNAME + "\t" + LOC);
		} // while end

		conn.commit();
	}
	
	// selectByGno()
	public static void selectByGno(int DEPTNO) throws ClassNotFoundException, SQLException {
		Connection();
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM DEPT WHERE deptno = " + DEPTNO);

		System.out.println("DEPTNO\\tDNAME\\tLOC");
		while (rs.next()) {
			DEPTNO = rs.getInt(1);
			String DNAME = rs.getString("DNAME");
			String LOC = rs.getString("LOC");

			System.out.println(DEPTNO + "\t" + DNAME + "\t" + LOC);
		}

		conn.commit();
	}
	
	// insert()
	public static void insert(int DEPTNO) throws ClassNotFoundException, SQLException {
		Connection();
		String sql = "INSERT INTO DEPT VALUES(" + DEPTNO + ", ?, ?)";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		System.out.println("DNAME / LOC 을 입력하세요 >> ");
		pstmt.setString(1, sc.next());
		pstmt.setString(2, sc.next());
		pstmt.executeUpdate();

		conn.commit();
		System.out.println("INSERT SUCCESS!!!");
		
	}
	
	// update()
	public static void update(int DEPTNO) throws ClassNotFoundException, SQLException {
		Connection();
		System.out.println("select NO. : 1.DEPTNO/2.DNAME/3.LOC");
		String option, value, sql;
		int su = sc.nextInt();
		
		switch (su) {
		case 1:
			option = "DEPTNO";
			System.out.println("INPUT DEPTNO >> ");
			value = sc.next();
			break;
		case 2:
			option = "DNAME";
			System.out.println("INPUT DNAME >> ");
			value = sc.next();
			break;
		case 3:
			option = "LOC";
			System.out.println("INPUT LOC >> ");
			value = sc.next();
			break;
		default:
			System.out.println("INPUT ERROR!! ");
			return;
		}

		if (su == 2) {
			sql = "UPDATE DEPT SET " + option + " = '" + value + "' WHERE DEPTNO = " + DEPTNO;
		} else {
			sql = "UPDATE DEPT SET " + option + " = " + value + " WHERE DEPTNO = " + DEPTNO;
		}

		System.out.println(sql.toString());

		PreparedStatement stmt = conn.prepareStatement(sql);
		stmt.executeUpdate();

		conn.commit(); // 커밋 완료
		System.out.println("UPDATE SUCCESS!!!");
	}
	
	// delete()
	public static void delete() throws ClassNotFoundException, SQLException {

		Connection();

		System.out.println("INPUT DEPTNO >> ");
		int DEPTNO = sc.nextInt();
		Statement stmt = conn.createStatement();
		String sql = "DELETE FROM DEPT WHERE DEPTNO =  " + DEPTNO;

		System.out.println(sql.toString()); // qurey문 출력하기
		ResultSet rs = stmt.executeQuery(sql);

		System.out.println("DELETE SUCCESS!!!");
		conn.commit();

	}
	
	// exit()
	
	// menu()
	public static void menu() {
		System.out.println("0.전체조회 1.선택조회 2.추가 3.수정 4.삭제 5.exit ");
	}
}
