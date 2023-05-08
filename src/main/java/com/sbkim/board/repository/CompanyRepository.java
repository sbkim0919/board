package com.sbkim.board.repository;

import com.sbkim.board.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Long> {

}
