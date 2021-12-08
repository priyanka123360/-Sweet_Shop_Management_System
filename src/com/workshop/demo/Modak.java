package com.workshop.demo;

import java.util.ArrayList;

public class Modak extends Sweet {
	public Modak() {
		shape =  Shape.ROUND;
		colour = Colour.YELLOW;
		ingredient = new ArrayList();
		ingredient.add("Sugar");
		ingredient.add("Floar");
		name = "Modak";
	}
	
}
