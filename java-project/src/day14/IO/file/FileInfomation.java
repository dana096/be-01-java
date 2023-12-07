package day14.IO.file;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileInfomation {
	public static void main(String[] args) throws IOException {
		
		File file = null;
		byte[] fileName = new byte[100];
		String strName;
		System.out.println("file name = ");  // 상대경로 - memo.txt : 같은 경로에 있을 때, 파일이름(+확장자명)만 적어서 불러옴
		                                     // 절대경로 - C:\Users\playdata\git\be-01-java-local\be-01-java\java-project\파일명.확장자
		
		System.in.read(fileName);  // 예외발생
		strName = new String(fileName).trim();  // 위에서 읽어냄, 파일 이름 문자열 반환
		
		file = new File(strName);
		
		System.out.println("절대경로 : " + file.getAbsolutePath());
		System.out.println("표준경로 : " + file.getCanonicalPath());
		System.out.println("최종수정일 : " + new Date(file.lastModified()));
		System.out.println("파일크기 : " + file.length());
		System.out.println("읽기속성 : " + file.canRead());
		System.out.println("쓰기속성 : " + file.canWrite());
		System.out.println("파일경로 : " + file.getPath());
		System.out.println("숨김속성 : " + file.isHidden());
	}
}
