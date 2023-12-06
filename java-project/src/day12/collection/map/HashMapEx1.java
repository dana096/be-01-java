package day12.collection.map;

import java.util.HashMap;
import java.util.Scanner;

// Map =  key / value 한쌍으로 처리, (set + list)
public class HashMapEx1 {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		
		map.put("encore", "1234");  // id, password
		map.put("kosa", "1111");
		map.put("kingsmile", "1234"); 
//		map.put("encore", "1004");
		
		System.out.println(map);
		System.out.println("요소개수 : " + map.size());  // 3 : key 중복 허용 안됨
		
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("id와 password를 입력해주세요.");
			System.out.print("id : ");           String id = sc.nextLine().trim();
			System.out.print("password : ");     String pwd = sc.nextLine().trim();
			System.out.println();
			
			if ( !map.containsKey(id) ) {
				System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요. ");
				continue;
			} else {
				if ( !(map.get(id).equals(pwd)) ) {
					System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
				} else {
					//System.out.println("id와 password가 일치합니다. ");
					System.out.println(id + "님 반갑습니다.");
					break;
				}
			}  // out if end
			
		}  // while end
		
	}
}
