package com.example.accessingdatamysql.controller;

import com.example.accessingdatamysql.models.dtos.AuthorDTO;
//import com.example.accessingdatamysql.models.entities.Author;
//import com.example.accessingdatamysql.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="/book-store")
public class MainController {
//	@Autowired
//	private AuthorRepository authorRepository;

	@PostMapping(path="/add-author")
	public @ResponseBody String addAuthor (AuthorDTO authorDTO) {

//		Author author = new Author();
//		author.setName(authorDTO.getName());
//		author.setFirstName(authorDTO.getFirstName());
//		author.setBookIdList(authorDTO.getBookIdList());
//		authorRepository.save(author);

		return "Author added";
	}

//	@GetMapping(path="/all-authors")
//	public @ResponseBody Iterable<Author> getAllAuthors() {
//		// This returns a JSON or XML with the users
//		return authorRepository.findAll();
//	}
}
