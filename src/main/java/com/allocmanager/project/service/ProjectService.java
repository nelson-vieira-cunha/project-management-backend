package com.allocmanager.project.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.allocmanager.project.repository.ProjectRepository;
import com.allocmanager.project.domain.Project;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProjectService {

    private final ProjectRepository repository;

    public Project create(Project project) {
        return repository.save(project);
    }

    public List<Project> findAll() {
        return repository.findAll();
    }

    public Project findById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Project not found"));
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}