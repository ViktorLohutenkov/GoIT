package GoIt_HomeWork_10;

import java.io.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class CheckValidPhoneNumber {
    public static void main(String[] args) throws IOException {
        File file = new File("file.txt");
        Scanner scan = new Scanner(file);
       while(scan.hasNextLine()) {
           String line = scan.nextLine();
           Pattern pattern = Pattern.compile("(?:\\d{3}-){2}\\d{4}|\\(\\d{3}\\)\\s\\d{3}-?\\d{4}");
           Matcher matcher = pattern.matcher(line);
           while (matcher.find()){
               System.out.println(matcher.group());
           }
       }
        scan.close();
    }
}