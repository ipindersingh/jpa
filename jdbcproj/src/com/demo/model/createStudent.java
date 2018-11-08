package com.demo.model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class createStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emFactory= Persistence.createEntityManagerFactory("jdbcproj");
		EntityManager entitymanager = emFactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		//removing a row
//		Student student= entitymanager.find(Student.class, 102);
//		entitymanager.remove(student);
		
		//updating a column
//		Student student= entitymanager.find(Student.class, 101);
//		student.setNum(1848);
		
		//creating a table
//		Student student = new Student();
//		student.setId(102);
//		student.setEname("Rajan");
//		student.setFee(1000);
//		student.setNum(6442);
//		
//		entitymanager.persist(student);
		entitymanager.getTransaction().commit();
		
		entitymanager.close();
		emFactory.close();
		
	}

}
