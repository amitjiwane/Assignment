package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Person;

@Service
public interface PersonRepository extends JpaRepository<Person, Long> {

}
