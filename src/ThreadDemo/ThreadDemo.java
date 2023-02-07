package ThreadDemo;

public class ThreadDemo extends Thread {

	@Override
	public synchronized void  run() {
		// TODO Auto-generated method stub
		for(int i =0; i < 3;i++) {
			System.out.println("Thread : "+Thread.currentThread().getName()+ " : i values is : : "+i);
		}
	}
	public static void main(String[] args) {
		ThreadDemo t = new ThreadDemo();
		t.setName("T");
		ThreadDemo t2 = new ThreadDemo();
		t2.setName("T2");
	t.start();
	t2.start();
	}
}
