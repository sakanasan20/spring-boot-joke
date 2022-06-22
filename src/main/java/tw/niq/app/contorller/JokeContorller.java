package tw.niq.app.contorller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import tw.niq.app.service.JokeService;

@Controller
public class JokeContorller {

	private final JokeService jokeService;

	public JokeContorller(JokeService jokeService) {
		this.jokeService = jokeService;
	}
	
	@RequestMapping({"", "/"})
	public String showJoke(Model model) {
		
		model.addAttribute("joke", jokeService.getJoke());
		
		return "index";
	}
	
}
