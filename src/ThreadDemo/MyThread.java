package ThreadDemo;

public class MyThread implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		//used synchronized block to synchronized
		synchronized (this) {
			for (int i = 0; i < 3; i++) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Thread is "+Thread.currentThread().getName()+"  i values is : : " + i);
			}
		}
		
	}

	public static void main(String[] args) {
		MyThread mt = new MyThread();
		Thread t  = new Thread(mt);
		t.setName("A");
		Thread t1  = new Thread(mt);
		t1.setName("B");
		Thread t2  = new Thread(mt);
		t2.setName("C");
		
		t.start();
		t1.start();
		t2.start();
	}

}
