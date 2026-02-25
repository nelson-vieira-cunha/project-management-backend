package com.allocmanager.allocation.service;

import com.allocmanager.allocation.domain.Allocation;
import com.allocmanager.allocation.repository.AllocationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AllocationService {

        private final AllocationRepository repository;


    public Allocation create(Allocation allocation) {

        validateConflict(allocation);

        return repository.save(allocation);
    }

    public List<Allocation> findAll() {
        return repository.findAll();
    }

    private void validateConflict(Allocation newAllocation) {

        var overlapping = repository
                .findByDeveloperIdAndEndDateAfterAndStartDateBefore(
                        newAllocation.getDeveloperId(),
                        newAllocation.getStartDate(),
                        newAllocation.getEndDate()
                );

        int totalPercent = overlapping.stream()
                .mapToInt(Allocation::getAllocationPercent)
                .sum() + newAllocation.getAllocationPercent();

        if (totalPercent > 100) {
            throw new RuntimeException("Developer está sobrealocado (>100%)");
        }
    }
}