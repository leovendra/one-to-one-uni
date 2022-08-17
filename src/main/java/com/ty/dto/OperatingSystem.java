package com.ty.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class OperatingSystem {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private int id;
	private String companyName;
	private String version;

	@OneToOne
	private ProductKey key;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public ProductKey getKey() {
		return key;
	}

	public void setKey(ProductKey key) {
		this.key = key;
	}

	@Override
	public String toString() {
		return "OperatingSystem [id=" + id + ", companyName=" + companyName + ", version=" + version + ", key=" + key
				+ "]";
	}

}
