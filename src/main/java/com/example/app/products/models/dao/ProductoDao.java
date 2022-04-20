package com.example.app.products.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.app.products.models.entity.Product;

public interface ProductoDao extends CrudRepository<Product, Long>{	

}
