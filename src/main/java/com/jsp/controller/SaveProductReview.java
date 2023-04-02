package com.jsp.controller;

import com.jsp.dto.Product;
import com.jsp.dto.Review;
import com.jsp.service.ProductService;
import com.jsp.service.ReviewService;

public class SaveProductReview {
	public static void main(String[] args) {

		ReviewService reviewService = new ReviewService();
		ProductService productService = new ProductService();

		Product p1 = new Product();
		p1.setBrand("Killer");
		p1.setName("jeans");
		p1.setPrice(2500);
		p1.setType("Clothing");
		productService.createProduct(p1);

		Review r1 = new Review();
		r1.setRating(4);
		r1.setStatus("Good");
		r1.setProduct(p1);
		reviewService.createReview(r1);

		Review r2 = new Review();
		r2.setRating(3);
		r2.setStatus("Good");
		r2.setProduct(p1);
		reviewService.createReview(r2);
	}
}
