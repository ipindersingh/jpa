package com.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Student {
	@javax.persistence.Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private int Id;
	private String Ename;
	private int fee;
	private int num;
	
	public int getId() {
		return Id;
	}
	
	public Student() {
		super();
	}

	public void setId(int id) {
		Id = id;
	}
	
	public String getEname() {
		return Ename;
	}
	
	public void setEname(String ename) {
		Ename = ename;
	}
	
	public int getFee() {
		return fee;
	}
	
	public void setFee(int fee) {
		this.fee = fee;
	}
	
	public int getNum() {
		return num;
	}
	
	public void setNum(int num) {
		this.num = num;
	}
	
	public Student(int id, String ename, int fee, int num) {
		super();
		Id = id;
		Ename = ename;
		this.fee = fee;
		this.num = num;
	}
	
	@Override
	public String toString() {
		return "Student [Id=" + Id + ", Ename=" + Ename + ", fee=" + fee + ", num=" + num + "]";
	}

}
