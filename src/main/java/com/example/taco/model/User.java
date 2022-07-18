package com.example.taco.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@RequiredArgsConstructor
@NoArgsConstructor
@Entity
public class User {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    private String name;
}
