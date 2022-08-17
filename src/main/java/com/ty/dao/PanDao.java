package com.ty.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.dto.Pan;
import com.ty.dto.Person;

public class PanDao {

	EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");
	EntityManager manager = factory.createEntityManager();
	EntityTransaction transaction = manager.getTransaction();

	public Pan getPanByPersonName(String name) {
		String selectper = "select p from Person p where p.name =  :pername";
		Query q = manager.createQuery(selectper);
		q.setParameter("pername", name);
		List<Person> per = q.getResultList();
		if (per != null) {
			Pan pan = manager.find(Pan.class, per.get(0).getPan().getPanId());
			return pan;
		}
		return null;
	}
}
