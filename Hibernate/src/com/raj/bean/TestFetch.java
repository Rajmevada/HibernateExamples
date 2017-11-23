package com.raj.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
public class TestFetch {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	String name;
	String addreshA;
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getAddreshA() {
		return addreshA;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAddreshA(String addreshA) {
		this.addreshA = addreshA;
	}
	public TestFetch() {
		// TODO Auto-generated constructor stub
	}
	public TestFetch(int id, String name, String addreshA) {
		super();
		this.id = id;
		this.name = name;
		this.addreshA = addreshA;
	}
	
	

}
