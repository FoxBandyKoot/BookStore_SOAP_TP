package com.example.accessingdatamysql.models.dtos;

import lombok.Data;

@Data
public class BookDTO {

    private String title;
    private String isbn;
    private Integer authorId;
}
