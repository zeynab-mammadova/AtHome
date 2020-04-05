package streamExamples;

import java.util.Arrays;
import java.util.List;

public class Stream3 {
    public static void main(String[] args) {
        List<String> people= Arrays.asList("Zeynab","Nigar","Nazrin","Nick","Alexey");
        people
                .stream()
                .map(String::toLowerCase)
                .filter(x -> x.startsWith("n"))
                .forEach(System.out::println);
    }
}
