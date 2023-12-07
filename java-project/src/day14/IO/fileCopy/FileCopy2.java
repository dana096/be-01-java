package day14.IO.fileCopy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

//byte단위 복사하기
public class FileCopy2 {
	public static void main(String[] args) throws Exception {  // 예외처리 위임
		// 읽기 객체 - FileInputStream
		InputStream is = new FileInputStream("kim2.jpg");
		
		// 쓰기 객체 - FilOutputStream 
		OutputStream os = new FileOutputStream("kimyuna.jpg");
		
		byte[] buffer = new byte[1024*8];
		
		long start = System.currentTimeMillis();
		
		while(true) {
			int inputData = is.read(buffer); // buffer 크기만큼 읽어들임
			if(inputData == -1) break;
			os.write(buffer, 0, inputData);
	    } // while end
		
		long end = System.currentTimeMillis();
		
		System.out.println(end - start);  // 복사(작업)에 걸린 시간
		is.close();
		os.close();
		System.out.println("copy success!!!");
	}
}
