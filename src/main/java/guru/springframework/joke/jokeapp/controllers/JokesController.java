package guru.springframework.joke.jokeapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import guru.springframework.joke.jokeapp.services.JokeService;


@Controller
public class JokesController {
	
	private JokeService jokeService;
	
	public JokesController(JokeService jokeService) {
		this.jokeService = jokeService;
	}
	
	@RequestMapping({"/"})
	public String getJoke(Model model) {
		
		String joke = jokeService.getJoke();
		model.addAttribute("joke", joke);
		return "chucknorris";
	}

}
