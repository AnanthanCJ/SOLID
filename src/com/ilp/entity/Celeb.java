package com.ilp.entity;

public class Celeb {
 private String celebId;
 private String name;
 
 public Celeb(String celebId, String name) {
	super();
	this.celebId = celebId;
	this.name = name;
}
public String getCelebId() {
	return celebId;
}
public void setCelebId(String celebId) {
	this.celebId = celebId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

public void display() {
	System.out.println(  this.celebId + this.name);
}

 
 
 
}
