package com.jsp.controller;

import com.jsp.service.ProductService;

public class DeleteProduct {

	public static void main(String[] args) {

		ProductService productService = new ProductService();
		productService.deleteProductById(1);
	}
}