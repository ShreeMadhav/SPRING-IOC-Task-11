package com.feed.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.feed.model.Feedback;
import com.feed.repository.FeedbackRepository;

@Controller 
public class FeedbackServerlet {
	 @Autowired
	    private FeedbackRepository feedbackRepository;

	    @PostMapping("/submitFeedback")
	    @ResponseBody
	    public String submitFeedback(@RequestParam String name, 
	                                 @RequestParam String bookName, 
	                                 @RequestParam String feedback) {
	        // Create feedback object
	        Feedback fb = new Feedback();
	        fb.setName(name);
	        fb.setBookName(bookName);
	        fb.setFeedback(feedback);
	        
	        // Save to database
	        feedbackRepository.save(fb);
	        
	        return "Feedback saved!";
	    }

}
