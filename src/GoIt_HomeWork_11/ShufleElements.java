package GoIt_HomeWork_11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ShufleElements {
    public static void main(String[] args) {
        Stream <String> first = Stream.of("a","b","c","d");
        Stream <String> second = Stream.of("1","2","3","4","5");
        Stream <String> zip = zip(first,second);
        System.out.println(zip.collect(Collectors.toList()));
    }
    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        List<T> res = new ArrayList<>();
        Iterator<T> iterator1 = first.iterator();
        Iterator<T> iterator2 = second.iterator();
        while (iterator1.hasNext() && iterator2.hasNext()) {
            res.add(iterator1.next());
            res.add(iterator2.next());
        }
        return res.stream();
    }
}