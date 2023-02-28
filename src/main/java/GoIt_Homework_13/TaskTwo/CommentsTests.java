package main.java.GoIt_Homework_13.TaskTwo;

import java.io.IOException;

public class CommentsTests {
    public static void main(String[] args) throws IOException, InterruptedException {
        LastCommentsToFile commentsToFile = new LastCommentsToFile();
        int userId = 1;
        commentsToFile.createJsonWithAllCommentsFromLastPostByUserId(userId);
    }
}