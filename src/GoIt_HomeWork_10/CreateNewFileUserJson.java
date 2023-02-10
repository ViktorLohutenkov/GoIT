package GoIt_HomeWork_10;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CreateNewFileUserJson {
    public static void main(String[] args) throws IOException {
        List <User> users = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader("file1.txt"));
        reader.readLine();
        String line;
        while ((line = reader.readLine()) != null) {
            String[] names = line.split(" ");
            users.add(new User(names [0],Integer.parseInt(names [1])));
        }
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter fileWriter = new FileWriter("user.json");
        gson.toJson(users, fileWriter);
        fileWriter.close();
    }
}
    class User {
        public String name;
        public int age;
        public User(String name, int age) {
            this.name = name;
            this.age = age;
        }
        @Override
        public String toString() {
            return "name " + name + '\'' + "age " + age;
        }
    }


