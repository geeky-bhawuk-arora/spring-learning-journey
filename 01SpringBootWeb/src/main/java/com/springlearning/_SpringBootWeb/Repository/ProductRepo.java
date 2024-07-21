package com.springlearning._SpringBootWeb.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springlearning._SpringBootWeb.Model.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer>{


    
}
