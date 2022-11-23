package thread;

public class DemonThreadExample extends Thread{
	public void run() {
		System.out.println("name:"+Thread.currentThread().getName());
		System.out.println("Demon:"+Thread.currentThread().isDaemon());
		if(Thread.currentThread().isDaemon()) {
			System.out.println("i am a demon thread");
		}else {
			System.out.println("i am user thread");
		}
	}
	public static void main(String args[]) {
		DemonThreadExample t1=new DemonThreadExample();
		DemonThreadExample t2=new DemonThreadExample();
		t1.start();
		t1.setDaemon(true);
		t2.start();
	}
}