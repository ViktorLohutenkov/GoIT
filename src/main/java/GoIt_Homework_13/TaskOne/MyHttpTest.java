package main.java.GoIt_Homework_13.TaskOne;

import java.io.IOException;
public class MyHttpTest {
    public static void main(String[] args) throws IOException, InterruptedException {
        User user = defaultUser();

        //1
        final User createUser = HttpTasks.createUser(user);
        System.out.println(createUser);

        //2
        int userId = 5;
        System.out.println("Status - " + HttpTasks.updateUserById(userId));

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
        User user = new User();
        user.setId(11);
        user.setName("Alex");
        user.setUsername("HttpAlex");
        user.setEmail("httpalex@gmail.com");
        user.setPhone("380991112233");
        return user;
    }
}