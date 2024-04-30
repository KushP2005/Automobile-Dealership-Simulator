// Kush Pandya 6 9 2023
package vehicle;

import acm.program.*;
import acm.graphics.*;
import java.awt.*;
import java.util.*;
public class TestAutomobile extends ConsoleProgram {
	
	private static final long serialVersionUID = 1L;

	public void init() {
		// Set screen size to 1200 x 800 pixels
		setSize(1200,800);
		
		
		GridLayout grid = new GridLayout(1, 2);
		setLayout(grid);

		/* The GCanvas screen is added to the next grid element position 
		 * in the screen layout */
		canvas = new GCanvas();
		add(canvas);
	}
	
	public void run() {

		setFont("Arial-24");
		setTitle("Vehicle Dealership");
		Automobile decision = null;
		String makeQuery = null;
		String model = null;
		int speed;
		
		println("Welcome to the Vehicle Dealership! Would you like to purchase a car or truck?");
		
		int choice = readInt("Press 1 for Car, 2 for Truck: ");
		if (choice == 1) {
			decision = new Car();
		}
		else if (choice == 2) {
			decision = new Truck();
		}
		else{
			println("Invalid Choice");
		}
		speed = (int)(Math.random()*(200-75+1)+75);
		decision.setSpeed(speed);
		int year = (int)(Math.random()*(2023-2000+1)+2000);
		decision.setYear(year);
		int maxPrice = readInt("How much are you willing to spend on this vehicle? ");
		int minPrice = maxPrice - maxPrice/5;
		int carPrice = (int)(Math.random()*(maxPrice-minPrice+1)+minPrice);
		decision.setCost(carPrice);
		String color = readLine("What color are you looking for? ");
		decision.setColor(color);
		Color col = getColor(color);
		String make = readLine("Are you looking to purchase from a specific company? ");
		if(make.equals("yes") || make.equals("Yes")) {
			makeQuery = readLine("What company are you looking to buy from? ");
			decision.setMake(makeQuery);
			model = readLine("From " + makeQuery + ", which model are you interested in? ");
		}
		else {
			String[] carMakes = new String[]{"Subaru","Dodge","Audi","Mercedes","BMW","Honda","Toyota","Lexus","Mitsubishi","Ford"};
			int rnd = new Random().nextInt(carMakes.length);
			makeQuery = carMakes[rnd];
			decision.setMake(makeQuery);
			pause(1000);
			model = carModelGenerator(makeQuery);
			
		}
		
		decision.setModel(model);
		println(decision.toString() +" found." + " Sending results...");
		pause(500);
		println("We found a " + color + " " + makeQuery + " " + model + " for $" + carPrice);
		decision.draw(col, canvas);

		println();
		println("Full Configuration for Vehicle");
		

		if(decision.name().equals("Car")) {
			Car clone = (Car) decision.clone();
			println("" +clone.toString());
			println(clone.getMake());
			println(clone.getModel());
			println(clone.getCost());
			println(clone.getSpeed());
			println(clone.getColor());
			println(clone.getYear());

		}
		else {
			Truck clone = (Truck) decision.clone();
			println(clone.toString());
			println(clone.getMake());
			println(clone.getModel());
			println(clone.getCost());
			println(clone.getSpeed());
			println(clone.getColor());
			println(clone.getYear());
		}
		
		
	}
	private GCanvas canvas;
	
	private String carModelGenerator(String makeQuery) {
		String carMake = null;
		switch (makeQuery.toLowerCase()) {
	    case "honda":
	        carMake = "Civic";
	        break;
	    case "toyota":
	    	carMake = "Prius";
	        break;
	    case "audi":
	    	carMake = "A4";
	        break;
	    case "mercedes":
	    	carMake = "C 300 4MATIC Sedan";
	        break;
	    case "ford":
	    	carMake = "Focus";
	        break;
	    case "subaru":
	    	carMake = "Impreza";
	        break;
	    case "dodge":
	    	carMake = "Dart";
	        break;
	    case "bmw":
	    	carMake = "330e Sedan";
	        break;
	    case "lexus":
	    	carMake = "ES 350";
	        break;
	    case "mitsubishi":
	    	carMake = "Lancer";
	        break;
	        }
		return carMake;
	}

	private static Color getColor(String colorStr) {
	Color color = null;
    switch (colorStr.toLowerCase()) {
    case "black":
        color = Color.BLACK;
        break;
    case "blue":
        color = Color.BLUE;
        break;
    case "cyan":
        color = Color.CYAN;
        break;
    case "darkgray":
        color = Color.DARK_GRAY;
        break;
    case "gray":
        color = Color.GRAY;
        break;
    case "green":
        color = Color.GREEN;
        break;
    case "yellow":
        color = Color.YELLOW;
        break;
    case "lightgray":
        color = Color.LIGHT_GRAY;
        break;
    case "magneta":
        color = Color.MAGENTA;
        break;
    case "orange":
        color = Color.ORANGE;
        break;
    case "pink":
        color = Color.PINK;
        break;
    case "red":
        color = Color.RED;
        break;
    case "white":
        color = Color.WHITE;
        break;
        }
    return color;
    }
}
