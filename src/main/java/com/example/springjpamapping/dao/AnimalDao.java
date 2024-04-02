package com.example.springjpamapping.dao;

import com.example.springjpamapping.entity.Animal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnimalDao extends JpaRepository<Animal, Integer> {
}
