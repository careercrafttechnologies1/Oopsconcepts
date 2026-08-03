package streamAPI;

import java.util.Arrays;

public class MaxMinUsingJava8 {
    public static void main(String[] args) {
        // Integer array
        int[] arr = {45, 34, 2, 3, 8, 76, 999, 1};

        // Find Minimum Value
        int min = Arrays.stream(arr)
                .boxed()
                .min(Integer::compare)
                .get();

        // Find Maximum Value
        int max = Arrays.stream(arr)
                .boxed()
                .max(Integer::compare)
                .get();

        // Display Result
        System.out.println("Array Elements : " + Arrays.toString(arr));
        System.out.println("Minimum Value  : " + min);
        System.out.println("Maximum Value  : " + max);
    }
}

