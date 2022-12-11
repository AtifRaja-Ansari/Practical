package collecion;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCompareEg {
	public static void main(String[] args) {
		List<String> al1 = new ArrayList<String>();//Creatina array list
		al1.add("Rose");//Add property of array
		al1.add("Sunflower");
		al1.add("Lily");
		al1.add("Daisy");
		al1.add("MariGold");
		al1.add("Tulip");
		al1.add("Jasmin");
		System.out.println(al1);
		List<String> al2 = new ArrayList<String>();//list 2
		al2.add("Rose");
		al2.add("Sunflower");
		al2.add("Lily");
		al2.add("Daisy");
		al2.add("MariGold");
		al2.add("Tulip");
		al2.add("Jasmin");
		System.out.println(al2);
		//compare array list
		boolean b = al1.equals(al2);
		System.out.println(b);
		al1.add("Red Rose");//add new element
		boolean b1 = al1.equals(al2);
		System.out.println(b1);
	}

}
