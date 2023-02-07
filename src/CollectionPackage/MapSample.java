package CollectionPackage;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapSample {
	public static void main(String[] args) {
		HashMap<String, String> myMap = new HashMap<>();

		myMap.put("IN", "INDIA");
		myMap.put("US", "United State");
		myMap.put("UK", "United Kingdom");
		myMap.put(null, null);
		myMap.put("SNE", null);
		// myMap.put("UK", "UK");
		System.out.println("SIZe of map : " + myMap.size());

		System.out.println("get value by key : " + myMap.get("IN"));

		System.out.println("Contain key : " + myMap.containsKey("IN"));
		System.out.println("Contain value null : " + myMap.containsValue(null));
		// how iterate
		for (Map.Entry<String, String> map : myMap.entrySet()) {
			System.out.println(map.getKey() + " : " + map.getValue());
		}

		System.out.println("===================================");
		Hashtable<String, String> myTable = new Hashtable<>();

		myTable.put("IN", "INDIA");
		myTable.put("US", "United State");
		myTable.put("UK", "United Kingdom");
		
		for (Map.Entry<String, String> map : myTable.entrySet()) {
			System.out.println(map.getKey() + " : " + map.getValue());
		}

		
		System.out.println("===================================");
		LinkedHashMap<String, String> myLinked = new LinkedHashMap<>();

		myLinked.put("IN", "INDIA");
		myLinked.put("US", "United State");
		myLinked.put("UK", "United Kingdom");
		myLinked.put("AUS", "Australia");
		
		for (Map.Entry<String, String> map : myLinked.entrySet()) {
			System.out.println(map.getKey() + " : " + map.getValue());
		}
		
		System.out.println("===================================");
		TreeMap<String, String> treeMap = new TreeMap<>();
		treeMap.put("A", "Apple");
		
		treeMap.put("M", "Mango");
		treeMap.put("G", "Grapes");
		for(Map.Entry<String, String> map : treeMap.entrySet()){
			System.out.println(map.getKey()+" : "+map.getValue());
		}
		
		
	}
}
