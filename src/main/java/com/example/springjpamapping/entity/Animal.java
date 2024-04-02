package com.example.springjpamapping.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Animal extends IdClass {

    private String type;
    private int totalNum;

    @ManyToMany(mappedBy = "animals", cascade = CascadeType.PERSIST)
    private List<FoodItem> foodItems = new ArrayList<>();

    @ManyToOne
    private Category category;

    @OneToOne(mappedBy = "animal", cascade = CascadeType.PERSIST)
    private Cage cage;

    public Animal(String type, int totalNum) {
        this.type = type;
        this.totalNum = totalNum;
    }
}
