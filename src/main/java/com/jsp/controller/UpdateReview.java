package com.jsp.controller;

import com.jsp.service.ReviewService;

public class UpdateReview {
	public static void main(String[] args) {

		ReviewService reviewService = new ReviewService();
		reviewService.updateReviewById(1, 4, "Good");
	}
}
