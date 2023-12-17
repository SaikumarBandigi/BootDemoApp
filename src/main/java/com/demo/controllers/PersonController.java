package com.demo.controllers;


import com.demo.entites.Person;
import com.demo.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/unitTesting")
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping("/persons")
    public ResponseEntity<?> getAllPersons() {
        return ResponseEntity.ok(this.personService.getAllPerson());
    }

    @PostMapping("/savePerson")
    public Person savePerson(@RequestBody Person person) {
      return personService.savePerson(person);
    }

}
