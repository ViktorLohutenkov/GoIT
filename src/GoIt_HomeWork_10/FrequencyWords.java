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
        wordCount.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(System.out::println);
    }
}