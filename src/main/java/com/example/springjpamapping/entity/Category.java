package com.example.springjpamapping.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Category extends IdClass {

    private String categoryType;

    @OneToMany(mappedBy = "category", cascade = CascadeType.PERSIST)
    private List<Animal> animals = new ArrayList<>();

    public void addAnimal(Animal animal) {
        animal.setCategory(this);
        this.animals.add(animal);
    }

    public Category(String categoryType) {
        this.categoryType = categoryType;
    }
}
