package com.teste.mybatis.controllers;

import com.teste.mybatis.dto.ProductDTO;
import com.teste.mybatis.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/products")
public class ProductController {

    @Autowired(required = true)
    private ProductService service;

    @GetMapping
    public ResponseEntity<List<ProductDTO>> getAllProductsListed() {
        return ResponseEntity.ok().body(service.listAllProductsPerList());
    }
}
