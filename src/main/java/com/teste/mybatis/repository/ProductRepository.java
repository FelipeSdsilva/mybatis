package com.teste.mybatis.repository;

import com.teste.mybatis.entities.Product;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface ProductRepository {


    @Insert("INSERT INTO tb_products (name, description) VALUES (#{name}, #{description})")
    void insert(Product product);

    @Select("SELECT * FROM tb_products WHERE id = #{id}")
    Product getById(Long id);

    @Select("SELECT * FROM tb_products")
    List<Product> listAllproduct();

    @Update("UPDATE tb_products SET name= #{name}, description = #{description} WHERE id = #{id} ")
    void update(Product product);

    @Delete("DELETE FROM tb_products WHERE id = #{id}")
    void deleteById(Long id);

}
