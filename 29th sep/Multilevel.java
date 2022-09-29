package demo;
//MULTILEVL INHERITANCE
class Vehicle2 {//parent class A
	void running() {
		System.out.println("Running mode on");
	}
}

class Bike2 extends Vehicle2{//child class B)void run(){
		void run() {
		System.out.println("Bike run mode on");
	}
}

class Car2 extends Bike2 {//child class c
	void speed() {
		System.out.println("Car speed is very high");
	}
}

public class Multilevel {
	public static void main(String args[]) {
		Car2 d = new Car2();//object of child class car
		d.run();//child class method
		d.running();
		d.speed();
	}
}
