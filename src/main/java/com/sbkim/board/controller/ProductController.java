package com.sbkim.board.controller;

import com.sbkim.board.entity.Company;
import com.sbkim.board.entity.Product;
import com.sbkim.board.sservice.CompanyService;
import com.sbkim.board.sservice.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/list")
    @ResponseBody
    public Page<Product> list(@PageableDefault(page = 0, size = 10, sort = "productSeq", direction = Sort.Direction.DESC) Pageable pageable) {
//        model.addAttribute("data", "타임리프 예제 입니다.");
//        return "thymeleafEx/thymeleafEx01";
        productService.productList(pageable);
        return productService.productList(pageable);

    }

}
