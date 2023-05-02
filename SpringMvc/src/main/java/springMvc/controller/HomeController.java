package springMvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping(path = "/home", method = RequestMethod.GET)
	public String home(Model model) {
		model.addAttribute("Name", "Mohammad Abuzar");
		model.addAttribute("Id", 1743);

		  List<String> friends = new ArrayList<String>();
		  friends.add("Rahul");
		  friends.add("Aalam");
		  friends.add("Vivek");
		  friends.add("Biswajit");
		  model.addAttribute("fr", friends);
		  
		System.out.println("this is our home controller");
		return "index" ;
	}

	@RequestMapping("/about")
	public String about() {
		System.out.println("this is about controller");
		return "about";
	}
	
	@RequestMapping("/help")
	public ModelAndView help() {
		System.out.println("This is help Controller");
		//creating model and view object
		ModelAndView modelAndView = new ModelAndView();
		//setting the data
		modelAndView.addObject("name", "Roshan");
		modelAndView.addObject("rollNo", 114324);
		LocalDateTime now = LocalDateTime.now();
		modelAndView.addObject("TimeAndDate", now);
		
		//marks
	             List<Integer> list = new ArrayList<Integer>();
	             list.add(69);
	             list.add(78);
	             list.add(89);
	             list.add(45);
	             list.add(67);
	             modelAndView.addObject("marks", list) ;       
	             
		
		//setting the view name
		modelAndView.setViewName("help");
		return modelAndView;
	}
}
