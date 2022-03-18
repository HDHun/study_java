package com.urdomain.lecture.ch15;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample1 {
	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<String,Integer>();
		
		map.put("신용권",85);
		map.put("홍길동",90);
		map.put("동장군",80);
		map.put("홍길동",95);
		System.out.println("총 Entry 수 :" + map.size());
		
		System.out.println("\t홍길동 :" + map.get("홍길동"));
		System.out.println();
		
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println("\t" + key + ":" + value);
		}
		System.out.println();
		
		map.remove("홍길동");
		System.out.println("총 Entry 수 :" + map.size());
		
		
		
		
		
		Map<String, Integer> map2 = new LinkedHashMap<String,Integer>();
		map2.put("신용권",85);
		map2.put("동장군",80);
		map2.put("홍길동",90);
		Set<String> keySet2 = map2.keySet();
		Iterator<String> keyIterator2 = keySet2.iterator();
		while(keyIterator2.hasNext()) {
			String key = keyIterator2.next();
			Integer value = map2.get(key);
			System.out.println("\t" + key + ":" + value);
		}
		
		
		
		
		
		
		
	}
}
