package com.guzenko.springcourse.firstrestapp.repositories;

import com.guzenko.springcourse.firstrestapp.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeopleRepository extends JpaRepository<Person, Integer> {

}