package com.example.ToDo;

import com.example.ToDo.presentacion.SistemasTareasFx;
import javafx.application.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ToDoApplication {

	public static void main(String[] args) {
//		SpringApplication.run(ToDoApplication.class, args);
		Application.launch(SistemasTareasFx.class, args);
	}

}
