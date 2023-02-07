package B;

public class JavaApplication45 extends Thread {

    public static void main(String[] args) {
        //even numbers
        Thread t1 = new Thread() {
            public void run() {
                for (int i = 1; i <= 20; i++) {
                    if (i % 2 == 0) {
                        System.out.println("even thread " + i);
                    }
                }
            }
        };
        t1.start();
        //odd numbers
        Thread t2 = new Thread() {
            public void run() {
                for (int i = 1; i <= 20; i++) {
                    if (i % 2 != 0) {
                        System.out.println("odd thread " + i);
                    }
                }
            }
        };
        t2.start();

    }

}
