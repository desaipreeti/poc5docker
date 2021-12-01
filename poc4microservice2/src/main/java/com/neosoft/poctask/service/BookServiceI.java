package com.neosoft.poctask.service;

import java.util.List;

import com.neosoft.poctask.model.Books;

public interface BookServiceI  {
	
	public List<Books> getAllBooks(int id);
	
	public Books saveBook(Books b);
	
	public void delteBook(int id);
	
	public List<Books>editBook(int id);
	
	public List<Books> updateBook(List<Books> b);
	
	public Books getBookByBid(int bid);
	
	
	public List<Books>getAllBook();

}
