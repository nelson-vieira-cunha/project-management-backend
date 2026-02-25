package com.allocmanager.developer.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.allocmanager.developer.repository.DeveloperRepository;
import com.allocmanager.developer.domain.Developer;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DeveloperService {

    private final DeveloperRepository repository;

    public Developer create(Developer developer) {
        return repository.save(developer);
    }

    public List<Developer> findAll() {
        return repository.findAll();
    }

    public Developer findById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Developer not found"));
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}