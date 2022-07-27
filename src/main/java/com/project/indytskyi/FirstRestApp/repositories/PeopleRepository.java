package com.project.indytskyi.FirstRestApp.repositories;

import com.project.indytskyi.FirstRestApp.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PeopleRepository extends JpaRepository<Person, Integer> {

}
