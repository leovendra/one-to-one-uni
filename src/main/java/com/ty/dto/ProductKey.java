package com.ty.dto;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ProductKey {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private int id;
	private String licensenum;
	private LocalDate installedDate;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLicensenum() {
		return licensenum;
	}

	public void setLicensenum(String licensenum) {
		this.licensenum = licensenum;
	}

	public LocalDate getInstalledDate() {
		return installedDate;
	}

	public void setInstalledDate(LocalDate installedDate) {
		this.installedDate = installedDate;
	}

	@Override
	public String toString() {
		return "ProductKey [id=" + id + ", licensenum=" + licensenum + ", installedDate=" + installedDate + "]";
	}

}
