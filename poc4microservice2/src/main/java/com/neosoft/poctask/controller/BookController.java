package com.neosoft.poctask.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neosoft.poctask.model.Books;
import com.neosoft.poctask.service.BookServiceI;

@RestController
@RequestMapping("/book")
public class BookController {
	
	
	
	@Autowired 
	BookServiceI bs;
	
	@GetMapping("/demo")
	public String getDemo()
	{
		return "welcome";
		
	}
	
	@PostMapping("/saveBook")
	public String saveBooks(@RequestBody Books b)
	{
		
		bs.saveBook(b);
		return "book saved";
	}
	
	@GetMapping("/getAllBook/{id}")
	public List<Books> getAllBooks(@PathVariable int id)
	{
		return bs.getAllBooks(id);
		
	}
	
	@DeleteMapping("/deleteBook/{id}")
	public String deleteBook(@PathVariable int id)
	{
		bs.delteBook(id);
		return "book deleted";
	}
	
	@GetMapping("/editBook/{id}")
	public List<Books> editBook(@PathVariable int id)
	{
		return bs.editBook(id);
		 
		
	}
	@PutMapping("/updateBook")
	public List<Books> updateBook(@RequestBody List<Books> b )
	{
		List<Books> bk= bs.updateBook(b);
		return bk;
		
	}

	
	@GetMapping("/getBook/{bid}")
	public Books getSingleBook(@PathVariable int bid)
	{
		Books b= bs.getBookByBid(bid);
		return b;
		
	}
	
	@GetMapping("/getAllBook")
	public List<Books> getAllBooks()
	{
		return bs.getAllBook();
		
	}
	
}
