package demo;

public class ParameterizedCon {
		int age;
		String name;

	//Parameterized constructor where we have  to pass the parameter
		ParameterizedCon(int a, String n) {
			age = a;
			name = n;
		}

		void show() {
			System.out.println(age + " " + name);
		}

		public static void main(String[] args) {
			ParameterizedCon d = new ParameterizedCon(20, "avi");
			d.show();
			ParameterizedCon d1 = new ParameterizedCon(30, "ansari");
			d1.show();
		}
}
