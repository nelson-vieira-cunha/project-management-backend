package com.allocmanager.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.allocmanager.project.domain.Project;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}