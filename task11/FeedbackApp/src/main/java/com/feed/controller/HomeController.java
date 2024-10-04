package com.feed.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	  @GetMapping("/feedbackForm")
	    public String feedbackForm() {
	        return "feedbackForm"; // This will render feedbackForm.html
	    }
}
