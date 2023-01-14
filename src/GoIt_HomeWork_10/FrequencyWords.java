package GoIt_HomeWork_10;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FrequencyWords {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("words");
        Scanner scan = new Scanner(file);
        HashMap<String, Integer> wordCount = new HashMap<>();
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
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey()+ " " + entry.getValue());
        }
        scan.close();
    }
}