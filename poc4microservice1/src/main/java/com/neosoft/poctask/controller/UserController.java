package com.neosoft.poctask.controller;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.neosoft.poctask.model.Books;
import com.neosoft.poctask.model.User;
import com.neosoft.poctask.service.ServiceI;
import com.neosoft.poctask.util.DemoFeignClient;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private ServiceI si;

	@Autowired
	private DemoFeignClient dfc;

	/*
	 * @Autowired private RestTemplate restTemplate;
	 */
	@GetMapping("/demo")
	public String getDemo()
	{
		return "welcome";
		
	}

	@PostMapping("/saveUser")
	public User saveUser(@RequestBody User u) {
		User user = si.addNewUser(u);
		return user;
	}

	@GetMapping("/getAll")
	public List<User> getAllUser() {
		User u = new User();
		 return si.getAllUsers();
		/*
		 * List l = dfc.getAllBooks(); u.setBlist(l); return l;
		 */

	}

	@GetMapping("getSingle/{id}")
	public User getById(@PathVariable int id) {
		User u = si.getUserById(id);

		// List book=
		// restTemplate.getForObject("http://bookservice/book/getAllBook/"+u.getId(),List.class);

		List book = dfc.getAllBooks(id);
		u.setBlist(book);
		return u;
	}

	@DeleteMapping("/deleteuser/{id}")
	public String deleteUser(@PathVariable int id) {
		
		dfc.deleteBook(id);
		return "user deleted";
	}

	@GetMapping("/sortDoj")
	public List<User> sortByDoj() {

		List<User> ulist = si.getAllUsers().stream().sorted(Comparator.comparing(User::getDoj))
				.collect(Collectors.toList());
		return ulist;
	}

	@GetMapping("edituser/{id}")
	public User editUser(@PathVariable int id)

	{
		
		User u = si.getUserById(id);
		List b=dfc.editBook(id);
		
		
 
		 
		 u.setBlist(b);
		 

		return u;
	}

	@PutMapping("/updateuser")
	public User updateUser(@RequestBody User u) {
		
		  User ulist = si.updateUser(u);
			
				 
		
		return ulist;
	}
}
