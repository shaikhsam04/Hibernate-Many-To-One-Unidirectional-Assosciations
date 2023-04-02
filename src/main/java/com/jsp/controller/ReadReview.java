package com.jsp.controller;

import com.jsp.service.ReviewService;

public class ReadReview {
	public static void main(String[] args) {

		ReviewService reviewService = new ReviewService();

		reviewService.getReviewById(1);
	}

}
