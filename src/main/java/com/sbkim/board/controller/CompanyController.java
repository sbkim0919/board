package com.sbkim.board.controller;

import com.sbkim.board.entity.Company;
import com.sbkim.board.sservice.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    @GetMapping("/list")
    @ResponseBody
    public Page<Company> list(@PageableDefault(page = 0, size = 10, sort = "companySeq", direction = Sort.Direction.DESC) Pageable pageable) {
//        model.addAttribute("data", "타임리프 예제 입니다.");
//        return "thymeleafEx/thymeleafEx01";
        companyService.companyList(pageable);
        return companyService.companyList(pageable);

    }

}
