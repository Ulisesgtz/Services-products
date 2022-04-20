package com.example.app.products.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.app.products.models.entity.Product;
import com.example.app.products.models.service.IProductoService;

@RestController
public class ProductController {
	
	@Autowired
	private IProductoService productoService;

	@GetMapping("/list")
	public List<Product> showAllProduct(){
		return productoService.findAll();
	}
	
	@GetMapping("/product/{id}")
	public Product detail(@PathVariable Long id) {
		return productoService.findById(id);
	}
}
