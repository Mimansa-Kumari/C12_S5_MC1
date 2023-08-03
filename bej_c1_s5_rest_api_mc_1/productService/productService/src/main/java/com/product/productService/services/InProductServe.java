package com.product.productService.services;

import com.product.productService.domain.Product;

import java.util.List;

public interface InProductServe {
    Product saveProductDetails(Product product);
    List<Product> getAllDetails();
}
