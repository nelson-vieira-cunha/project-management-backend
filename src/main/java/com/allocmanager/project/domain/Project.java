package com.allocmanager.project.domain;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "projects")
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String description;

    private LocalDate startDate;

    private LocalDate endDate;

    // Relacionamento opcional com Developer
    @ManyToOne
    @JoinColumn(name = "developer_id")
    private com.allocmanager.developer.domain.Developer developer;

    public Project() {}

    // Getters e Setters

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getDescription() { return description; }

    public void setDescription(String description) { this.description = description; }

    public LocalDate getStartDate() { return startDate; }

    public void setStartDate(LocalDate startDate) { this.startDate = startDate; }

    public LocalDate getEndDate() { return endDate; }

    public void setEndDate(LocalDate endDate) { this.endDate = endDate; }

    public com.allocmanager.developer.domain.Developer getDeveloper() { return developer; }

    public void setDeveloper(com.allocmanager.developer.domain.Developer developer) {
        this.developer = developer;
    }
}