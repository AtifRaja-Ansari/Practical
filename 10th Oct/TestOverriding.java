package demo;

class TestOverriding{
	void run() {
		System.out.println("Running mode on");	
}}
	//creating child class
class Methodoverriding extends TestOverriding {
	void run() {//method 2
		System.out.println("Running mode off");
	}
public static void main(String[] args) {
	//creating a object of child class
	Methodoverriding a = new Methodoverriding();
	a.run();
}
}