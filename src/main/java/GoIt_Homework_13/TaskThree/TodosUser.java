package main.java.GoIt_Homework_13.TaskThree;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class TodosUser {
    HttpClient client = HttpClient.newHttpClient();
    private String getAllTodosByUserId(int userId) throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://jsonplaceholder.typicode.com/users/" + userId + "/todos"))
                .GET()
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        return response.body();
    }
    private List<UserTodos> getOpenTodosFromJson(String json) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        UserTodos[] todosArray = gson.fromJson(json, UserTodos[].class);
        List<UserTodos> todosList = new ArrayList<>(Arrays.asList(todosArray));
        List<UserTodos> openTodosList = new ArrayList<>();
        for (UserTodos element : todosList) {
            if (!element.completed) {
                openTodosList.add(element);
            }
        }
        return openTodosList;
    }
    private void createJsonWithTodos(List<UserTodos> todos, String jsonFilePath) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String outputString = gson.toJson(todos.toArray());
        try (FileWriter output = new FileWriter(jsonFilePath)) {
            output.write(outputString);
        } catch (IOException e) {
            e.getStackTrace();
        }
    }
    public void createJsonWithAllOpenToDosByUserId(int userId) throws IOException, InterruptedException {
        String allTodosJson = getAllTodosByUserId(userId);
        List<UserTodos> allTodos = getOpenTodosFromJson(allTodosJson);
        String jsonFilePath = "src/main/resources/" + "user-" + userId + "-open_todos.json";
        createJsonWithTodos(allTodos, jsonFilePath);
        System.out.println("JSON filepath: " + jsonFilePath);
    }
}