package com.product.productService.services;

import com.product.productService.domain.Product;
import com.product.productService.repository.InProductRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServeClass implements InProductServe{
    @Autowired
    InProductRepos inProductRepos;

    public ProductServeClass(InProductRepos inProductRepos) {
        this.inProductRepos = inProductRepos;
    }

    @Override
    public Product saveProductDetails(Product product) {
        return inProductRepos.save(product);
    }

    @Override
    public List<Product> getAllDetails() {
        return (List<Product>)inProductRepos.findAll();
    }
}
