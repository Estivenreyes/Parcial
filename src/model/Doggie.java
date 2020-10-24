package model;

import processing.core.PApplet;

public class Doggie {
	
	private PApplet app;
	private String name, race;
	private int age, birthDate, id;
	
	
	public Doggie (PApplet app, String name, String race, int age, int birthDate, int id) {
		
		this.app = app;
		this.name = name;
		this.race = race;
		this.age = age;
		this.birthDate = birthDate;
		this.id = id;
		
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getRace() {
		return race;
	}


	public void setRace(String race) {
		this.race = race;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public int getBirthDate() {
		return birthDate;
	}


	public void setBirthDate(int birthDate) {
		this.birthDate = birthDate;
	}
}
