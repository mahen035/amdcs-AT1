package com.training.spring;

import lombok.Data;

@Data
public class Car {
	
	private String make;
	private String model;
	private int year;
	
	public String getCarDetail() {
		return this.make+":"+this.model+":"+this.year;
	}

}
