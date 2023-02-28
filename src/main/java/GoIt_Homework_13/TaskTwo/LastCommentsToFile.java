package main.java.GoIt_Homework_13.TaskTwo;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class LastCommentsToFile {
    private static final HttpClient CLIENT = HttpClient.newHttpClient();
    private String getPostsByUserId(int userId) throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://jsonplaceholder.typicode.com/users/" + userId + "/posts"))
                .GET()
                .build();
        HttpResponse<String> response = CLIENT.send(request, HttpResponse.BodyHandlers.ofString());
        return response.body();
    }
    private List<String> getAllMatches(String text) {
        List<String> matches = new ArrayList<>();
        Pattern pattern = Pattern.compile("\"id\": \\d+");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            matches.add(matcher.group());
        }
        return matches;
    }
    private String getAllCommentsByPostId(int postId) throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://jsonplaceholder.typicode.com/posts/" + postId + "/comments"))
                .GET()
                .build();
        HttpResponse<String> response = CLIENT.send(request, HttpResponse.BodyHandlers.ofString());
        return response.body();
    }
    private int getNumberFromString(String text) {
        String[] parts = text.split(" ");
        return Integer.parseInt(parts[1]);
    }
    private  UserPojo[] createCommentsFromJson(String json) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        return gson.fromJson(json, UserPojo[].class);
    }
    private void createJsonWithComments(String str, String jsonFilePath) {
        UserPojo[] comments = createCommentsFromJson(str);
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String outputString = gson.toJson(comments);
        try (FileWriter output = new FileWriter(jsonFilePath)) {
            output.write(outputString);
        } catch (IOException e) {
            e.getStackTrace();
        }
    }
    public void createJsonWithAllCommentsFromLastPostByUserId(int userId) throws IOException, InterruptedException {
        String allPosts = getPostsByUserId(userId);
        List<String> postsIds = getAllMatches(allPosts);
        int lastPostId = getNumberFromString(postsIds.get(postsIds.size() - 1));
        String allComments = getAllCommentsByPostId(lastPostId);
        String jsonFilePath = "src/main/resources/" + "user-" + userId + "-post-" + lastPostId + "-comments.json";
        createJsonWithComments(allComments, jsonFilePath);
        System.out.println("JSON filepath: " + jsonFilePath);
    }
}
