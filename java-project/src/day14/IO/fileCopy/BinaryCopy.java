package day14.IO.fileCopy;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BinaryCopy {
	public static void main(String[] args) {
//		File src = new File("C:/Windows/explorer.exe");  //절대경로
//		File dist = new File("C:\\Users\\playdata\\git\\be-01-java-local\\be-01-java\\java-project\\expCopy.dat"); 
		
		File src = new File("C:/Users/playdata/Pictures/yuna.jpg");  //절대경로
		File dist = new File("C:\\Users\\playdata\\git\\be-01-java-local\\be-01-java\\java-project\\yuna.jpg"); 
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		int c;
		
		try {
			fis = new FileInputStream(src);  // 파일입력바이트 스트림 연결
			fos = new FileOutputStream(dist);  // 파일출력바이트 스트림 연결
			bis = new BufferedInputStream(fis);  // 버퍼 출력스트림 연결
			bos = new BufferedOutputStream(fos);  // 버퍼 입력스트림 연결
			
			while((c = bis.read()) != -1) {
				bos.write((char)c);
			}
			
			System.out.println("파일 복사 성공!!!");
			bis.close(); // 작은 것부터 닫기
			bos.close();
			fis.close();
			fos.close();
			
		} catch (Exception e) {
			System.out.println("파일 복사 오류 발생!!!");
//			e.printStackTrace();
		}
	}
}
