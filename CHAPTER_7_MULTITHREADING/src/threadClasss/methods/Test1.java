package threadClasss.methods;

public class Test1 extends Thread {

    public void run() {
        System.out.println("Hi");
        System.out.println("1 : " + Thread.currentThread().getName());
        System.out.println(Thread.currentThread().isAlive());
    }

    public static void main(String[] args) {
        Test1 t1 = new Test1();
        t1.start();
        System.out.println("2 : " + Thread.currentThread().getName());
        System.out.println(t1.isAlive());
    }
}
