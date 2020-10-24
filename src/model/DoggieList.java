package model;

import java.util.LinkedList;

import processing.core.PApplet;

public class DoggieList {

	PApplet app;
	String[] datosUno; 
	String[] datosDos;
	String[] information;
	String[] dname, dage, dbirthDate, did, drace;
	String name, race;
	int birthDate, age, id;
	SortByDogName dogname;
	SortByDogId dogId;
	SortByDogBirthDate dogDate;
	SortByDogAge dogage;
	private LinkedList<Doggie> doggieList;
	
	public DoggieList (PApplet app) {
		
		this.app = app;
		datosUno = app.loadStrings("./data/imports/datosUno.txt");
		datosDos = app.loadStrings("./data/imports/datosDos.txt");
		doggieList = new LinkedList <Doggie>();
		dogname = new SortByDogName();
		dogId = new SortByDogId();
		dogDate = new SortByDogBirthDate();
		
		dname = new String [10];
		dage = new String [10];
		dbirthDate = new String [10];
		did = new String [10];
		drace = new String [10];
		
	}
	
	public void CreateDoggie() {
		
		for (int i = 0; i < datosUno.length; i++) {
			
			information = datosUno[i].split(",");
			name = information [1];
			id = Integer.parseInt(information[0]);
			age = Integer.parseInt(information[2]);
			
			doggieList.add(new Doggie(app, name, race, id, birthDate, age));
			
		}
		
		for (int j = 0; j < datosDos.length; j++) {
			
			information = datosDos[j].split(",");
			race = information [1];
			
		}
		
	}
}
