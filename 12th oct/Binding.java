package demo;
// Static Binding
class Binding {
	private void display() {//static binding(private,final,static)
System.out.println("Samjhee");}
public static void main(String[] args) {
	Binding obj = new Binding();
	obj.display();
}
}
