//we can take no. of arguments
package practical;

public class Varargs {
	static void show(String...text) {//using varargs
		System.out.println("Show method invoxed");
		for(String s:text) {
		System.out.println(s);
	}}
	public static void main(String[] args) {
		show();//zero arguments
		show("hi");//one args
		show("i","Love","BasketBall"); //three arguments
	}

}
