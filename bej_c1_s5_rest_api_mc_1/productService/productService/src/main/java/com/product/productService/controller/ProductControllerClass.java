package com.product.productService.controller;

import com.product.productService.domain.Product;
import com.product.productService.services.InProductServe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1")
public class ProductControllerClass {
    InProductServe inProductServe;
    @Autowired
    public ProductControllerClass(InProductServe inProductServe) {
        this.inProductServe = inProductServe;
    }

    @PostMapping("/product")
    public ResponseEntity saveProductDetails(@RequestBody Product product)
    {
        Product product1 = inProductServe.saveProductDetails(product);
        return new ResponseEntity(product1, HttpStatus.CREATED);
    }
    @GetMapping("/products")
    public ResponseEntity getAllDetails()
    {
        List<Product> list = inProductServe.getAllDetails();
        return new ResponseEntity(list,HttpStatus.OK);
    }
}
