package com.workshop.demo;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Application {
	final static int Exit_Value = 5;

//	SweetStore sweetstore = SweetStore.getInstance();
//	UserInterface userInterface = UserInterface.getInstance();

	public static void main(String[] args) {
		System.out.println("Welcome to Sweet Shop.");

		UserInterface userInterface = UserInterface.getInstance();
		Application application = new Application();
		while (true) {
			int input = userInterface.showUserMenu();
			application.handleUserSelection(input);
			if (input == Exit_Value) {
				break;
			}

		}
		System.out.println("The END");
	}

	Scanner sc = new Scanner(System.in);

	public void updateSweet(Sweet sweet) {
		System.out.println("Enter \n1.Shape\n2.Color \n3. Price \n4. Name \n5. Ingredient");
		int option = sc.nextInt();
			switch (option) {
				case 1:
					editShape(sweet);
					break;
				case 2:
					editColour(sweet);
					break;
				case 3:
					editPrice(sweet);
					break;
				case 4:
					editName(sweet);
					break;
				case 5:
					editIngredient(sweet);
					break;
				default:
					System.exit(0);
				}
	}

	private void editIngredient(Sweet sweet) {
		System.out.println("Enter All New Ingredients");
		String newIngredients = sc.nextLine();
		sweet.ingredient.clear();
		String[] newIngredientsArr = newIngredients.split(" ");
		sweet.ingredient = Arrays.asList(newIngredientsArr);
	}

	private void editName(Sweet sweet) {
		System.out.println("Enter the updated Price.");
		String newName = sc.next();
		sweet.name = newName;

	}

	private void editPrice(Sweet sweet) {
		System.out.println("Enter the updated Price.");
		int Price = sc.nextInt();
		sweet.price = Price;

	}

	private void editShape(Sweet sweet) {
		System.out.println("Enter 1. Triangle 2. Reactangle 3. Round 4. Square");
		int shape = sc.nextInt();
		switch (shape) {
		case 1:
			sweet.shape = Sweet.Shape.TRIANGLE;
			break;
		case 2:
			sweet.shape = Sweet.Shape.RECTANGLE;
			break;
		case 3:
			sweet.shape = Sweet.Shape.ROUND;
			break;
		case 4:
			sweet.shape = Sweet.Shape.SQUARE;
			break;
		}
	}

	private void editColour(Sweet sweet) {
		System.out.println("Enter \n1.RED \n2.GREEN \n3.YELLOW\n4.WHITE");
		int colour = sc.nextInt();

		switch (colour) {

		case 1:
			sweet.colour = Sweet.Colour.RED;
			break;

		case 2:
			sweet.colour = Sweet.Colour.GREEN;
			break;

		case 3:
			sweet.colour = Sweet.Colour.YELLOW;
			break;

		case 4:
			sweet.colour = Sweet.Colour.WHITE;
			break;
		}

	}

	private void handleUserSelection(int input) {
		UserInterface userInterface = UserInterface.getInstance();
		SweetStore sweetstore = SweetStore.getInstance();
		switch (input) {
		case 1:
			
			Laddu laddu = new Laddu();
			laddu.price = 25;
			GulabJamoon gulabJamoon = new GulabJamoon();
			gulabJamoon.price = 65;
			Jalebii jalebii = new Jalebii();
			jalebii.price = 40;
			Modak modak = new Modak();
			MavaBarfii mavaBarfii = new MavaBarfii();
			MavaBarfii mavaBarfii2 = new MavaBarfii();

			sweetstore.add(jalebii);
			sweetstore.add(laddu);
			sweetstore.add(mavaBarfii);
			sweetstore.add(mavaBarfii);
			sweetstore.add(modak);
			break;
		case 2:
			
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter the Sweet name : ");
			String sweetName = scanner.nextLine();
			Sweet name = sweetstore.getSweet(sweetName);
			sweetstore.deleteSweet(name);
			break;
		case 3:
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Sweet to Update");
			String sweetName1 = sc.nextLine();
			Sweet sweet = sweetstore.getSweet(sweetName1);
			if (sweet != null) {
				updateSweet(sweet);
				}else {
				System.out.println("Sweet is not Available");
			}
			break;
		case 4:
			userInterface.PrintAllSweet(sweetstore.getList());
			break;
		case Exit_Value:
			System.out.println("Thank You");
			break;
		}
	}

	

	

}
