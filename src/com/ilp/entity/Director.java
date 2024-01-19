package com.ilp.entity;

import interfaces.Celebrity;

//Celebs is open to extenstion instead of modifications
//no unwanted interface is used, specific interface is used instead using interface segregation principle
//classes depends on high level module like interface rather than concrete implementations of the methods, hence dependency inversion principle is also implemented.
public class Director extends Celeb implements Celebrity {

	public Director(String celebId, String name, String assistants) {
		super(celebId, name);
		this.setAssistants(assistants);
	}
	
	private String assistants;
	@Override
	public void displayDateOfBirth() {
		System.out.println("Date Of Birth");
	}
	public String getAssistants() {
		return assistants;
	}
	public void setAssistants(String assistants) {
		this.assistants = assistants;
	}
	
	
}
