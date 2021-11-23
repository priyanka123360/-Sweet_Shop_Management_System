package com.workshop.demo;

import java.util.Scanner;

public class Application {
	final static int Exit_Value = 5;
	
	SweetStore sweetstore = new SweetStore();
	UserInterface userInterface = new UserInterface();

	public static void main(String[] args) {
		System.out.println("Welcome to Sweet Shop.");

		UserInterface userInterface = new UserInterface();
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

	private void handleUserSelection(int input) {
		UserInterface userInterface = new UserInterface();
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
		case 4:
			UserInterface userInterface1 = new UserInterface();
			userInterface1.PrintAllSweet(sweetstore.getList());
			break;
		case Exit_Value:
			System.out.println("Thank You");
			break;
			}
		}
	}
