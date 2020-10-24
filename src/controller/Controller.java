package controller;

import model.DoggieList;
import processing.core.PApplet;

public class Controller {

	private PApplet app;
	private DoggieList doggieList;
	
	public Controller (PApplet app) {
		
		this.app = app;
		doggieList = new DoggieList(app);
		
	}
	
	public void SortBy(char key) {
		
		
	}
	
	public void Create() {
		
	}
	
}
