package demo;

public class StudentDetails {
	int id;
	String name;
	StudentAddress address;//ref entity
public StudentDetails(int id,String name,StudentAddress address) {
	this.id=id;
	this.name=name;
	this.address=address;
}
void show() {
	System.out.println(id+" "+name);
	System.out.println(address.area+" "+address.city+" "+address.district);
}
public static void main(String[] args) {
	StudentAddress a1=new StudentAddress("Ladrymbai","Shillong","JaintiaHills");
	StudentDetails d1=new StudentDetails(1,"Avi",a1);
	d1.show();
}
}