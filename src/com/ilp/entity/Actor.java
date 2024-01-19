package com.ilp.entity;

import java.util.ArrayList;

import interfaces.ActorRemuneration;
import interfaces.Celebrity;


//Celebs is open to extention & closed to modification
public class Actor extends Celeb implements ActorRemuneration,Celebrity {
     public Actor(String celebId, String name) {
		super(celebId, name);
		// TODO Auto-generated constructor stub
	}
	private ArrayList<String> actedMovies;
	public ArrayList<String> getActedMovies() {
		return actedMovies;
	}
	public void setActedMovies(ArrayList<String> actedMovies) {
		this.actedMovies = actedMovies;
	}
	@Override
	public void displayRemuneration() {
		 
		  System.out.println("Actor Remuneration");
	 }
	@Override
	public void displayDateOfBirth() {
		System.out.println("Date Of Birth");
	}
}
