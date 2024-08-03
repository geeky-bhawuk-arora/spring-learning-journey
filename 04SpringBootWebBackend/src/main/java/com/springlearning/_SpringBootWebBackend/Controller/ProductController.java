package com.springlearning._SpringBootWebBackend.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springlearning._SpringBootWebBackend.Model.Product;
import com.springlearning._SpringBootWebBackend.Service.ProductService;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class ProductController {

    @Autowired
    private ProductService service;

    @GetMapping("/products")
    public List<Product> getAllProducts() {
        return service.getProducts();
     }

//    @CrossOrigin(origins = "http://localhost:5173")
    @GetMapping("/products/{id}")
    public Product getProductById(@PathVariable int id) {
        return service.productById(id);
     }
}