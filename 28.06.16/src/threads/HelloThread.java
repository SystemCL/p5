package threads;

public class HelloThread extends Thread {
	
	public void run(){
		System.out.println("Hello from a thread");
	}
	
	
	public static void main(String[] args) throws InterruptedException{
		new HelloThread().start();
		HelloThread.sleep(4000);
		System.out.println("Second Thread");
	}
	

}
