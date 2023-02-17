package GoIt_HomeWork_11;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArrayReturnSort {
    public static void main(String[] args) {
        String[] numbers = {"1, 2, 0", "4, 5"};
        System.out.println(sortedArrayToNums(numbers));
    }
    public static String sortedArrayToNums(String[] numbers) {

      return Stream.of(numbers)
                .map(nums -> nums.split(", "))
                .flatMap(Arrays::stream)
                .sorted()
                .collect(Collectors.joining(", "));
    }
}