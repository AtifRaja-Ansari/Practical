//23rd of nov 22

package thread;

public class CurrentThread extends Thread{
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
	public static void main(String[] args) {
		CurrentThread obj=new CurrentThread();
		CurrentThread obj1=new CurrentThread();
		obj.start();
		obj1.start();
	}

}