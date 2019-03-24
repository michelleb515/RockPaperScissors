package dmacc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import dmacc.beans.Game;

//This Spring MVC annotation tells Spring Boot to use this component to handle web-based requests:
@Controller
public class WebController {
	
	//Remember how the anchor link in the index.html page linked to a resource named playagame? 
	//		The @GetMapping annotation is what connects that anchor	link to the playGame method of the WebController.
	//			<a href="/playagame?choice=rock">rock</a>
	
	//Furthermore, the anchor link contains a parameter named choice. The value associated with this parameter is automatically 
		//assigned to the method argument named theChoice through the @RequestParam annotation.
		//	@RequestParam(name="choice", required=false) String theChoice
	
	@GetMapping("/playagame")
	public String playGame(@RequestParam(name = "choice", required = false) String theChoice, Model model) {
		if (theChoice == null) {
			//This triggers the invocation of the index.html file
			return "index";
		}

		//A	game variable named theOutcome is assigned a value of all the instance variables 
		//and is subsequently attached to the Spring MVC model class through the addAttribute method.
		Game theOutcome = new Game(theChoice);
		model.addAttribute("game", theOutcome);

		//This triggers the invocation of the results.html file for view generation 
		return "results";
	}
}
