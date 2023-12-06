package quiz.Video.verMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import quiz.Video.verMap.Video;

public class VideoManager extends Video {  // controller
	HashMap<Integer, Video> map = new HashMap<Integer, Video>();
	static String title;
	static String category;
	static String lend;
	static String lendName;
	static String lendDate;
	
	VideoManager() {		
	}

//	VideoManager(String title, String category, String lend, String lendName, String lendDate) {
//		
//		HashMap group = (HashMap)map.get(title);
//		map.put(title, category);
//	}
//	
//	public static void addVideoNo(String title, String category, String lend, String lendName, String lendDate) {
//		Video v = new Video(title, category, lend, lendName, lendDate);
//		map.put(title, new HashMap<Integer, Video>());
//
//	}

}
