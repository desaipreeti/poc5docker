package com.neosoft.poctask;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.neosoft.poctask.model.Books;
import com.neosoft.poctask.model.User;
import com.neosoft.poctask.repository.UserRepository;

@SpringBootTest
@TestMethodOrder(OrderAnnotation.class)
class Poc4microservice1ApplicationTests {

	/*
	 * @Autowired private UserRepository urepo;
	 * 
	 * 
	 * @Test
	 * 
	 * @Order(1) public void testPost()
	 * 
	 * { User u= new User(); u.setAddress("ravet"); u.setEmail("u@gmal.com");
	 * u.setId(2); u.setName("preeti"); u.setBlist(new ArrayList<Books>());
	 * 
	 * Date d2=new Date(); u.setDoj(d2); urepo.save(u);
	 * assertNotNull(urepo.getUserById(2));
	 * 
	 * }
	 * 
	 * 
	 * 
	 * @Test
	 * 
	 * @Order(2) public void testGetAll () { List list = (List) urepo.findAll();
	 * assertThat(list).size().isGreaterThan(0); }
	 * 
	 * 
	 * @Test
	 * 
	 * @Order(3) public void testgetSingle () { User u = urepo.getUserById(2);
	 * assertEquals("preeti", u.getName()); }
	 * 
	 * 
	 * @Test
	 * 
	 * @Order(4) public void testUpdate () { User u = urepo.getUserById(2);
	 * u.setName("priya");; urepo.save(u); assertNotEquals("pp",
	 * urepo.getUserById(2).getName()); }
	 * 
	 * 
	 * @Test
	 * 
	 * @Order(5) public void testDelete () { urepo.deleteUserById(2);;
	 * assertThat(urepo.existsById(2)).isFalse(); }
	 * 
	 */
}
