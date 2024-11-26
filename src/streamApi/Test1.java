package streamApi;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Test1 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);

        // 1st Way to get stream instance
        Stream<Integer> s1 = al.stream();
        s1.forEach(e -> System.out.println(e));
    }
}
