package com.sbkim.board.sservice;

import com.sbkim.board.entity.Product;
import com.sbkim.board.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;


    // 게시글 리스트 처리
    public Page<Product> productList(Pageable pageable) {
        return productRepository.findAll(pageable);
    }
}
