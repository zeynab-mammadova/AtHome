package arrays;

import java.util.Arrays;

public class ArraySortStream {
    public static void main(String[] args) {
        int [] array={1,4,2,7,5,9,6,2,8};
        System.out.println(Arrays.toString(array));
       //original array is not mutated
        Arrays.stream(array)   // create the stream
                .distinct()    //process the stream
                .sorted()      //process the stream
                .limit(3)      //process the stream
                .forEach(System.out::print);   //consume the stream
    }
}
