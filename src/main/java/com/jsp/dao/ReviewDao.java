package com.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.dto.Review;

public class ReviewDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("sameer");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public Review createReview(Review review) {
		entityTransaction.begin();
		entityManager.persist(review);
		entityTransaction.commit();

		System.out.println("Review Details Saved...");
		return review;
	}

	public Review getReviewById(int id) {
		Review r1 = entityManager.find(Review.class, id);

		return r1;
	}

	public Review deleteReviewById(int id) {
		Review r1 = entityManager.find(Review.class, id);

		entityTransaction.begin();
		entityManager.remove(r1);
		entityTransaction.commit();

		System.out.println("Review Details deleted....");
		return r1;
	}

	public Review updateReviewById(int id, int rating, String status) {

		Review r1 = entityManager.find(Review.class, id);

		if (r1 != null) {
			r1.setRating(rating);
			r1.setStatus(status);
			entityTransaction.begin();
			entityManager.merge(r1);
			entityTransaction.commit();
		} else {
			System.out.println("Review not found...");
		}
		return r1;
	}

	public List<Review> getAllReview() {
		String sql = "select s from Review s";
		Query query = entityManager.createQuery(sql);

		List<Review> reviews = query.getResultList();

		return reviews;
	}

}
