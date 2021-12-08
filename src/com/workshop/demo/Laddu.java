package com.workshop.demo;

import java.util.ArrayList;

public class Laddu extends Sweet {
	public Laddu() {
	shape =  Shape.TRIANGLE;
	colour = Colour.WHITE;
	ingredient = new ArrayList();
	ingredient.add("Sugar");
	ingredient.add("Flour");
	name = "Laddu";
	}
}
