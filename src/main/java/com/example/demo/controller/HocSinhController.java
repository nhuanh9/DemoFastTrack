package com.example.demo.controller;

import com.example.demo.repository.HocSinhRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HocSinhController {
    @Autowired
    HocSinhRepository hocSinhRepository;

    @GetMapping("/hocsinhs")
    public ResponseEntity findAll() {
        return new ResponseEntity(hocSinhRepository.findAll(), HttpStatus.OK);
    }
}
