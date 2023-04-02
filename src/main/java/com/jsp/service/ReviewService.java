package com.jsp.service;

import java.util.List;

import com.jsp.dao.ReviewDao;
import com.jsp.dto.Review;

public class ReviewService {

	ReviewDao reviewDao = new ReviewDao();

	public Review createReview(Review review) {
		return reviewDao.createReview(review);
	}

	public Review getReviewById(int id) {
		return reviewDao.getReviewById(id);
	}

	public Review deleteReviewById(int id) {
		return reviewDao.deleteReviewById(id);
	}

	public Review updateReviewById(int id, int rating, String status) {

		return reviewDao.updateReviewById(id, rating, status);
	}

	public List<Review> getAllReview() {

		return reviewDao.getAllReview();
	}

}