package day16.network.tcp02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class URLEx2 {
	public static void main(String[] args) throws MalformedURLException, IOException {
		
		URL url = new URL("https://www.google.com/search?q=%EA%B9%80%EC%97%B0%EC%95%84&sca_esv=589698990&hl=ko&sxsrf=AM9HkKkzRtNYF_YaDU2Ms7G2xiTgLIlSRw%3A1702275655521&source=hp&ei=R6p2ZenIHf3S2roPm7GYiAs&iflsig=AO6bgOgAAAAAZXa4V65T9_DLsYF62AIDcngH4ulod0T7&oq=&gs_lp=Egdnd3Mtd2l6IgAqAggAMgcQIxjqAhgnMgcQIxjqAhgnMgcQIxjqAhgnMgcQIxjqAhgnMgcQIxjqAhgnMgcQIxjqAhgnMgcQIxjqAhgnMgcQIxjqAhgnMgcQIxjqAhgnMgcQIxjqAhgnSPAFUABYAHABeACQAQCYAQCgAQCqAQC4AQHIAQCoAgo&sclient=gws-wiz");

		System.out.println("프로토콜: " + url.getProtocol());
		System.out.println("호스트와 포트: " + url.getAuthority());
		System.out.println("호스트: " + url.getHost());
		System.out.println("포트: " + url.getPort());
		System.out.println("경로: " + url.getPath());
		System.out.println("질의: " + url.getQuery());
		System.out.println("파일명: " + url.getFile());
		System.out.println("참조: " + url.getRef());
		
	}
}
