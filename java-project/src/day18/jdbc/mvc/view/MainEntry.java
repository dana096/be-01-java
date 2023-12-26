package day18.jdbc.mvc.view;

import java.sql.SQLException;

import day18.jdbc.mvc.controller.GiftController;

public class MainEntry {  // view
	
	public static void main(String[] args) throws SQLException {
		
		GiftController.connect();  // DB 연결
		GiftController.menu();  // 메뉴 호출
		
	}

}
