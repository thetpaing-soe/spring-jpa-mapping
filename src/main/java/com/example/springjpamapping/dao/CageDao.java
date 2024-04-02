package com.example.springjpamapping.dao;

import com.example.springjpamapping.entity.Cage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CageDao extends JpaRepository<Cage, Integer> {
}
