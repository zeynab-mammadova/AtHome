package streamExamples;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class StreamArrayMin {
    public static void main(String[] args) {
        int[] array={1,2,5,3,88,1,6,3};
        System.out.println(Arrays.toString(array));
        IntSummaryStatistics statistics=IntStream.of(array).summaryStatistics();
        System.out.println("__________________________");
        System.out.println(statistics.getMin());
        System.out.println( statistics.getMax());
        System.out.println(statistics.getAverage());
        System.out.println(statistics.getSum());
        System.out.println(statistics.getCount());
        System.out.println("___________________________");
        IntStream.of(array).max().ifPresent(System.out::println);
        IntStream.of(array).min().ifPresent(System.out::println);
        System.out.println(IntStream.of(array).average().getAsDouble());
        System.out.println( IntStream.of(array).sum());
        System.out.println(IntStream.of(array).count());
    }



}
