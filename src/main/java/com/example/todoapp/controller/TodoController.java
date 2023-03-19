package com.example.todoapp.controller;

import com.example.todoapp.exception.ResourceNotFoundException;
import com.example.todoapp.model.Todo;
import com.example.todoapp.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/v1/todos")
public class TodoController {

    @Autowired
    private TodoRepository todoRepository;

    @GetMapping
    public List<Todo> getAllTodos() {
        return todoRepository.findAll();
    }

    @PostMapping
    public Todo createTodo(@RequestBody Todo todoRequest) throws ResourceNotFoundException, ParseException {
        Date currentDate = new Date();
        todoRequest.setCreatedAt(currentDate.getTime() / 100);
        todoRequest.setUpdatedAt(currentDate.getTime() / 100);

        todoRequest.setCompleted(false);

		DateFormat dateFormat = new SimpleDateFormat("dd MMM yyyy hh:mm a");
		Date date = dateFormat.parse(todoRequest.getInputTime());
		long unixTime = date.getTime()/1000;
        todoRequest.setTime(unixTime);

        return todoRepository.save(todoRequest);
    }
}
