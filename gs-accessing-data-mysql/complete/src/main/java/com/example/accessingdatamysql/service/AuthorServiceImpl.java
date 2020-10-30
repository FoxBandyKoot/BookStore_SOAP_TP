package com.example.accessingdatamysql.service;

//import com.example.accessingdatamysql.models.entities.Author;
//import com.example.accessingdatamysql.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class AuthorServiceImpl implements AuthorService{

//    private AuthorRepository repository;

//    @Autowired
//    public AuthorServiceImpl(AuthorRepository repository) {
//        this.repository = repository;
//    }

//    @Override
//    public Author getAuthorById(Integer id) {
//            return this.repository.findById(id).get();
//    }

//    @Override
//    public Author getAuthorByName(String name) {
//        return this.repository.findByName(name);
//    }

//    @Override
//    public Author getAuthorByFirstName(String firstName){
//        return this.repository.findByFirstName(firstName);
//    }

//    @Override
//    public List < Author > getAllAuthors() {
//        List< Author > list = new ArrayList< >();
//        repository.findAll().forEach(list::add);
//        return list;
//    }
//
//    @Override
//    public Author addAuthor(Author author) {
//        try {
//            return this.repository.save(author);
//        } catch (Exception e) {
//            e.printStackTrace();
//            return null;
//        }
//
//    }
//
//    @Override
//    public boolean updateAuthor(Author author) {
//        try {
//            this.repository.save(author);
//            return true;
//        } catch (Exception e) {
//            e.printStackTrace();
//            return false;
//        }
//    }
//
//    @Override
//    public boolean deleteAuthorById(Integer id) {
//        try {
//            this.repository.deleteById(id);
//            return true;
//        } catch (Exception e) {
//            return false;
//        }
//
//    }
}
