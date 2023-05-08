package com.sbkim.board.entity;

import lombok.Data;

import javax.persistence.*;
import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long companySeq;

    private String name;
    private String email;
    private String address;
    private String description;

    private LocalDateTime created;
    private LocalDateTime updated;

//    @OneToMany
//    @JoinColumn(name = "company_seq")
//    private List<Product> productList = new ArrayList<>();
}
