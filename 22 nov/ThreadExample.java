package thread;

public class ThreadExample extends Thread {
	
public void run() {
System.out.println("I am Thread....Wlecome to running Thread");
}
	public static void main(String[] args) {
	ThreadExample t = new ThreadExample();
	t.start();
	t.setName("Avi");
	String s = t.getName();
	System.out.println(s);
	}
}