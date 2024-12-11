package streamApi.tasks;

import java.util.Arrays;
import java.util.List;

public class UpperDemo {
    public static void main(String[] args) {
        List<String> fruits =
                Arrays.asList("apple", "orange", "pineapple", "berry", "strawberry", "kiwi", "berry", "kiwi");
        fruits.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);

    }
}
