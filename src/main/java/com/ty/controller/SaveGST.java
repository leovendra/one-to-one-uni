package com.ty.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.dto.Company;
import com.ty.dto.GST;

public class SaveGST {

	public static void main(String[] args) {

		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		Company com = new Company();
		com.setName("Honda");
		com.setPhone("789512346");
		GST gst = new GST();
		gst.setGstNumber("GSTIN4567");
		gst.setCompany(com);
		
		
		transaction.begin();
		
		manager.persist(com);
		manager.persist(gst);
		transaction.commit();
	}

}
