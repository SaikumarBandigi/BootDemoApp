package com.demo.repo;

import com.demo.entites.Person;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PersonRepoTest {

    @Autowired
    private PersonRepo personRepo;

    @Test
    public void isPersonExitsById() {
        Person person = new Person(123, "sai", "hyd");
        personRepo.save(person);
        boolean res = personRepo.isPersonExitsById(123);
        assertThat(res).isTrue();
    }


    @BeforeEach
    void setUp() {
        System.out.println("setting up.....");
    }


    @AfterEach
    void tearDown() {
        System.out.println("tearing down..");
        personRepo.deleteAll();
    }


}
