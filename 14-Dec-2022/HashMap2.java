package collection;
import java.util.*;
//keys &values
public class HashMap2 {
	
	public static void main(String[] args) {
		HashMap<Integer,String>map = new HashMap<Integer,String>();
		map.put(101, "Mango");
		map.put(102, "Orange");
		map.put(103, "Banana");
		map.put(104, "Grapes");
		map.put(105, "Chiku");
		map.put(null, "null");
		map.put(102, "null");
		map.put(null, "null");
		for(Map.Entry m: map.entrySet()){
		System.out.println(m.getKey()+" "+m.getValue());}
		System.out.println("_______________________");
		map.putIfAbsent(102, "CustardApple");
		map.putIfAbsent(102, "Watermelon");
		for(Map.Entry m: map.entrySet()){
		System.out.println(m.getKey()+" "+m.getValue());}
		//key
		System.out.println("Keys:"+map.keySet());
		//value
		System.out.println("Values: "+map.values());
		//key-value
		System.out.println("keys & values: "+map.entrySet());
		map.remove(103);
		System.out.println("After Removal");
		for(Map.Entry m: map.entrySet()){
			System.out.println(m.getKey()+" "+m.getValue());
			
		}
	}
}
