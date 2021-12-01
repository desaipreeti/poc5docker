package com.neosoft.poctask.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "user")
public class User {
	
	@Id
	private int id;
	
	private String name;
	
	private String email;
	
	private String address;
	
	private Date doj;
	
	private List<Books> blist= new ArrayList();

	public User(int id, String name, String email, String address, Date doj) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.address = address;
		this.doj = doj;
	}
	
	
	

}
