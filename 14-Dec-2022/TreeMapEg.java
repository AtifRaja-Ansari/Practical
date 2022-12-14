package collection;
import java.util.*;
public class TreeMapEg {

		
		public static void main(String[] args) {
			TreeMap<Integer,String>map2 = new TreeMap<Integer,String>();
			map2.put(101, "Mango");
			map2.put(102, "Orange");
			map2.put(103, "Banana");
			map2.put(104, "Grapes");
			map2.put(105, "Banana");
		
			for (Map.Entry m : map2.entrySet()) { // for each loop
				System.out.println(m.getKey() + " " + m.getValue());
			}
			
			map2.putIfAbsent(102, "CustardApple");
			map2.putIfAbsent(102, "Watermelon");
			System.out.println("_______________________");
			for(Map.Entry m: map2.entrySet()){
			System.out.println(m.getKey()+" "+m.getValue());}
			
			map2.remove(103);
			System.out.println("_______________________");
			System.out.println("After Removal");
			for(Map.Entry m: map2.entrySet()){
				System.out.println(m.getKey()+" "+m.getValue());
				
			}
		}
}
