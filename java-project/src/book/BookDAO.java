package book;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import ConnUtil.CloseHelper;
import ConnUtil.ConnectionSingletonHelper;

public class BookDAO {

	static Statement stmt = null;
	static ResultSet rs = null;
	static Connection conn = null;
	static PreparedStatement pstmt = null;

	public BookDAO() {
		conn = ConnectionSingletonHelper.getConnection("mariadb");
	}

	// 도서 전체 조회
	public List<BookVO> selectAll() throws SQLException {
		ArrayList<BookVO> list = new ArrayList<>();
		BookVO vo = null;

		try {
			// 작업 객체 생성
			stmt = conn.createStatement();

			// 쿼리문 준비 - select
			String sql = "SELECT * FROM BOOK";

			// 실행 및 리턴
			rs = stmt.executeQuery(sql);

			ResultSetMetaData rsmd = rs.getMetaData();
			int count = rsmd.getColumnCount(); // db 테이블의 필드 갯수

			while (rs.next()) {

				vo = new BookVO();

				vo.setBookId(rs.getInt("bookId"));
				vo.setCategory(rs.getString("category"));
				vo.setWriter(rs.getString("writer"));
				vo.setTitle(rs.getString("title"));
				vo.setPrice(rs.getInt("price"));
				vo.setStock(rs.getInt("stock"));
				vo.setSales(rs.getInt("sales"));
				vo.setPublishDate(rs.getDate("publishDate"));
				vo.setPublisher(rs.getString("publisher"));

				list.add(vo);

			} // while end

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// 닫기 (자원 반환)
			CloseHelper.close(rs);
			CloseHelper.close(stmt);
			CloseHelper.close(conn);
		}
		return list;
	}

	// 도서코드로 도서 조회
	public BookVO selectBybookId(int bookId) throws SQLException {
		BookVO vo = new BookVO();

		// 쿼리문 준비 - select
		String sql = "SELECT * FROM BOOK WHERE bookId = ?";

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, bookId);
			rs = pstmt.executeQuery();

			ResultSetMetaData rsmd = rs.getMetaData();
			int count = rsmd.getColumnCount();

			while (rs.next()) {

				vo.setBookId(rs.getInt("bookId"));
				vo.setCategory(rs.getString("category"));
				vo.setWriter(rs.getString("writer"));
				vo.setTitle(rs.getString("title"));
				vo.setPrice(rs.getInt("price"));
				vo.setStock(rs.getInt("stock"));
				vo.setSales(rs.getInt("sales"));
				vo.setPublishDate(rs.getDate("publishDate"));
				vo.setPublisher(rs.getString("publisher"));

			} // while end

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// 닫기 (자원 반환)
			CloseHelper.close(rs);
			CloseHelper.close(stmt);
			CloseHelper.close(conn);
		}
		return vo;
	}

	// 도서 추가
	public int insertBook(BookVO vo) throws SQLException {

		int result = 0;

		// 쿼리문 준비 - insert
		String sql = "INSERT INTO BOOK VALUES( ?, ?, ?, ?, ?, ?, ?, ?, ? )";

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, vo.getBookId());
			pstmt.setString(2, vo.getCategory());
			pstmt.setString(3, vo.getWriter());
			pstmt.setString(4, vo.getTitle());
			pstmt.setInt(5, vo.getPrice());
			pstmt.setInt(6, vo.getStock());
			pstmt.setInt(7, vo.getSales());
			pstmt.setDate(8, vo.getPublishDate());
			pstmt.setString(9, vo.getPublisher());

			result = pstmt.executeUpdate();
			if (result > 0) {
				conn.commit();
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// 닫기 (자원 반환)
			CloseHelper.close(pstmt);
			CloseHelper.close(conn);
		}
		return result;
	}

	// 도서 정보 수정
	public int updateBook(BookVO vo) throws SQLException {

		int result = 0;

		// 쿼리문 준비 - update
		String sql = "UPDATE BOOK SET VALUES( ?, ?, ?, ?, ?, ?, ?, ?, ? ) WHERE bookId = ?";

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, vo.getBookId());
			pstmt.setString(2, vo.getCategory());
			pstmt.setString(3, vo.getWriter());
			pstmt.setString(4, vo.getTitle());
			pstmt.setInt(5, vo.getPrice());
			pstmt.setInt(6, vo.getStock());
			pstmt.setInt(7, vo.getSales());
			pstmt.setDate(8, vo.getPublishDate());
			pstmt.setString(9, vo.getPublisher());

			result = pstmt.executeUpdate();
			if (result > 0) {
				conn.commit();
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// 닫기 (자원 반환)
			CloseHelper.close(pstmt);
			CloseHelper.close(conn);
		}
		return result;
	}

	// 도서코드로 도서 삭제
	public int deleteBook(int bookId) throws SQLException {

		int result = 0;

		// 쿼리문 준비 - delete
		String sql = "DELETE FROM BOOK WHERE bookId = ?";

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, bookId);

			result = pstmt.executeUpdate();
			if (result > 0) {
				conn.commit();
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// 닫기 (자원 반환)
			CloseHelper.close(pstmt);
			CloseHelper.close(conn);
		}
		return result;
	}

}