package callable;

class ThreadTask implements Runnable {

    @Override
    public void run() {
        System.out.println("Hi");
    }
}

public class Test1 {
    public static void main(String[] args) {
        ThreadTask tt = new ThreadTask();
        Thread t1 = new Thread(tt);
        t1.start();
    }
}
