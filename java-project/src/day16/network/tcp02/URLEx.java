package day16.network.tcp02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class URLEx {
	public static void main(String[] args) throws MalformedURLException, IOException {
		
		URL encore = new URL("https://www.en-core.com");
//		URL google = new URL("https://www.google.com");
		
		// System im : 표준 입력 - 키보드로부터...
		BufferedReader br = new BufferedReader(new InputStreamReader(encore.openStream()));
//		BufferedReader br = new BufferedReader(new InputStreamReader(google.openStream()));
		
		String inputLine;
		while((inputLine = br.readLine())!= null) {
			System.out.println(inputLine);
		}
		
		br.close();
	}
}
