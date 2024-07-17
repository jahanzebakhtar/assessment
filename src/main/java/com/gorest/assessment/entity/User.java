package com.gorest.assessment.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity(name = "UserEntity")
@Data
public class User {
    @Id
    private Long id;
    private String name;
    private String username;
    private String email;
    private String password;
    private String gender;
    private Boolean status;
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Post> posts = new ArrayList<>();
}
