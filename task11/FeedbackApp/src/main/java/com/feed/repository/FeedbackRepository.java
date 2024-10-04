package com.feed.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.feed.model.Feedback;

public interface FeedbackRepository extends JpaRepository<Feedback, Long> {
}
