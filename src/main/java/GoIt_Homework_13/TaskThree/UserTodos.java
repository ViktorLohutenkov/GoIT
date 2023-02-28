package main.java.GoIt_Homework_13.TaskThree;

class UserTodos {
    int userId;
    int id;
    String title;
    boolean completed;

    public UserTodos(int userId, int id, String title, boolean completed) {
        this.userId = userId;
        this.id = id;
        this.title = title;
        this.completed = completed;
    }
    @Override
    public String toString() {
        return "UserTodos{" +
                "userId=" + userId +
                ", id=" + id +
                ", title='" + title + '\'' +
                ", completed=" + completed +
                '}';
    }
}
