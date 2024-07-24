package com.springlearning._SpringBootWebBackend.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springlearning._SpringBootWebBackend.Model.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer>{
    
}
