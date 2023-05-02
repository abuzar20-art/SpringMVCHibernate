package springMvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springMvc.model.User;
import springMvc.service.UserService;

@Controller
public class ContactController {
	
	@Autowired
	private UserService userService;

	@ModelAttribute
	public void commonData(Model m) {
		
		m.addAttribute("Header", "Registration");
		m.addAttribute("description", "Here are your details");
		System.out.println("Adding common data to model");
	}
	
	
	
	@RequestMapping("/contact")
	public String showForm(Model m) {
//		m.addAttribute("Header", "Registration");
//		m.addAttribute("description", "Here are your details");
		System.out.println("creating form");
		return "contact";
	}

	@RequestMapping(value = "/processform", method = RequestMethod.POST)
	public String handleForm(@ModelAttribute User user, Model model) {

		System.out.println(user);
		
//		model.addAttribute("user", user);
//		model.addAttribute("Header", "This is a registration page");
//		model.addAttribute("description", "Please enter your details");
		
		if(user.getUserName().isEmpty()) {
			return "contact";
		}
		
		int createdUser = userService.createUser(user);
		model.addAttribute("msg", "User created with id = " + createdUser);
		return "success";
	}

	
	
	/*
	 * @RequestMapping(value = "/processform", method = RequestMethod.POST) public
	 * String handleForm(
	 * 
	 * @RequestParam("email") String userEmail,
	 * 
	 * @RequestParam("userName") String name,
	 * 
	 * @RequestParam("userPassword") String password, Model model) {
	 * 
	 * // String email = req.getParameter("email"); //HttpServletRequest req //
	 * System.out.println("user  Email is " + email);
	 * 
	 * // System.out.println("Email is " + userEmail); //
	 * System.out.println("Name is :" + name); // System.out.println("Password is "
	 * + password);
	 * 
	 * User user = new User(); user.setEmail(userEmail); user.setUserName(name);
	 * user.setUserPassword(password); System.out.println(user);
	 * 
	 * // model.addAttribute("name", name); // model.addAttribute("Email",
	 * userEmail); // model.addAttribute("Password", password);
	 * 
	 * model.addAttribute("user", user);
	 * 
	 * return "success"; }
	 */
	
}
