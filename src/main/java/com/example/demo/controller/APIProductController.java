package com.example.demo.controller;

import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
public class APIProductController {
    @Autowired
    ProductRepository productRepository;

    @GetMapping("/products")
    public ResponseEntity findAll() {
        return new ResponseEntity(productRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping("/products")
    public ResponseEntity save(@RequestBody Product product) {
        productRepository.save(product);
        return new ResponseEntity(HttpStatus.OK);
    }

    @PutMapping("/products/{id}")
    public ResponseEntity edit(@PathVariable Long id, @RequestBody Product product) {
        productRepository.save(product);
        return new ResponseEntity(HttpStatus.OK);
    }

    @DeleteMapping("/products/{id}")
    public ResponseEntity delete(@PathVariable Long id) {
        productRepository.deleteById(id);
        return new ResponseEntity(HttpStatus.OK);
    }
}

// Viết API CRUD: Blog (id, content, title, time);
// Tim blog theo title gan dung