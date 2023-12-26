package day17.network.chat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class TcpMultiChatClient {
	
	public static void main(String[] args) {
		
		if(args.length != 1) {  // 처음부터 이름을 받고 오겠다
			System.out.println("USAGE : java TcpMultiChatClient 대화명이 없습니다.");
			System.exit(0);
		}
		
		try {
			// ip주소와 포트번호를 바꾸면 해당하는 ip주소 사용자에게 채팅을 걸 수 있다
			String ip = "120.0.0.1";  // "120.0.0.1" = 내 컴퓨터 
			Socket s = new Socket(ip, 7777);
			System.out.println("서버에 연결되었습니다.");
			Thread sender = new Thread(new ClientSender(s, args[0]));
			Thread receiver = new Thread(new ClientReceiver(s));
			
			sender.start();
			receiver.start();
			
		} catch (Exception e) { e.printStackTrace(); }
		
	}  // main() end

	static class ClientSender extends Thread {  // Inner class
		Socket s;
		DataOutputStream dos;
		String name;
		
		public ClientSender(Socket s, String name) {
			this.s = s;
			try {
				dos = new DataOutputStream(s.getOutputStream());
				this.name = name;
			} catch (Exception e) { e.printStackTrace(); }
		}

		@Override
		public void run() {
			Scanner sc = new Scanner(System.in);  // 키보드로부터 입력 받기
			try {
				if(dos != null) dos.writeUTF(name);
				while(dos != null) dos.writeUTF("[" + name + "]" + sc.nextLine());
			} catch (Exception e) { e.printStackTrace(); }
		}
		
	}  // ClientSender class end
	
	static class ClientReceiver extends Thread {
		Socket s;
		DataInputStream dis;
		
		public ClientReceiver(Socket s) {
			this.s = s;
			try {
				dis = new DataInputStream(s.getInputStream());
			} catch (Exception e) { e.printStackTrace(); }
		}
		
		@Override
		public void run() {
			while(dis != null) {
				try {
					System.out.println(dis.readUTF());
				} catch (Exception e) { e.printStackTrace(); }
			}
		}
	}  // ClientReceiver class end
}
