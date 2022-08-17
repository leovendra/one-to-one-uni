package com.ty.controller;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.dto.OperatingSystem;

public class GetOSById {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");
		EntityManager manager = factory.createEntityManager();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter OS Id : ");
		int id = sc.nextInt();

		OperatingSystem os = manager.find(OperatingSystem.class, id);
		if (os != null) {
			System.out.println(os.getId());
			System.out.println(os.getCompanyName());
			System.out.println(os.getVersion());
			System.out.println(os.getKey());
		} else {
			System.out.println("Operating System Not Found !!!");
		}
	}

}
