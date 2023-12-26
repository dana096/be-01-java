package day16.network.tcp03;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientTest { //소켓 1개 필요
	public static void main(String[] args) {
		Socket s = null;
		
		try {
			s = new Socket("192.168.0.22", 8888); // server ip & port number
			
			InputStream is = s.getInputStream(); //read
			OutputStream os = s.getOutputStream(); //write
			
			String str = "안녕하세요 ... Server님!!!(단아)";
			os.write(str.getBytes());
			
			byte[] buffer = new byte[100];
			is.read(buffer);
			System.out.println(new String(buffer));
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				s.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
