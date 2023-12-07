package day14.IO.fileEx;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileEx {
	public static void main(String[] args) throws FileNotFoundException, IOException {

		RandomAccessFile raf = new RandomAccessFile("sawon.txt", "rw");
//		RandomAccessFile raf = new RandomAccessFile("C:\\Dell\\sawon.txt", "r");

		for (int i = 0; i <= 10; i++) {

			raf.seek(i * 100);  // seek() : 원하는 위치를 지정함
			String str = "hello";
			raf.writeUTF(str + " " + i);
//			raf.writeInt(i);  // 쓰기 (숫자)
		}

		for (int i = 0; i <= 10; i++) {

			raf.seek(i * 100); // 예외발생
//			System.out.println(raf.readInt());  // 읽기 (숫자)
			System.out.println(raf.readUTF());
		}

		System.out.println("string print seccess!!!");
		raf.close();
	}
}
