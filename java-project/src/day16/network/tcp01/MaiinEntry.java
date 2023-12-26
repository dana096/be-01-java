package day16.network.tcp01;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class MaiinEntry {
	public static void main(String[] args) {
//		String host = "127.0.0.1";
		String host = "192.168.0.22";
		
		
		try {
			InetAddress[] address = InetAddress.getAllByName(host);
			
			for(InetAddress item:address) {
				System.out.println(item);
				System.out.println(item.getHostName());
			}
		}catch(UnknownHostException e){
			e.printStackTrace();
			
		}
		
		
	}
}
