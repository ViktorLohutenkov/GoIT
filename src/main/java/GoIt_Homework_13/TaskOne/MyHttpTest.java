package main.java.GoIt_Homework_13.TaskOne;

import java.io.IOException;
public class MyHttpTest {
    public static void main(String[] args) throws IOException, InterruptedException {
        User user = defaultUser();
        String jsonUserUpdated = "src/main/resources/userJSON.json";
        //1
        final User createUser = HttpTasks.createUser(user);
        System.out.println(createUser);

        //2
        int updatedId = 5;
        String updatedUser = HttpTasks.updateUser(updatedId, jsonUserUpdated);
        System.out.println(updatedUser);


        //3
        int deleteUserId = 2;
        System.out.println("User id - " + deleteUserId + ", status - " + HttpTasks.deleteUserById(deleteUserId));

        //4
        System.out.println(HttpTasks.getAllUsers());

        //5
        int getByUserId = 1;
        String userInfo = HttpTasks.getUserById(getByUserId);
        System.out.println("User " + getByUserId + " - " + userInfo);

        //6
        String userName = "Samantha";
        String userUsername = HttpTasks.getUserByName(userName);
        System.out.println(userName + " info - " + userUsername);
    }
    private static User defaultUser(){
        return new User(11,"Alex","HttpAlex","httpalex@gmail.com", "Kyiv",
                "380991112233","www.edu.goit", "Philip Morris");
    }
}