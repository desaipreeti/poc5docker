package com.neosoft.poctask;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.neosoft.poctask.model.Books;
import com.neosoft.poctask.repository.BookRepository;



@SpringBootTest
@TestMethodOrder(OrderAnnotation.class)
class Poc4microservice2ApplicationTests {

	/*
	 * @Autowired private BookRepository br;
	 * 
	 * 
	 * @Test
	 * 
	 * @Order(1) public void testPost()
	 * 
	 * { Books b = new Books(); b.setBid(2); b.setId(1); b.setPrice(43.4f);
	 * b.setBname("wof"); br.save(b); assertNotNull(br.findById(2));
	 * 
	 * }
	 * 
	 * 
	 * 
	 * @Test
	 * 
	 * @Order(2) public void testGetAll () { List list = (List) br.findAll();
	 * assertThat(list).size().isGreaterThan(0); }
	 * 
	 * 
	 * 
	 * 
	 * 
	 * @Test
	 * 
	 * @Order(3) public void testUpdate () { Books b = br.getBookByBid(2);
	 * b.setBname("CS"); br.save(b);
	 * 
	 * assertNotEquals("Com", br.getBookByBid(2).getBname()); }
	 * 
	 * 
	 * @Test
	 * 
	 * @Order(4) public void testDelete () { br.deleteBookByBid(2);;
	 * assertThat(br.existsById(2)).isFalse(); }
	 * 
	 */
}
