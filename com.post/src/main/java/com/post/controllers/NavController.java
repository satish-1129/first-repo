package com.post.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NavController 
{
	@GetMapping("/")
	public String createPost()
	{
		return "newPost";
	}
}
