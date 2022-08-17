package com.ty.dto;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Person {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private int personId;
	private String name;
	private int age;

	@OneToOne(fetch = FetchType.LAZY)
	Pan pan;

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Pan getPan() {
		return pan;
	}

	public void setPan(Pan pan) {
		this.pan = pan;
	}

	@Override
	public String toString() {
		return "Person Id : " + personId + "\nPerson Name : " + name + "\nPerson Age : " + age
				+ "\nPerson PanDetails : \n------------\n" + pan + "\n------------\n";
	}

}
