package GoIt_HomeWork_11;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayReturnSort {
    public static void main(String[] args) {
        List<String> array = Arrays.asList("1, 2, 0", "4, 5");
        System.out.println(sortedArray(array));
    }
        private static List<String> sortedArray(List<String> array) {
            return array.stream()
                    .map(string -> string.split(", "))
                    .sorted()
                    .collect(Collectors.toList());
    }
}
