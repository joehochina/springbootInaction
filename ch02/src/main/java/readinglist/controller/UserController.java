package readinglist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import readinglist.domain.User;
import readinglist.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;
	

	@RequestMapping("/userList")
	public List<User> findAll(){

		return userService.findAll();
	}
	
	
}
