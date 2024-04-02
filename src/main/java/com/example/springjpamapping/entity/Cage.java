package com.example.springjpamapping.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Cage extends IdClass {

    private String cageNo;
    private String location;

    @OneToOne
    private Animal animal;

    public void addAnimal(Animal animal) {
        animal.setCage(this);
        this.animal = animal;
    }

    public Cage(String cageNo, String location) {
        this.cageNo = cageNo;
        this.location = location;
    }
}
