package executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyThreadTask2 implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        try {
            Thread.sleep(1000);
            System.out.println("-----------------");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

public class Tset2 {
    public static void main(String[] args) {
        MyThreadTask2 mt = new MyThreadTask2();

//        Thread t=new Thread(mt);
//        t.start();

        ExecutorService es = Executors.newFixedThreadPool(3);
        for (int i = 1; i <= 10; i++) {
            es.submit(mt);
        }
        es.shutdown();

    }
}
