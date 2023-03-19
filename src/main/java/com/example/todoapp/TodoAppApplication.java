package com.example.todoapp;

import com.example.todoapp.model.Todo;
import com.example.todoapp.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootApplication
public class TodoAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(TodoAppApplication.class, args);
	}

	@Autowired
	private TodoRepository todoRepository;

//	@Override
//	public void run(String... args) throws Exception{
//		Todo todo = new Todo();
//		todo.setTodoName("Complete Task A");
//		todo.setCompleted(false);
//		Date currentDate = new Date();
//		todo.setCreatedAt(currentDate.getTime() / 100);
//		todo.setUpdatedAt(currentDate.getTime() / 100);
//		String dateString = "09 Nov 2012 8:00 pm";
//		DateFormat dateFormat = new SimpleDateFormat("dd MMM yyyy hh:mm a");
//		Date date = dateFormat.parse(dateString );
//		long unixTime = date.getTime()/1000;
//		todo.setTime(unixTime);
//
//		todoRepository.save(todo);
//
//		Todo todo1 = new Todo();
//		todo1.setTodoName("Complete Task B");
//		todo1.setCompleted(false);
//		Date currentDate1 = new Date();
//		todo1.setCreatedAt(currentDate1.getTime() / 100);
//		todo1.setUpdatedAt(currentDate1.getTime() / 100);
//		String dateString1 = "09 Nov 2012 8:00 pm";
//		DateFormat dateFormat1 = new SimpleDateFormat("dd MMM yyyy hh:mm a");
//		Date date1 = dateFormat1.parse(dateString1);
//		long unixTime1 = date1.getTime()/1000;
//		todo1.setTime(unixTime1);
//		todoRepository.save(todo1);

}
