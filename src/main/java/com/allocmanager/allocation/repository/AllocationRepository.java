package com.allocmanager.allocation.repository;

import com.allocmanager.allocation.domain.Allocation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface AllocationRepository extends JpaRepository<Allocation, Long> {

    List<Allocation> findByDeveloperIdAndEndDateAfterAndStartDateBefore(
            Long developerId,
            LocalDate startDate,
            LocalDate endDate
    );
}