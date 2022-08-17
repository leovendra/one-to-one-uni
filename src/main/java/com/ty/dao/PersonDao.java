package com.ty.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.dto.Person;

public class PersonDao {

	EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");
	EntityManager manager = factory.createEntityManager();
	EntityTransaction transaction = manager.getTransaction();

	public Person getPersonById(int id) {
		Person p = manager.find(Person.class, id);
		return p;
	}

}
