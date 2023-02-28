package main.java.GoIt_Homework_13.TaskOne;

 class User {
    private int id;
    private String name;
    private String username;
    private String email;
    private String address;
    private String phone;
    private String website;
    private String company;
     public User() {

     }
     public int getId() {
         return id;
     }

     public void setId(int id) {
         this.id = id;
     }

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public void setUsername(String username) {
         this.username = username;
     }

     public void setEmail(String email) {
         this.email = email;
     }

     public void setAddress(String address) {
         this.address = address;
     }

     public void setPhone(String phone) {
         this.phone = phone;
     }

     public void setWebsite(String website) {
         this.website = website;
     }

     public void setCompany(String company) {
         this.company = company;
     }

     @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", email=" + email +
                ", address=" + address +
                ", phone='" + phone + '\'' +
                ", website='" + website + '\'' +
                ", company=" + company +
                '}';
    }
}

