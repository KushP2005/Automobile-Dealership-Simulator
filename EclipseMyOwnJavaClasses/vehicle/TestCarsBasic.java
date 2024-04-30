// Kush Pandya 6 9 2023
package vehicle;

import acm.program.*;
import acm.graphics.*;
import java.awt.*; 
public class TestCarsBasic extends ConsoleProgram {
	
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
		// Set font type and size
		setFont("Arial-24");
		
		/* Set the title for the program */
		setTitle("Console Window");
		
		Car car = new Car();
		car.setColor("Blue");
		car.setCost(20000);
		car.setMake("Ford");
		car.setModel("Explorer");
		car.setSpeed(75);
		car.setYear(2021);
		println(car.toString());
		Color color = Color.BLUE;
		
		println("");
		Car clone = car.clone();
		println(clone.toString());
		println(clone.equals(car));
		
		Truck truck = new Truck("F-150", "Ford", "Red", 2019,75,15000,20);
		int load = 20;
		Color truckColor = Color.RED;
		println(truck.equals(car)); // Truck does not equal car
		println(truck.drive());
		println(car.drive(2));
		
		int answer = readInt("Draw car (1) or Truck (2): ");
		if(answer == 1) {
			car.draw(color, canvas);
		}
		else if (answer == 2) {
			truck.draw(truckColor, canvas);
		}
		else {
			println("We only have Cars and Trucks in the Dealership.");
		}
		Truck truckClone = truck.clone();
		boolean test = truck.equals(truckClone);
		if (test == true) {
			println("The Truck, and its clone, are the same");
		}
		else {
			println("The Truck and its clone are not the same");
		}
		println();
		println("Clone of Car");
		Automobile auto = new Car();
		auto = car.clone();
		println("Color - " + auto.getColor());
		println("Make - " + auto.getMake());
		println("Model - " + auto.getModel());
		println("Year - " + auto.getYear());
		println("Cost - $" + auto.getCost());
		println("Speed - " + auto.getSpeed() + "km/h");
		
		println("\nClone of Truck");
		println("Color - " + truckClone.getColor());
		println("Make - " + truckClone.getMake());
		println("Model - " + truckClone.getModel());
		println("Year - " + truckClone.getYear());
		println("Cost - $" + truckClone.getCost());
		println("Speed - " + truckClone.getSpeed() + "km/h");
		println("Truck has load of " + load + "kg");
		
		println("");
		car.setMake(car.randomCarGenerator(car));
		truck.setMake(truck.randomTruckGenerator(truck));
		println(car.getMake());
		println(truck.getMake());
		
		println(truck.drive());
		println(truck.drive());
		println(truck.drive());
		println(truck.drive());
		truck.increaseSpeed();
		println(truck.drive());
		println(truck.drive());
		println(truck.drive());
		truck.repair();
		println(truck.drive());
		println(car.drive(4));
		
		
	}
	private GCanvas canvas;
}
