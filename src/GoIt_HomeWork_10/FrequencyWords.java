package GoIt_HomeWork_10;

import java.io.*;
import java.util.*;

public class FrequencyWords {
    public static void main(String[] args) {
        Map<String, Integer> wordCount = new HashMap<>();
        try (InputStream file = new FileInputStream("words.txt");
             Scanner scan = new Scanner(file)) {
            while (scan.hasNext()) {
                String[] words = scan.nextLine().split(" ");
                for (String word : words) {
                    if (wordCount.containsKey(word)) {
                        wordCount.put(word, wordCount.get(word) + 1);
                    } else {
                        wordCount.put(word, 1);
                    }
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                Integer value1 = wordCount.get(o1);
                Integer value2 = wordCount.get(o2);
                return value1.compareTo(value2) > 0 ? 1 : -1;
            }
        };
        Map<String, Integer> result = new TreeMap<>(comparator.reversed());
        result.putAll(wordCount);
        System.out.println(result);
    }
}