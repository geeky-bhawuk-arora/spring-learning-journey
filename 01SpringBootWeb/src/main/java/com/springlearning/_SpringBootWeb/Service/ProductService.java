package com.springlearning._SpringBootWeb.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.IntStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springlearning._SpringBootWeb.Model.Product;
import com.springlearning._SpringBootWeb.Repository.ProductRepo;

@Service
public class ProductService {

    @Autowired
    ProductRepo repo;

    List<Product> products = new ArrayList<>(Arrays.asList(
            new Product(101, "Dell", 50000),
            new Product(102, "Apple", 40000),
            new Product(103, "Asus", 60000)));

    public List<Product> getProducts() {
        // return products;
        return repo.findAll();

    }

    public Product getProductById(int prodId) {
        // return products.stream()
        //         .filter(p -> p.getProdId() == prodId)
        //         .findFirst().orElse(new Product(100, "No Item", 0));
        return repo.findById(prodId).orElse(new Product(100, "No Item", 0));
    }

    public void addProductToList(Product prod) {
        // products.add(prod);
        repo.save(prod);
    }

    public void updateProductinList(Product prod) {
        // int index = 0;
        // for (int i = 0; i < products.size(); i++) {
        //     if (products.get(i).getProdId() == prod.getProdId())
        //         index = i;
        // }
        // OptionalInt indexOpt = IntStream.range(0, products.size())
        // .filter(i -> products.get(i).getProdId() == prod.getProdId())
        // .findFirst();
        // return indexOpt.orElse(-1);
        // products.set(index, prod);
        repo.save(prod);
    }

    public void deleteProductById(int prodId) {
        // int index = 0;
        // for (int i = 0; i < products.size(); i++) {
        //     if (products.get(i).getProdId() == prodId)
        //         index = i;
        // }
        // products.remove(index);
        repo.deleteById(prodId);
    }
}
