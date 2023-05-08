package com.sbkim.board.repository;

import com.sbkim.board.entity.Company;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.List;

@SpringBootTest
class CompanyRepositoryTest {

    @Autowired
    CompanyRepository companyRepository;

    @Test
    @DisplayName("DB 연결 테스트")
    public void dbConTest() {

        System.out.println("test : " + companyRepository.findAll());
    }


}