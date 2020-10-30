package com.example.accessingdatamysql.models.dtos;

import lombok.Data;
import java.util.List;

@Data
public class AuthorDTO {

    private String name;
    private String firstName;
    private List<Integer> bookIdList;
}
