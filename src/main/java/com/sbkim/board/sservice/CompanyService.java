package com.sbkim.board.sservice;

import com.sbkim.board.entity.Company;
import com.sbkim.board.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class CompanyService {

    @Autowired
    CompanyRepository companyRepository;


    // 게시글 리스트 처리
    public Page<Company> companyList(Pageable pageable) {
        return companyRepository.findAll(pageable);
    }
}
