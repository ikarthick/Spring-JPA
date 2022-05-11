package com.srikar.learning.jpa.learnjpa.entity;
// Table -> User

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {

    public User(){}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private final int id=0;
    private String name;
    private String role;


    public User( String name, String role) {
        super();
        this.name = name;
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", role='" + role + '\'' +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getName() {
        return name;
    }


    public int getId() {
        return id;
    }


    public String getRole() {
        return role;
    }

}
