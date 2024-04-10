package com.mgl870.ProjectBookAPI.entity;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;



@Entity
@Getter
@ToString
@NoArgsConstructor
public class Book {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    @NotEmpty
    private String title;

    @NotEmpty
    private String author;

    private String description;

    // You might have more relevant attributes for a book, such as genre, publication date, etc.

    public Book(String title, String author, String description) {
        this.title = title;
        this.author = author;
        this.description = description;
    }

}