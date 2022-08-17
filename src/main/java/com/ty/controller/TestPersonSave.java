package com.ty.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.dto.Pan;
import com.ty.dto.Person;

public class TestPersonSave {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");
		EntityManager manager = factory.createEntityManager();

		EntityTransaction transaction = manager.getTransaction();

		Person person = new Person();
		person.setName("Kumar");
		person.setAge(28);

		Pan pan = new Pan();
		pan.setPanNumber("BUAEM2842N");
		pan.setFatherName("RamaRao");
		person.setPan(pan);

		transaction.begin();
		manager.persist(person);
		manager.persist(pan);
		System.out.println("Done");
		transaction.commit();
	}

}
