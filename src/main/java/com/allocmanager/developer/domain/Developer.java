package com.allocmanager.developer.domain;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "developers")
public class Developer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String email;

    private String seniority;

    private LocalDate hireDate;

    // Construtor vazio (OBRIGATÓRIO para JPA e Jackson)
    public Developer() {
    }

    // Getters

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getSeniority() {
        return seniority;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    // Setters

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSeniority(String seniority) {
        this.seniority = seniority;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }
}