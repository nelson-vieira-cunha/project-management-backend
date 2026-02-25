package com.allocmanager.developer.domain;


import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "developers")
public class Developer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(unique = true, nullable = false)
    private String email;

    private String seniority;

    private LocalDate hireDate;

    // getters e setters
}