package com.sbkim.board.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String title;

    @Lob
    @Column(name = "\"content\"", columnDefinition = "TEXT")
    private String content;

    private String fileName;

    private String filePath;
}
