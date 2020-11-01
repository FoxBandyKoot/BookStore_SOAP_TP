package com.example.accessingdatamysql.service;

import com.example.accessingdatamysql.models.entities.Author;

import java.util.List;

public interface AuthorService {
     Author getAuthorById(Integer id);
//     Author getAuthorByName(String name);
//     Author getAuthorByFirstName(String firstName);
     List<Author> getAllAuthors();
     Author addAuthor(Author author);
     boolean updateAuthor(Author author);
     boolean deleteAuthorById(Integer id);
}
