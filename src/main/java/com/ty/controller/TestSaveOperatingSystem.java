package com.ty.controller;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.dto.OperatingSystem;
import com.ty.dto.ProductKey;

public class TestSaveOperatingSystem {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();

		OperatingSystem os = new OperatingSystem();
		os.setCompanyName("Microsoft");
		os.setVersion("Windows 10");

		ProductKey pk = new ProductKey();
		pk.setLicensenum("9876-2345-3826");
		pk.setInstalledDate(LocalDate.of(2019, 10, 25));

		os.setKey(pk);

		OperatingSystem mos = new OperatingSystem();
		mos.setCompanyName("Apple");
		mos.setVersion("MacOs 9");

		ProductKey productKey = new ProductKey();
		productKey.setLicensenum("BCAD-LKPN-TUNE-WOEV");
		productKey.setInstalledDate(LocalDate.of(2017, 8, 11));

		mos.setKey(productKey);

		transaction.begin();

		manager.persist(productKey);
		manager.persist(pk);
		manager.persist(os);
		manager.persist(mos);
		transaction.commit();

		System.out.println("Done !!!");

	}

}
