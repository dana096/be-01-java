package day10_API.stringBuffer;

public class MainEntry {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer(); //초기용량 16
		
		System.out.println("주소: "+sb.hashCode());
		System.out.println("length  /  capacity");
		System.out.println(sb.length() + "      /      " + sb.capacity());
		System.out.println("------------------------------------");
		
		sb.append("encore");
		System.out.println(sb.length() + "      /      " + sb.capacity());
		System.out.println("------------------------------------");
		
		sb.append("123456789000");
		System.out.println(sb.length() + "      /      " + sb.capacity());
		System.out.println("------------------------------------");
		
		sb.append("123456789000 00000000000000000000000000000000");
		System.out.println(sb.length() + "      /      " + sb.capacity());
		System.out.println("------------------------------------");
		
		
		sb.trimToSize(); //자기가 가진 글자 수 사이즈에 맞춰서 재조정
		System.out.println("-----------------조정---------------");
		System.out.println(sb.length() + "      /      " + sb.capacity());
		System.out.println("------------------------------------");
		System.out.println("주소: "+sb.hashCode());
	}
}
