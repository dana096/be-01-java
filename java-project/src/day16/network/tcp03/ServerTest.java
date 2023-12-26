package day16.network.tcp03;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

//실습
public class ServerTest { //소켓 2개 필요
	public static void main(String[] args) {
		ServerSocket ss = null;
		Socket s = null;
		
		System.out.println("Server Start~~~");
		try {
			ss = new ServerSocket(9000); //0~1024번호는 예약되어 있음
			s = ss.accept(); // clinet socket, 응답대기
			
			InputStream is = s.getInputStream(); //read
			OutputStream os = s.getOutputStream(); //write
			
			
			byte[] arr = new byte[100];
			is.read(arr);
			System.out.println(new String(arr));
			
			String message = "안녕...Client...";
			os.write(message.getBytes());
			
		} catch (Exception e) {			e.printStackTrace();
		} finally {
			try {
				s.close();
				ss.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
