package com.example.todoapp.repository;

import com.example.todoapp.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Long> {
    //<Todo, Long> consists of type of the entity which is Todo and
    //the type of foreign key(Id) which is Long
    //All CRUD database related methods to go here

}