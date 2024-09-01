package com.example.rajat.springboot.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.rajat.springboot.entity.Product;
import com.example.rajat.springboot.repository.ProductRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
	
		@Autowired
	    private ProductRepository productRepository;

	    public List<Product> getAllProducts() {
	        return productRepository.findAll();
	    }

	    public Optional<Product> getProductById(Long id) {
	        return productRepository.findById(id);
	    }

	    public Product createProduct(Product product) {
	        return productRepository.save(product);
	    }

	    public Product updateProduct(Long id, Product productDetails) {
	        Product product = productRepository.findById(id).orElseThrow();
	        product.setName(productDetails.getName());
	        product.setDescription(productDetails.getDescription());
	        product.setPrice(productDetails.getPrice());
	        return productRepository.save(product);
	    }

	    public void deleteProduct(Long id) {
	        productRepository.deleteById(id);
	    }

}
