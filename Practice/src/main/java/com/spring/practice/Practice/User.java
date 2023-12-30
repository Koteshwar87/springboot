package com.spring.practice.Practice;

import lombok.Data;
import lombok.Setter;

@Data
//@Setter
public class User {
    private Long id;
    private String username;

    // Getters and setters...

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                '}';
    }
}
