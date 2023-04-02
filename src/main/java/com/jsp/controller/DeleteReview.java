package com.jsp.controller;

import com.jsp.service.ReviewService;

public class DeleteReview {

	public static void main(String[] args) {

		ReviewService reviewService = new ReviewService();
		reviewService.deleteReviewById(1);
	}

}
