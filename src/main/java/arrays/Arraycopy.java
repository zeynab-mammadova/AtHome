package arrays;

import java.util.Arrays;

public class Arraycopy {
    public static void main(String[] args) {

        int[] array = {1, 4, 3, 7, 2, 9, 5};

        int[] copyArray = Arrays.copyOf(array, array.length);
        Arrays.sort(copyArray);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(copyArray));
        System.out.println();
    }
}