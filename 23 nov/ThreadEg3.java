//23rd of nov 22


package thread;
//directly we use thread class without extend
//with and without set name we can name the thread
public class ThreadEg3 {
	public void run() {
		System.out.println("Avi");
	}
	public static void main(String[] args) {
		Thread t = new Thread("Atif");
		Thread t1 = new Thread();

		t.start();
		t1.start();
		t1.setName("Anudip");
		System.out.println("Thread 0: "+t.getName());
		System.out.println("Thread 1: "+t1.getName());
	}
}
