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
public class Supplier extends IdClass {

    private String supplierName;
    private String contactNumber;
    private String address;

    @OneToMany(mappedBy = "supplier")
    private List<FoodItem> foodItems = new ArrayList<>();

    public void addFoodItem(FoodItem foodItem) {
        foodItem.setSupplier(this);
        this.foodItems.add(foodItem);
    }
    public Supplier(String supplierName, String contactNumber, String address) {
        this.supplierName = supplierName;
        this.contactNumber = contactNumber;
        this.address = address;
    }
}
