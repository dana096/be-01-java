package day14.IO.fileCopy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopy {
	public static void main(String[] args) throws Exception {  // 예외처리 위임
		// 읽기 객체 - FileInputStream
		InputStream is = new FileInputStream("kim2.jpg");
		
		// 쓰기 객체 - FilOutputStream 
		OutputStream os = new FileOutputStream("C:/Dell/kim3.jpg");
		
		long start = System.currentTimeMillis();  // long 타입을 사용한 이유는 System.currentTimeMillis()가 long타입이기 때문
		
		while(true) {
			int inputData = is.read();
			if(inputData == -1) break;
			os.write(inputData);
	    } // while end
		
		long end = System.currentTimeMillis();
		
		System.out.println(end - start);  // 복사(작업)에 걸린 시간
		is.close();
		os.close();
		System.out.println("copy success!!!");
	}
}
