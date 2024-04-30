// Kush Pandya 6 9 2023
package vehicle;

import acm.graphics.*;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import acm.program.*;

public class Car extends Automobile {
	
	/**
	 * Creates a blank Car object
	 * @param none
	 * @return none
	 */
	public Car() {
		speed = 0;
		color = "";
		fuel = 100;
		model = "";
		make = "";
		year = 0;
		numVehicles++;
		}
	/**
	 * Creates a car with a model and make
	 * @param model
	 * @param make
	 * @return none
	 */
	public Car(String model, String make) {
		this.model = model;
		this.make = make;
		speed = 0;
		color = "";
		fuel = 100;
		year = 0;
		numVehicles++;
	}
	/**
	 * Creates a car with all parameters filled
	 * @param model
	 * @param make
	 * @param color
	 * @param year
	 * @param speed
	 * @param cost
	 * @return none
	 */
	public Car(String model, String make, String color, int year, int speed, int cost) {
		this.model = model;
		this.make = make;
		this.year = year;
		this.color = color;
		this.speed = speed;
		this.cost = cost;
		fuel = 100;
		numVehicles++;
	}
	/**
	 * Repairs car and sets fuel to maximum value
	 * @param none
	 * @return none
	 */
	public int repair() {
		return fuel = 100;
	}
	/**
	 * Increases speed of Car by 10
	 * @param none
	 * @return none
	 */
	public void increaseSpeed() {
		speed += 10;
	}
	/**
	 * Returns the distance driven by the car
	 * @param none
	 * @return none
	 */
	protected final String drive() {
		if(fuel < 10) {
			return "The car needs a repair";
		}
		else {
			return distance();
		}
		
	}
	/**
	 * Calculates how fast a car goes given the amount of hours
	 * @param hours
	 * @return String
	 */
	protected final String drive(int hours) {
		if(fuel < 10) {
			return "The car needs to refuel";
		}
		else
			fuel = fuel - hours*10;
			if (fuel <= 0) {
				return "The car ran out of fuel, you went " + speed*10 + "km";
			}
			return "The car went " + speed*hours + "km in " + hours + " hours" + "\nYou have " + fuel + " fuel left";
	}
	/**
	 * Subtracts 10 fuel from total
	 * @param none
	 * @return String
	 */
	private String distance() {
		fuel -= 10;
		return "The car went " + speed + "km in 1 hour" + "\nYou have " + fuel + " fuel left";
	}
	/**
	 * Sets model for Car
	 * @param String
	 * @return none
	 */
	public void setModel(String model) {this.model = model;	}
	/**
	 * Sets make for Car
	 * @param String
	 * @return none
	 */
	public void setMake (String make) {this.make = make; }
	/**
	 * Sets speed for Car
	 * @param int
	 * @return none
	 */
	public void setSpeed (int speed) {this.speed = speed; }
	/**
	 * Sets color for Car
	 * @param String
	 * @return none
	 */
	public void setColor (String color) {this.color = color; }
	/**
	 * Sets cost for Car
	 * @param int
	 * @return none
	 */
	public void setCost(int cost) {this.cost = cost;}
	/**
	 * Sets year for Car
	 * @param int
	 * @return none
	 */
	public void setYear(int year){this.year = year;}
	
	/**
	 * Gets model for Car
	 * @param none
	 * @return String
	 */
	public String getModel() {return model; }
	/**
	 * Gets make for Car
	 * @param none
	 * @return String
	 */
	public String getMake() {return make; }
	/**
	 * Gets speed for Car
	 * @param none
	 * @return int
	 */
	public double getSpeed() {return speed; }
	/**
	 * Gets color for Car
	 * @param none
	 * @return String
	 */
	public String getColor() {return color; }
	/**
	 * Gets cost for Car
	 * @param none
	 * @return int
	 */
	public int getCost() {return cost;}
	/**
	 * Gets year for Car
	 * @param none
	 * @return int
	 */
	public int getYear() {return year; }
	
	/**
	 * Returns information about the Car
	 * @param none
	 * @return String
	 */
	public String toString() {
		return "Car - " + this.color + " " + this.year + " " + this.make + " " + this.model + " for " + this.cost + " dollars" + "\nCan go up to " + this.speed + "km/h and has " + fuel + " fuel left";
	}
	/**
	 * Creates a clone of another Car object
	 * @param none
	 * @return Car
	 */
	public Car clone() {
		return new Car(this.model, this.make, this.color, this.year, this.speed, this.cost);
	}
	/**
	 * Checks if two Car objects are Equal
	 * @param Car
	 * @return boolean
	 */
	public boolean equals(Car v) {
		if (v instanceof Car) {
			String model = this.model;
			String make = this.make;
			String color = this.color;
			Car temp = (Car)v;
			String vmodel = temp.getModel();
			String vmake = temp.getMake();
			String vcolor = temp.getColor();
			return (model == vmodel && make == vmake && color == vcolor);
		} 
		else
			return false;
		}
	/**
	 * Generates a random car make and returns the String value
	 * @param Car
	 * @return String
	 */
	public String randomCarGenerator(Car car) {
		String[] carMakes = new String[]{"Subaru","Dodge","Audi","Mercedes","BMW","Honda","Toyota","Lexus","Mitsubishi","Ford"};
		int rnd = new Random().nextInt(carMakes.length);
		String carMake = carMakes[rnd];
		return carMake;
	}
	
	/**
	 * Draws a car using the selected color
	 * @param Color
	 * @param GCanvas
	 * @return none
	 */
	public void draw(Color color, GCanvas canvas) {
		GRect body = new GRect(50, 400, 500, 200);
		body.setFilled(true);
		body.setColor(color);
		canvas.add(body);
		GOval wheel = new GOval(90,550,100,100);
		GOval wheel2 = new GOval(400,550,100,100);
		wheel.setFilled(true);
		wheel2.setFilled(true);
		canvas.add(wheel);
		canvas.add(wheel2);
		GRect windowMiddle = new GRect(225, 250, 150, 150);
		windowMiddle.setFilled(true);
		windowMiddle.setColor(Color.GRAY);
		canvas.add(windowMiddle);
		GPolygon triangleBack = new GPolygon();
		triangleBack.addVertex(50,400);
		triangleBack.addVertex(225, 400);
		triangleBack.addVertex(225, 250);
		triangleBack.setColor(Color.GRAY);
		triangleBack.setFilled(true);
		canvas.add(triangleBack);
		GPolygon triangleFront = new GPolygon();
		triangleFront.addVertex(375, 400);
		triangleFront.addVertex(375, 250);
		triangleFront.addVertex(550, 400);
		triangleFront.setColor(Color.GRAY);
		triangleFront.setFilled(true);
		canvas.add(triangleFront);
		GRect light = new GRect(500,450,50,20);
		light.setColor(Color.YELLOW);
		light.setFilled(true);
		canvas.add(light);
	}
	/**
	 * Returns name of Object
	 * @param none
	 * @return "Car"
	 */
	public String name() {
		return "Car";
	}
	// Private Instance variables
	private String model,make;
	// Private Class variable
	private int fuel = 100;

}
