package practical;

interface Multiple_in1{//1st parent interface
	void show();
}
interface Multiple_in2{//2nd parent interface
	//void display();
	void show();
}
public class Multipal_Inherritance implements Multiple_in1,Multiple_in2{
	public void show() {
		System.out.println("hi");
	}
	/*public void display() {
		System.out.println("hello");
	}*/
	public static void main(String args[]) {
		Multipal_Inherritance obj=new Multipal_Inherritance();
		obj.show();
		//obj.display();
	}
}