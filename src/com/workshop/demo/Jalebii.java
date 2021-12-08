package com.workshop.demo;

import java.util.ArrayList;

public class Jalebii extends Sweet {
	public Jalebii() {
		shape =  Shape.SQUARE;
		colour = Colour.RED;
		ingredient = new ArrayList();
		ingredient.add("Sugar");
		ingredient.add("Flour");
		name = "Jalebii";
	}

}
