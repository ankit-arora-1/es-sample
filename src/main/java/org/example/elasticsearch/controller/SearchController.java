package org.example.elasticsearch.controller;


import org.example.elasticsearch.Repositories.ProductRepository;
import org.example.elasticsearch.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/search")
public class SearchController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping
    public void search() {
        Optional<Product> product = productRepository.findById("124");

        productRepository.save()
        System.out.println("DEBUG");
    }
}
