package com.ty.controller;

import com.ty.dao.PanDao;
import com.ty.dto.Pan;

public class GetPanByPersonName {

	public static void main(String[] args) {

		PanDao p = new PanDao();
		Pan pan = p.getPanByPersonName("kumar");
		if (pan != null) {
			System.out.println(pan);
		} else {
			System.out.println("Person Not Found!!!");
		}
	}

}
