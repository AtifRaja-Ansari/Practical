package demo;
	//Without This Keyword
public class Thiskeyword { //class1outer class
	//Instance variable
	int rollno;
	String name;
	float fee;
	
//parameterized constructor
		
	Thiskeyword( int rollno, String name, float fee) {
			this.rollno = rollno;
			this.name = name;
			this.fee = fee;
		}
	
//method	
	void display() {
		System.out.println(rollno+" "+name+" "+fee);
		}
	
		public static void main(String[]args) {
			// creating object
			Thiskeyword s1= new Thiskeyword(111,"Avi",500);
			Thiskeyword s2= new Thiskeyword(555,"Amit",600);
				s1.display();
				s2.display();
		}
}
