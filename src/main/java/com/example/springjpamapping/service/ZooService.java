package com.example.springjpamapping.service;

import com.example.springjpamapping.dao.CategoryDao;
import com.example.springjpamapping.entity.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class ZooService {

    private final CategoryDao categoryDao;

    @Transactional
    public void createDb() {

        Cage cage1 = new Cage("S001", "South");
        Cage cage2 = new Cage("N001", "North");
        Cage cage3 = new Cage("E001", "East");
        Cage cage4 = new Cage("W001", "West");

        Animal animal1 = new Animal("Tiger", 5);
        Animal animal2 = new Animal("Dear", 25);
        Animal animal3 = new Animal("Monkey", 100);
        Animal animal4 = new Animal("Penguin", 30);

        Category category1 = new Category("Carnivore");
        Category category2 = new Category("Non-Carnivore");

        Supplier supplier1 = new Supplier("John Doe", "55-555-55", "Dream Land");
        Supplier supplier2 = new Supplier("Thomas Hardy", "66-666-66", "79 Park Avenue");

        FoodItem foodItem1 = new FoodItem("Meat", 50);
        FoodItem foodItem2 = new FoodItem("Wheat", 100);
        FoodItem foodItem3 = new FoodItem("Veg", 200);
        FoodItem foodItem4 = new FoodItem("Grains", 100);

        cage1.addAnimal(animal1);
        cage2.addAnimal(animal2);
        cage3.addAnimal(animal3);
        cage4.addAnimal(animal4);

        category1.addAnimal(animal1);
        category1.addAnimal(animal4);
        category2.addAnimal(animal2);
        category2.addAnimal(animal3);

        supplier1.addFoodItem(foodItem1);
        supplier1.addFoodItem(foodItem2);
        supplier2.addFoodItem(foodItem3);
        supplier2.addFoodItem(foodItem4);

        foodItem1.addAnimal(animal1);
        foodItem1.addAnimal(animal4);
        foodItem2.addAnimal(animal3);
        foodItem3.addAnimal(animal2);
        foodItem4.addAnimal(animal2);

        categoryDao.save(category1);
        categoryDao.save(category2);
    }
}
