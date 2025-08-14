package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Person;
import com.example.entity.PersonPK;

@Repository
public interface PersonRepository extends JpaRepository<Person, PersonPK>{

}
