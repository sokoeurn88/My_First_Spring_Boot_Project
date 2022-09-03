package com.example.demo;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class Users_Controller {
	
//	@GetMapping
//	public String getUsers() {
//		return "http Get request was sent to local host. if you want to see result user PostMan Tool with this url: http://localhost:8080/users";
//	}
	
	@GetMapping(path="/{userID}")	//Path Parameter
	public String getUser(@PathVariable String userID) {
		return "http Get request was sent for userid: "+userID;
	}
	
	@GetMapping		//Query Parameter
	public String getUsers(@RequestParam(value="page") int pageno, @RequestParam(value="limit") int limitno) {
		return "please user this url: http://localhost:8080/users?page=1&limit=50 , http Get request was sent to local host"+pageno+" and limit is: "+limitno;
	}
	
	@PostMapping
	public String createtUsers() {
		return "http Post request was sent";
	}
	
	@PutMapping
	public String updateUsers() {
		return "http Put request was sent";
	}
	
	@DeleteMapping
	public String deleteUsers() {
		return "http Delete request was sent";
	}

}
