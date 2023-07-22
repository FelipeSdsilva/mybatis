package com.teste.mybatis.services;

import com.teste.mybatis.dto.ProductDTO;
import com.teste.mybatis.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProductService {

    @Autowired(required = true)
    private ProductRepository repository;

    @Transactional(readOnly = true)
    public List<ProductDTO> listAllProductsPerList() {
        return repository.listAllproduct().stream().map(ProductDTO::new).toList();
    }


}
