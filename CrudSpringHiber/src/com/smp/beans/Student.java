package com.smp.beans;

import javax.persistence.*;

@Entity 
@Table(name="Smp")
public class Student
	
	{
	 @Id
	 private int Id;
	 private String name;
	 private String ClgName;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getClgName() {
		return ClgName;
	}
	public void setClgName(String clgName) {
		ClgName = clgName;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [Id=" + Id + ", name=" + name + ", ClgName=" + ClgName + "]";
	}
	 
	
}
