package GoIt_HomeWork_11;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReturnListNames {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Viktor", "Alex", "Oleg", "Sergey", "Ivan", "Petro");

        System.out.println(oddIndexList(names));
        System.out.println(sortedNamesToUpperCase(names));
    }
    public static List<String> oddIndexList(List<String> names) {
        IntStream.range(0, names.size())
                .filter(index -> index % 2 != 0)
                .forEach(position -> System.out.println(position + ". " + names.get(position)));
    return names;
}
    private static List<String> sortedNamesToUpperCase(List<String> names) {
        return names.stream()
                .map(String::toUpperCase)
                .sorted(Collections.reverseOrder())
                .collect(Collectors.toList());
    }
}