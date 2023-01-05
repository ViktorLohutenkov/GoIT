package GoIt_HomeWork_10;

import java.io.File;

public class CheckValidPhoneNumber {
    public static void main(String[] args) {
        File file = new File("file.txt");
        System.out.println("file.exists() = " + file.exists());
        System.out.println("file.isFile() = " + file.isFile());
        System.out.println("file.isDirectory() = " + file.isDirectory());
    }
    //  \(\d{3}\)\s\d{3}-?\d{4}    -  (123) 456-7890
    //  /(?:\d{3}-){2}\d{4}        -   987-123-4567

    //  String pattern = "\\(?:\\d{3}-){2}\\d{4}|\\(\d{3}\)\s\d{3}-?\d{4}";
}
