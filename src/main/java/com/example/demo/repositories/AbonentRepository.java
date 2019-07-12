package com.example.demo.repositories;

import com.example.demo.entity.Abonent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AbonentRepository extends JpaRepository<Abonent,Long> {
}
