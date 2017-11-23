package com.raj.bean;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table
public class StudentO2M  implements Serializable{

	private int id;
	private String name;
	private String addresh;
	private Set<SubjectO2M> subjectO2Ms=new HashSet<SubjectO2M>(0);
	
	public StudentO2M() {
		// TODO Auto-generated constructor stub
	}

	public StudentO2M(int id, String name, String addresh) {
		super();
		this.id = id;
		this.name = name;
		this.addresh = addresh;
	}

	public StudentO2M(int id, String name, String addresh, Set<SubjectO2M> subjectO2Ms) {
		super();
		this.id = id;
		this.name = name;
		this.addresh = addresh;
		this.subjectO2Ms = subjectO2Ms;
	}

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Student_Id")
	public int getId() {
		return id;
	}

	@Column(name="Student_Name")
	public String getName() {
		return name;
	}

	@Column(name="Student_Addresh")
	public String getAddresh() {
		return addresh;
	}

	@OneToMany(fetch=FetchType.LAZY)
	public Set<SubjectO2M> getSubjectO2Ms() {
		return subjectO2Ms;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddresh(String addresh) {
		this.addresh = addresh;
	}

	public void setSubjectO2Ms(Set<SubjectO2M> subjectO2Ms) {
		this.subjectO2Ms = subjectO2Ms;
	}
	
}
