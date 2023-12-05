package day10_API.object;

class Point {   }

public class MainEntry {
	public static void main(String[] args) {
		Point pt = new Point();
		System.out.println("*****Point pt information*****");
		System.out.println("class name : " + pt.getClass());
		System.out.println("hash code : " + pt.hashCode());  // 1521118594
		System.out.println("Object String : " + pt.toString());  // 5aaa6d82
		System.out.println("Object String : " + pt);  // toString() 생략 가능
		System.out.printf("10진수 %d\n", 0x5aaa6d82);  // 숫자(10진수), 0숫자(8진수), 0x숫자(16진수)
		System.out.println("===============================================");
		
		// 다른 객체를 생성하면 다른 주소에 저장됨
		Point pt2 = new Point();
		System.out.println("*****Point pt information*****");
		System.out.println("class name : " + pt2.getClass());
		System.out.println("hash code : " + pt2.hashCode());  // 706277948
		System.out.println("Object String : " + pt2.toString());  // 2a18f23c
		System.out.println("Object String : " + pt2); 
		
		System.out.println("pt.toString() : toString()의 의미 = day10_API.object.Point@2a18f23c ");
		System.out.println(pt2.getClass().getName()+'@'+Integer.toHexString(pt2.hashCode()));
		
		Point pt3 = new Point();
		if (pt.hashCode() == pt3.hashCode()) {
			System.out.println("same");
		} else {
			System.out.println("not same");
		}
		
		Point pt4;
		pt4 = pt;  // 성립되어 pt와 pt4는 같은 주소를 갖게됨
		if (pt.hashCode() == pt4.hashCode()) {
			System.out.println("same");
		} else {
			System.out.println("not same");
		}
		
		System.out.println(pt.hashCode() + ", " + pt4.hashCode());
	} 

}
