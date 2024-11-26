package streamApi;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);
        System.out.println("----Using Collections and Simple Logic-----");
        for (int i : al) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
