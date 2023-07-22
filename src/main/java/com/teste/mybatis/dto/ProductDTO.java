package com.teste.mybatis.dto;

import com.teste.mybatis.entities.Product;
import org.springframework.beans.BeanUtils;

public class ProductDTO {
    private Long id;
    private String name;
    private String description;

    public ProductDTO() {
    }

    public ProductDTO(Long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public ProductDTO(Product entity) {
        BeanUtils.copyProperties(entity, this);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String desccription) {
        this.description = desccription;
    }
}
