package ru.skypro.homework.dto;

import lombok.Data;

import java.util.Date;
@Data
public class AdsComment {
    private Integer author;
    private Integer id; // pk
    private String text;
    private Date createdAt;
}
