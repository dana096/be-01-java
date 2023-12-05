package day12.collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

// Map =  key / value 한쌍으로 처리, (set + list)
public class HashMapEx4{
	
	public static void main(String[] args) {
		String[] data = { "A", "K", "A", "K", "D", "K", "A", "K", "K", "K", "Z", "D" };
		
		HashMap map = new HashMap();  // <TypeParameter>는 wrapper class type만 들어간다(기본 자료형 x)
		
		for (int i = 0; i < data.length; i++) {
			
			if (map.containsKey(data[i])) {
				Integer value = (Integer)map.get(data[i]);
				
				map.put(data[i], new Integer(value.intValue() + 1));
			} else {
				map.put(data[i], new Integer(1));
			}  // if end
		}  // for end
		
		Iterator it = map.entrySet().iterator();
		
		while (it.hasNext()) {
			Map.Entry entry = (Map.Entry)it.next();
			int value = ((Integer)entry.getValue()).intValue();
			System.out.println(entry.getKey() + " : " + prinBar('#', value) + " " + value);
		}
	}  // main end

	private static Object prinBar(char ch, int value) {
		char[] bar  =new char[value];
		
		for (int i = 0; i < bar.length; i++) {
			bar[i] = ch;
		}
		return new String(bar);  // String(char[] chArr)
	} 
	
}
