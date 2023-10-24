package com.example.demo.controller;

import com.example.demo.model.HocSinh;
import com.example.demo.repository.HocSinhRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("/hocsinhss")
// categories
public class DemoAPI {
    @Autowired
    HocSinhRepository hocSinhRepository;
    @GetMapping
    public ResponseEntity findAll() {
        return new ResponseEntity(hocSinhRepository.findAll(), HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity save(@RequestBody HocSinh hocSinh) {
        hocSinhRepository.save(hocSinh);
        return new ResponseEntity(HttpStatus.OK);
    }
    @PutMapping("/{id}")
    public ResponseEntity update(@RequestBody HocSinh hocSinh, @PathVariable Long id) {
        hocSinh.setId(id);
        hocSinhRepository.save(hocSinh);
        return new ResponseEntity(HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable Long id) {
        hocSinhRepository.deleteById(id);
        return new ResponseEntity(HttpStatus.OK);
    }
}
