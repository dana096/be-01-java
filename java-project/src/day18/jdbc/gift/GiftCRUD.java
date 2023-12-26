package day18.jdbc.gift;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class GiftCRUD {

	static Scanner sc = new Scanner(System.in);
	static Connection conn;

	public static void main(String[] args) throws Exception {
		// 구현하기

		try {
			while (true) { // 무한루프 --> 탈출구문
				menu();
				int su = sc.nextInt();

				try {
					switch (su) {
					case 0:
						selectAll();
						break;
					case 1:
						System.out.println("조회하고 싶은 상품번호를 입력하세요.");
						selectByGno(sc.nextInt());
						break;
					case 2:
						System.out.println("추가하고 싶은 상품번호를 입력하세요.");
						insert(sc.nextInt());
						selectAll();
						break;
					case 3:
						System.out.println("수정하고 싶은 상품번호를 입력하세요.");
						update(sc.nextInt());
						break;
					case 4:
						System.out.println();
						delete();
						break;
					case 5:
						System.out.println("\n* 프로그램을 종료합니다.");
						conn.close();
						System.exit(0);
						break;
					default:
						System.out.println("\nerr)잘못입력하셨습니다. 다시 입력해주세요.");
					} // switch
				} catch (Exception e) {

				} // try catch
			} // while end
		} catch (Exception e) {
			System.out.println("err) 잘못 입력하셨습니다. 프로그램을 종료합니다.");
		} // try catch end

	} // main end

	// 연결 메소드
	public static void Connection() throws ClassNotFoundException, SQLException {
		System.out.println("로딩중....");
		Class.forName("org.mariadb.jdbc.Driver"); // exception
		String url = "jdbc:mariadb://localhost:3306/sampledb";
		String uid = "root";
		String pwd = "maria";
		conn = DriverManager.getConnection(url, uid, pwd);// exception
	}

	// selectAll()
	public static void selectAll() throws Exception {

		Connection();
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM GIFT"); // cmd+shift+x :대문자

		System.out.println("상품번호\t상품명\t최저가\t최고가");
		while (rs.next()) {
			int gno = rs.getInt(1);
			String gname = rs.getString("gname");
			int g_s = rs.getInt(3);
			int g_e = rs.getInt("g_end");

			System.out.println(gno + "\t" + gname + "\t" + g_s + "\t" + g_e);
		} // while end

		conn.commit();
		// rs.close(); stmt.close(); conn.close();
	}

	// selectByGno(int gno) <-
	public static void selectByGno(int gno) throws Exception {

		Connection();
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM GIFT WHERE gno = " + gno);

		System.out.println("상품번호\t상품명\t최저가\t최고가");
		while (rs.next()) {
			int gn = rs.getInt(1);
			String gname = rs.getString(2);
			int g_s = rs.getInt(3);
			int g_e = rs.getInt(4);

			System.out.println(gn + "\t" + gname + "\t" + g_s + "\t" + g_e);
		}

		conn.commit();

	}

	// update(int gno)
	public static void update(int gno) throws Exception {

		Connection();

		System.out.println("수정할 조건을 번호로 입력하세요 : 1.번호/2.상품이름/3.최저가/4.최고가");
		String option, value, sql;
		int su = sc.nextInt();

		switch (su) {
		case 1:
			option = "GNO";
			System.out.println("번호를 입력해주세요 >> ");
			value = sc.next();
			break;
		case 2:
			option = "GNAME";
			System.out.println("상품이름을 입력해주세요 >> ");
			value = sc.next();
			break;
		case 3:
			option = "G_START";
			System.out.println("최저가를 입력해주세요 >> ");
			value = sc.next();
			break;
		case 4:
			option = "G_END";
			System.out.println("최고가를 입력해주세요 >> ");
			value = sc.next();
			break;
		default:
			System.out.println("input error!! ");
			return;
		}

		if (su == 2) {
			sql = "UPDATE GIFT SET " + option + " = '" + value + "' WHERE gno = " + gno;
		} else {
			sql = "UPDATE GIFT SET " + option + " = " + value + " WHERE gno = " + gno;
		}

		System.out.println(sql.toString());

		PreparedStatement stmt = conn.prepareStatement(sql);
		stmt.executeUpdate();

		conn.commit(); // 커밋 완료
		System.out.println("수정 완료!!!");

	}

	// delete(int gno)
	public static void delete() throws Exception {

		Connection();

		System.out.println("상품번호를 입력해주세요 >> ");
		int gno = sc.nextInt();
		Statement stmt = conn.createStatement();
		String sql = "DELETE FROM gift WHERE gno =  " + gno;

		System.out.println(sql.toString()); // qurey문 출력하기
		ResultSet rs = stmt.executeQuery(sql);

		System.out.println(gno + "번 삭제 완료!!!");
		conn.commit();

	}

	// insert()
	public static void insert(int gno) throws Exception {

		Connection();

		String sql = "INSERT INTO GIFT VALUES(" + gno + ", ?, ?, ?)";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		System.out.println("상품명 / 최저가 / 최고가 를 입력하세요 >> ");
		pstmt.setString(1, sc.next());
		pstmt.setInt(2, sc.nextInt());
		pstmt.setInt(3, sc.nextInt());
		pstmt.executeUpdate();

		conn.commit();
		System.out.println("추가 완료!!!");
	}

	// exit() <-

	// menu() <-
	public static void menu() {
		System.out.println("0.전체조회 1.선택조회 2.추가 3.수정 4.삭제 5.exit ");
	}

}
