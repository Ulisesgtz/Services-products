package com.example.app.products.models.service;

import java.util.List;

import com.example.app.products.models.entity.Product;

public interface IProductoService  {
	
	public List<Product> findAll();
	public Product findById(Long id);

}
