package demo;
// runtime Polymorphism---method overriding
class testRuntimePoly{
	int value=50;//data member
	void show()//parent class
	{
		System.out.println("Show Anything");
	}
}
class RuntimePolymorphism extends testRuntimePoly {
	int value = 70;//we cannot over-ride data member
	void show()//method override
	{
		System.out.println("Show Nothing");
	}
	//reference variable of parent class refers to the object of the child
	public static void main(String[] args) {
		testRuntimePoly obj = new RuntimePolymorphism();//upcasting
	obj.show();
	System.out.println("value is: "+ obj.value);
	}
}
