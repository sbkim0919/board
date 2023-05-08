package com.sbkim.board.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productSeq;

    private String name;
    private String osType;
    private String osBit;
    private String description;

    private LocalDateTime created;
    private LocalDateTime updated;

}
