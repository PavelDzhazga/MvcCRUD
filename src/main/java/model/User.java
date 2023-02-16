package model;

public class User {
    private Long id;
    private String name;
    private Integer age;
    private String email;

    public User() {

    }

    public User(String name, Integer age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }
}
