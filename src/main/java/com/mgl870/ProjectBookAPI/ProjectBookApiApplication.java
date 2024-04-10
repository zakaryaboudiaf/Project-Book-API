package com.mgl870.ProjectBookAPI;

import com.mgl870.ProjectBookAPI.entity.Book;
import com.mgl870.ProjectBookAPI.repository.BookRepository;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.CommandLineRunner;

@SpringBootApplication
public class ProjectBookApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectBookApiApplication.class, args);
	}

	@Bean
	public CommandLineRunner sampleData(BookRepository repository) {
		return (args) -> {
			repository.save(new Book("Ce que le jour doit à la nuit", "Yasmina Khadra", "descreption 1"));
			repository.save(new Book("L'Étranger", "Albert Camus", "descreption 2"));
			repository.save(new Book("La Bâtarde d'Istanbul", "Elif Shafak", "descreption 3"));
		};
	}
}
