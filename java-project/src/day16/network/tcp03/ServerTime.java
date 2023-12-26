package day16.network.tcp03;

import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class ServerTime {
	public static void main(String[] args) {
		int port = 7000;
		
		try {
			System.out.println("Server Start!!");
			ServerSocket ss = new ServerSocket(port); //socket1
			
			while(true) {
				Socket s = ss.accept(); //socket2
				
				OutputStream os = s.getOutputStream();
				ObjectOutputStream oos = new ObjectOutputStream(os);
				
				oos.writeObject("수민컴" + new Date());
				oos.flush(); //버퍼비우기
				s.close();
			}			
		}catch(Exception e) {
			System.err.println(e.getMessage());
		}
	}
}
