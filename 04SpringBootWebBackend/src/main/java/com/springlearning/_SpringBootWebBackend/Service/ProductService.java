package com.springlearning._SpringBootWebBackend.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.springlearning._SpringBootWebBackend.Model.Product;
import com.springlearning._SpringBootWebBackend.Repository.ProductRepo;

@Service
@CrossOrigin
public class ProductService {

    @Autowired
    private ProductRepo repo;
    
    public List<Product> getProducts() {
       return repo.findAll();
    }

    public Product productById(int id) {
       return repo.findById(id).get();
    }
}