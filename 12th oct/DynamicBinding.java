package Assignments;


class TestBinding {
	void show() {// Dynamic Binding
		System.out.println("Ab Samjhee");
	}
}


class DynamicBinding extends TestBinding {
	void show() {// Dynamic Binding
		System.out.println("Override");
	}

public static void main(String[] args) {
	TestBinding obj = new DynamicBinding();
	obj.show();
	}
}
