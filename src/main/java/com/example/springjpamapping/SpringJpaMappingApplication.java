package com.example.springjpamapping;

import com.example.springjpamapping.service.ZooService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
public class SpringJpaMappingApplication implements CommandLineRunner {

    private final ZooService zooService;

    public static void main(String[] args) {
        SpringApplication.run(SpringJpaMappingApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        zooService.createDb();
        JPAUtil.checkData("select * from category");
        JPAUtil.checkData("select * from cage");
        JPAUtil.checkData("select * from animal");
        JPAUtil.checkData("select * from supplier");
        JPAUtil.checkData("select * from food_item");
        JPAUtil.checkData("select * from food_item_animals");
    }
}
