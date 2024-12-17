package streamApi.tasks;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertListIntoString {
    public static void main(String[] args) {
        List<String> fruits =
                Arrays.asList("apple", "orange", "pineapple", "berry", "strawberry", "kiwi", "berry", "kiwi");

        String word = fruits.stream()
                .collect(Collectors.joining(","));
        System.out.println(word);
    }
}
