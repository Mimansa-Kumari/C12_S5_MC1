package com.product.productService.repository;

import com.product.productService.domain.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InProductRepos extends CrudRepository<Product,Integer> {
}
