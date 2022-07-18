package com.example.taco.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.List;

@Data
@RequiredArgsConstructor
@NoArgsConstructor
@Entity // Spring JPA类，用于定义数据库表
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Size(min = 5, message = "at least 5 char") // 校验器
    private String name;

    @OneToMany
    private List<User> users;
}
