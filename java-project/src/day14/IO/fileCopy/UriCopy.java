package day14.IO.fileCopy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class UriCopy {
	public static void main(String[] args) 
						throws MalformedURLException, IOException { // 예외처리 위임
		
		URL url = new URL("https://www.google.com/images/branding/googlelogo/1x/googlelogo_color_272x92dp.png");
		
		// 읽기 객체 - FileInputStream
		InputStream is = url.openStream();  // 통로 연결
				
	    // 쓰기 객체 - FilOutputStream 
	    OutputStream os = new FileOutputStream("google.jpg");  // 상대경로
	    
	    byte[] buffer = new byte[1024*8];  // 1024*8 사이즈의 버퍼 가져오기
	    
	    while(true) {
	    	int inputData = is.read(buffer);  // 버퍼 사이즈만큼 읽고
	    	if(inputData == -1) break;
	    	os.write(buffer, 0, inputData);  // 버퍼 사이즈만큼 쓴다
	    }
	    
	    is.close();     os.close();
	    System.out.println("웹에서 파일 복사 성공했습니다.");
	}
}

