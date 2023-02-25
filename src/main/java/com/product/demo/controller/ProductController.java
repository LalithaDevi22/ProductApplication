package com.product.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.product.demo.entity.Product;
import com.product.demo.service.ProductService;

@RestController
@RequestMapping("/api")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@GetMapping("/products")
	public List<Product> getUsers() {
		return productService.getAllProducts();
	}
	@GetMapping("/products/{id}")
	public Product getProduct(@PathVariable long id) {
		return productService.getProductById(id);
	}
	@GetMapping("/products1/{id}")
	public Product getProducts1(@PathVariable long id) {
		return productService.getProducts(id);
	}
	
	@PostMapping("/addproducts")
	public void addProducts(@RequestBody Product product) {
		productService.addProduct(product);
	}
	
	@PutMapping("/updateproducts/{id}")
	public Product updateProduct(@PathVariable long id,@RequestBody Product product) {
		return  productService.updateProduct(product, id);
	}
	
	@DeleteMapping("/deleteproducts/{id}")
	public void deleteProduct(@PathVariable long id) {
		productService.deleteProduct(id);
	}	
	
	
}

