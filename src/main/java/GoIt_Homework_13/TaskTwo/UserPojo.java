package main.java.GoIt_Homework_13.TaskTwo;

class UserPojo {
    String postId;
    int id;
    String name;
    String email;
    String body;

    public UserPojo(String postId, int id, String name, String email, String body) {
        this.postId = postId;
        this.id = id;
        this.name = name;
        this.email = email;
        this.body = body;
    }

    @Override
    public String toString() {
        return "User {" +
                "postId='" + postId + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
}
