package com.example.springjpamapping.dao;

import com.example.springjpamapping.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryDao extends JpaRepository<Category, Integer> {
}
