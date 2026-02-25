package com.allocmanager.developer.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import com.allocmanager.developer.service.DeveloperService;
import com.allocmanager.developer.domain.Developer;

import java.util.List;

@RestController
@RequestMapping("/api/developers")
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:4200")
public class DeveloperController {

    private final DeveloperService service;

    @PostMapping
    public Developer create(@RequestBody Developer developer) {
        return service.create(developer);
    }

    @GetMapping
    public List<Developer> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Developer findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}