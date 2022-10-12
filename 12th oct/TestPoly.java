package demo;


class Bank{
	float RateOfInterest(){
		return 0;}
}
	class SBI extends Bank{
	float RateOfInterest(){
		return 8f;}
	}
	
	class ICICI extends Bank{
	float RateOfInterest(){
		return 7f;}
	}
	class AXIS extends Bank{
	float RateOfInterest(){
		return 9f;}
	} 
public class TestPoly {
	public static void main(String[] args) {
		Bank obj;//upcasting
		obj = new SBI();
		System.out.println("SBI: " +obj.RateOfInterest());
		obj = new ICICI();
		System.out.println("ICICI: " +obj.RateOfInterest());
		obj = new AXIS();
		System.out.println("AXIS: " +obj.RateOfInterest());
		
	}

}
