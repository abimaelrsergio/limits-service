package com.abgi.microservices.limitsservice.bean;

import lombok.Getter;

@Getter
public class LimitConfiguration {

	private int maximum;
	private int minimum;

	public LimitConfiguration() {}
	
	public LimitConfiguration(int maximum, int minimum) {
		super();
		this.maximum = maximum;
		this.minimum = minimum;
	}

}
