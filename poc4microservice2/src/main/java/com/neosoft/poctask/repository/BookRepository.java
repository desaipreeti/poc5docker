package com.neosoft.poctask.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.neosoft.poctask.model.Books;

@Repository
public interface BookRepository extends MongoRepository<Books, Integer>  {
	
	
	@Query( value = "{bid : ?0}", delete = true)
	public void deleteBookByBid(Integer bid);
	
	
	
	@Query("{bid :?0}")                                                  
    public Books getBookByBid(Integer bid);
	
	@Query("{id:?0}")
	public List<Books> getAllBookById(int id);
	
	
	@Query( value = "{id : ?0}", delete = true)
	public void deleteBookById(Integer id);

	
	@Query("{id :?0}")                                                  
    public Books getBookById(Integer id);
}
