package com.example.springjpamapping.dao;

import com.example.springjpamapping.entity.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierDao extends JpaRepository<Supplier, Integer> {
}
