package day18.jdbc.gift;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class Giftdelete {
	public static void main(String[] args) throws Exception {
		
				Scanner sc = new Scanner(System.in);
		
				Class.forName("org.mariadb.jdbc.Driver");
				
				Connection conn = DriverManager.getConnection(
									"jdbc:mariadb://localhost:3306/sampledb",
									"root", "maria");
				
				//3. SQL 사용 (DML - Delete) = PreparedStatement
				System.out.println("Gift Table delete number : gno = ");
				String sql = "DELETE FROM gift WHERE GNO = ?";
				PreparedStatement pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, sc.nextInt());
				
				int result = pstmt.executeUpdate();  // 반환값이 없는 경우 - insert, update, delete
				
				System.out.println(result + " 개 데이터 삭제 성공함.");
				conn.commit();  // 커밋 완료
				
				//4. 닫기 (자원반환)
				pstmt.close();     conn.close();
				
	}
}
