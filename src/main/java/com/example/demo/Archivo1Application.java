package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Archivo1Application implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(Archivo1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("que le paso a mi amigo dejo de ser chevere");
	}

}
