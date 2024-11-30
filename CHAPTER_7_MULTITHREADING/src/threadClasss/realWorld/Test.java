package threadClasss.realWorld;

class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + " : " + i);
        }
    }
}

public class Test {

    public static void main(String[] args) {
        MyThread mt1 = new MyThread();
        mt1.start();

        MyThread mt2 = new MyThread();
        mt2.start();
    }
}
