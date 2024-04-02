package com.example.springjpamapping.dao;

import com.example.springjpamapping.entity.FoodItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodItemDao extends JpaRepository<FoodItem, Integer> {
}
