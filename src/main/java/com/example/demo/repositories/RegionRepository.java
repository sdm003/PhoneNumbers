package com.example.demo.repositories;

import com.example.demo.entity.Region;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegionRepository extends JpaRepository<Region,Long> {
}
