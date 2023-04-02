package com.jsp.controller;

import com.jsp.service.ProductService;

public class ReadProduct {

	public static void main(String[] args) {

		ProductService productService = new ProductService();

		productService.getProductById(1);
	}
}
