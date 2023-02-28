package main.java.GoIt_Homework_13.TaskThree;


import java.io.IOException;

public class TodosUserTest {
    public static void main(String[] args) throws IOException, InterruptedException {
        TodosUser src = new TodosUser();
        int userId = 2;
        src.createJsonWithAllOpenToDosByUserId(userId);
    }
}
