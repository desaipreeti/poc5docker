package com.neosoft.poctask.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neosoft.poctask.model.Books;
import com.neosoft.poctask.repository.BookRepository;

@Service
public class BookServiceImp  implements BookServiceI{

	@Autowired
	BookRepository br;
	
	
	@Override
	public List<Books> getAllBooks(int id) {
		
		//return br.findAll();
		return br.getAllBookById(id);
	}

	@Override
	public Books saveBook(Books b) {
		
		return br.insert(b);
	}

	@Override
	public void delteBook(int id) {
	
		br.deleteBookById(id);
		
	}

	@Override
	public List<Books> editBook(int id) {
		
		
		
		return br.getAllBookById(id);
	}

	@Override
	public List<Books> updateBook(List<Books> b) {
		List <Books> bk= br.saveAll(b);
		return bk;
	}

	@Override
	public Books getBookByBid(int bid) {
		
		return br.getBookByBid(bid);
	}

	@Override
	public List<Books> getAllBook() {
		
		return br.findAll();
	}
	
	
	

}
