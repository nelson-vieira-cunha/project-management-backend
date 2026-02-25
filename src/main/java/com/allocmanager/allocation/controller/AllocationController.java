package com.allocmanager.allocation.controller;

import com.allocmanager.allocation.domain.Allocation;
import com.allocmanager.allocation.service.AllocationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/allocations")
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:4200")
public class AllocationController {

    private final AllocationService service;


    @PostMapping
    public Allocation create(@RequestBody Allocation allocation) {
        return service.create(allocation);
    }

    @GetMapping
    public List<Allocation> findAll() {
        return service.findAll();
    }
}