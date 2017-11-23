package com.raj.bean;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class SubjectO2M  implements Serializable{
	
	private int id;
	private String subName;
	private String subTeacher;
	private StudentO2M studentO2M;
	
	public SubjectO2M() {
		// TODO Auto-generated constructor stub
	}

	public SubjectO2M(int id, String subName, String subTeacher) {
		super();
		this.id = id;
		this.subName = subName;
		this.subTeacher = subTeacher;
	}

	public SubjectO2M(int id, String subName, String subTeacher, StudentO2M studentO2M) {
		super();
		this.id = id;
		this.subName = subName;
		this.subTeacher = subTeacher;
		this.studentO2M = studentO2M;
	}

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="SubjectId")
	public int getId() {
		return id;
	}

	@Column(name="Subject_Name")
	public String getSubName() {
		return subName;
	}
	
	@Column(name="Subject_Teacher")
	public String getSubTeacher() {
		return subTeacher;
	}
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="Stock_Id")
	public StudentO2M getStudentO2M() {
		return studentO2M;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setSubName(String subName) {
		this.subName = subName;
	}

	public void setSubTeacher(String subTeacher) {
		this.subTeacher = subTeacher;
	}

	public void setStudentO2M(StudentO2M studentO2M) {
		this.studentO2M = studentO2M;
	}
	
	
	
	
}
