/**
 * SortHashMap
 * 
 */
package com.java.test;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.Set;

/**
 * @author Chuck
 *
 */
public class SortHashMap {

	/**
	 * @param args
	 */
	public static void main(String... args) {
		
	        System.out.println("Before Sorting:");

	        HashMap<Integer, String> hmap = new HashMap<Integer, String>();
	        hmap.put(11, "Charlie");
	        hmap.put(4, "Zulu");
	        hmap.put(77, "Yankee");
	        hmap.put(5, "Alpha");
	        hmap.put(9, "Papa");
	        hmap.put(66, "Quebec");
	        hmap.put(0, "Romeo");
	        
	        Set<Map.Entry<Integer, String>> set = hmap.entrySet();
	        
	        for (Map.Entry<Integer, String> entry : set) {
	              System.out.println(entry.getKey() + ": " + entry.getValue());
	        }
	        
	        System.out.println("After Sorting:");
	        
	        Map<Integer, String> map = new TreeMap<Integer, String>(hmap);
	        set = map.entrySet();
	
	        for (Map.Entry<Integer, String> entry : set) {
	            System.out.println(entry.getKey() + ": " + entry.getValue());
	        }
	}
}
