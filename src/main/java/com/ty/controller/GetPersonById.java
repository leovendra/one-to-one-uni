package com.ty.controller;

import java.util.Scanner;

import com.ty.dao.PersonDao;
import com.ty.dto.Person;

public class GetPersonById {

	public static void main(String[] args) throws InterruptedException {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Person Id : ");
		int id = sc.nextInt();

		PersonDao dao = new PersonDao();
		Person p = dao.getPersonById(id);
		if (p != null) {
			System.out.println(p.getName());
			
			System.out.println("----------------");
			Thread.sleep(2000);
			
			System.out.println(p.getPan().getPanNumber());
		} else {
			System.out.println("Person Not Found !!!");
		}
	}

}
