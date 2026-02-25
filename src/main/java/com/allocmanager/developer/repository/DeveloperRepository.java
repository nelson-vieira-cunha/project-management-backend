package com.allocmanager.developer.repository;

import com.allocmanager.developer.domain.Developer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeveloperRepository extends JpaRepository<Developer, Long> {
}