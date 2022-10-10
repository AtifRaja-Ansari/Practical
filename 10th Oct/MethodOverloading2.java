package demo;
//2nd way(by changing Data types);

public class MethodOverloading2 {
	static int sum(int a, int b) {	//integer type
		return a +b;
	}
		static double sum(double x, double y,double z) {	//float data type
			return x+y+z;
		}
		public static void main(String[] args) {
			System.out.println(MethodOverloading2.sum(5, 10));
			System.out.println(MethodOverloading2.sum(5.0, 10.0, 11.0));

		}
}
