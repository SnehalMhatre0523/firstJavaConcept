package ThreadDemo;

public class ThreadMethodsDemo  implements Runnable {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized (this) {
			try {
				System.out.println("Thread going to sleep :: "+Thread.currentThread().getName());
				Thread.sleep(100);
				synchronized (this) {
					this.notifyAll();
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void letsWait() {
		System.out.println(Thread.currentThread().getName()+" Entered");
		synchronized (this) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName()+" Thread wake up");
	}
	
	
	public static void main(String[] args) {
		//System.out.println("Thread :: "+Thread.currentThread().getName());
		ThreadMethodsDemo tmd = new ThreadMethodsDemo();
		Thread t = new Thread(tmd);
		t.setName("A");
		t.start();
		tmd.letsWait();
	}


}
