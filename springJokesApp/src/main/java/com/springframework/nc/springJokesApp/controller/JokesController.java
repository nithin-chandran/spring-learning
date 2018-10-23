package com.springframework.nc.springJokesApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springframework.nc.springJokesApp.service.JokeService;

@Controller
public class JokesController {
	
	private JokeService jokeService;
	
	public JokesController(JokeService jokeService) {
		this.jokeService = jokeService;
	}
	@RequestMapping({"/",""})
	public String getChuckNorrisJoke(Model model) {
		model.addAttribute("joke", this.jokeService.getJoke());
		return "chuckNorris";
	}
}
