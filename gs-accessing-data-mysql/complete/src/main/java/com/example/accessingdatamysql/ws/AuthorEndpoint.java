package com.example.accessingdatamysql.ws;

import com.example.accessingdatamysql.models.dtos.AuthorDTO;
//import com.example.accessingdatamysql.models.entities.Author;
import com.example.accessingdatamysql.service.AuthorService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import java.util.ArrayList;
import java.util.List;

//public class AuthorEndpoint {
//
//    public static final String NAMESPACE_URI = "http://www.javaspringclub.com/authors-ws";
//
//    private AuthorService service;
//
//    public AuthorEndpoint() {
//
//    }
//
//    @Autowired
//    public AuthorEndpoint(AuthorService service) {
//        this.service = service;
//    }
//
//    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getAuthorByIdRequest")
//    @ResponsePayload
//    public GetAuthorByIdResponse getAuthorById(@RequestPayload GetAuthorByIdRequest request) {
//        GetAuthorByIdResponse response = new GetAuthorByIdResponse();
//        Author author = service.getAuthorById(request.getAuthorId());
//        AuthorDTO authorDTO = new AuthorDTO();
//        BeanUtils.copyProperties(author, authorDTO);
//        response.setAuthorDTO(authorDTO);
//        return response;
//
//    }
//
//    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getAllAuthorsRequest")
//    @ResponsePayload
//    public GetAllAuthorsResponse getAllAuthors(@RequestPayload GetAllAuthorsRequest request) {
//        GetAllAuthorsResponse response = new GetAllAuthorsResponse();
//        List<AuthorDTO> authorDTOList = new ArrayList<AuthorDTO>();
//        List<Author> authorList = service.getAllAuthors();
//        for (Author author : authorList) {
//            AuthorDTO authorDTO = new AuthorDTO();
//            BeanUtils.copyProperties(author, authorDTO);
//            authorDTOList.add(authorDTO);
//        }
//        response.getAuthorDTO().addAll(authorDTOList);
//
//        return response;
//
//    }
//
//    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "addAuthorRequest")
//    @ResponsePayload
//    public AddAuthorResponse addAuthor(@RequestPayload AddAuthorRequest request) {
//        AddAuthorResponse response = new AddAuthorResponse();
//        AuthorDTO newAuthorDTO = new AuthorDTO();
//        ServiceStatus serviceStatus = new ServiceStatus();
//
//        Author newAuthor = new Author(request.getTitle(), request.getCategory());
//        Author savedAuthor = service.addAuthor(newAuthor);
//
//        if (savedAuthor == null) {
//            serviceStatus.setStatusCode("CONFLICT");
//            serviceStatus.setMessage("Exception while adding Author");
//        } else {
//
//            BeanUtils.copyProperties(savedAuthor, newAuthorDTO);
//            serviceStatus.setStatusCode("SUCCESS");
//            serviceStatus.setMessage("Content Added Successfully");
//        }
//
//        response.setAuthorDTO(newAuthorDTO);
//        response.setServiceStatus(serviceStatus);
//        return response;
//
//    }
//
//    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "updateAuthorRequest")
//    @ResponsePayload
//    public UpdateAuthorResponse updateAuthor(@RequestPayload UpdateAuthorRequest request) {
//        UpdateAuthorResponse response = new UpdateAuthorResponse();
//        ServiceStatus serviceStatus = new ServiceStatus();
//        // 1. Find if author available
//        Author authorFromDB = service.getAuthorByTitle(request.getTitle());
//
//        if(authorFromDB == null) {
//            serviceStatus.setStatusCode("NOT FOUND");
//            serviceStatus.setMessage("Author = " + request.getTitle() + " not found");
//        } else {
//
//            // 2. Get updated author information from the request
//            authorFromDB.setTitle(request.getTitle());
//            authorFromDB.setCategory(request.getCategory());
//            // 3. update the author in database
//
//            boolean flag = service.updateAuthor(authorFromDB);
//
//            if(flag == false) {
//                serviceStatus.setStatusCode("CONFLICT");
//                serviceStatus.setMessage("Exception while updating Author=" + request.getTitle());;
//            }else {
//                serviceStatus.setStatusCode("SUCCESS");
//                serviceStatus.setMessage("Content updated Successfully");
//            }
//
//
//        }
//
//        response.setServiceStatus(serviceStatus);
//        return response;
//    }
//
//    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "deleteAuthorRequest")
//    @ResponsePayload
//    public DeleteAuthorResponse deleteAuthor(@RequestPayload
//                                                     DeleteAuthorRequest request) {
//        DeleteAuthorResponse response = new DeleteAuthorResponse();
//        ServiceStatus serviceStatus = new ServiceStatus();
//
//        boolean flag = service.deleteAuthorById(request.getAuthorId());
//
//        if (flag == false) {
//            serviceStatus.setStatusCode("FAIL");
//            serviceStatus.setMessage("Exception while deletint Author id=" + request.getAuthorId());
//        } else {
//            serviceStatus.setStatusCode("SUCCESS");
//            serviceStatus.setMessage("Content Deleted Successfully");
//        }
//
//        response.setServiceStatus(serviceStatus);
//        return response;
//    }
//
//}
