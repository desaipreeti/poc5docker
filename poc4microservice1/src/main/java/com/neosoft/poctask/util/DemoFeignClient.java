package com.neosoft.poctask.util;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.neosoft.poctask.model.Books;

@FeignClient(name="bookservice" ,url = "http://bookservice/book")
public interface DemoFeignClient {
	
	@PostMapping("/saveBook")
	public String saveBooks(@RequestBody Books b);
	
	@GetMapping("/getAllBook/{id}")
	public List<Books> getAllBooks(@PathVariable int id);
	
	@DeleteMapping("/deleteBook/{id}")
	public String deleteBook(@PathVariable int id);
	
	@GetMapping("/editBook/{id}")
	public List<Books> editBook(@PathVariable int id);
	
	@PutMapping("/updateBook")
	public List<Books> updateBook(@RequestBody List<Books> b );
	
	@GetMapping("/getAllBook")
	public List<Books> getAllBooks();

}
