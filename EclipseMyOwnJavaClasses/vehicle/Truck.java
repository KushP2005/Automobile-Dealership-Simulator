// Kush Pandya 6 9 2023
package vehicle;

import java.awt.Color;
import java.util.Random;

import acm.graphics.GCanvas;
import acm.graphics.GOval;
import acm.graphics.GPolygon;
import acm.graphics.GRect;

public class Truck extends Automobile {
	/**
	 * Creates a blank Truck object
	 * @param none
	 * @return none
	 */
	public Truck() {
		speed = 0;
		color = "";
		fuel = 120;
		model = "";
		make = "";
		year = 0;
		load = 0;
		cost = 0;
		numVehicles++;
	}
	/**
	 * Creates a Truck with all parameters filled
	 * @param model
	 * @param make
	 * @param color
	 * @param year
	 * @param speed
	 * @param cost
	 * @param load
	 * @return none
	 */
	public Truck(String model, String make, String color, int year, int speed,int cost,int load) {
		this.model = model;
		this.make = make;
		this.year = year;
		this.color = color;
		this.speed = speed;
		this.cost = cost;
		fuel = 100;
		this.load = load;
		numVehicles++;
	}
	/**
	 * Repairs truck and sets fuel to maximum value
	 * @param none
	 * @return none
	 */
	public int repair() {
		return fuel = 120;
	}
	/**
	 * Increases speed of Truck by 10
	 * @param none
	 * @return none
	 */
	public void increaseSpeed() {
		speed += 10;
	}
	/**
	 * Returns the distance driven by the truck
	 * @param none
	 * @return none
	 */
	protected final String drive() {
		if(fuel < 10) {
			return "The truck needs a repair";
		}
		else {
			return distance();
		}
		
	}
	/**
	 * Subtracts 14 fuel from total
	 * @param none
	 * @return String
	 */
	private String distance() {
		fuel -= 14;
		speed -= load*0.2;
		return "The truck went " + speed + "km in 1 hour with a load of " + load + "kg" + "\nYou have " + fuel + " fuel left";
	}
	/**
	 * Sets model for Truck
	 * @param String
	 * @return none
	 */
	public void setModel(String model) {this.model = model;	}
	/**
	 * Sets make for Truck
	 * @param String
	 * @return none
	 */
	public void setMake (String make) {this.make = make; }
	/**
	 * Sets speed for Truck
	 * @param int
	 * @return none
	 */
	public void setSpeed (int speed) {this.speed = speed; }
	/**
	 * Sets color for Truck
	 * @param String
	 * @return none
	 */
	public void setColor (String color) {this.color = color; }
	/**
	 * Sets load for Truck
	 * @param double
	 * @return none
	 */
	public void setLoad (double load) {this.load = load; }
	/**
	 * Sets cost for Truck
	 * @param int
	 * @return none
	 */
	public void setCost(int cost) {this.cost = cost; }
	/**
	 * Sets year for Truck
	 * @param int
	 * @return none
	 */
	public void setYear(int year){this.year = year;}
	
	/**
	 * Gets model for Truck
	 * @param none
	 * @return String
	 */
	public String getModel() {return model; }
	/**
	 * Gets make for Truck
	 * @param none
	 * @return String
	 */
	public String getMake() {return make; }
	/**
	 * Gets speed for Truck
	 * @param none
	 * @return int
	 */
	public double getSpeed() {return speed*0.76; }
	/**
	 * Gets color for Truck
	 * @param none
	 * @return String
	 */
	public String getColor() {return color; }
	/**
	 * Gets load for Truck
	 * @param none
	 * @return int
	 */
	public double getLoad() {return load; }
	/**
	 * Gets cost for Truck
	 * @param none
	 * @return int
	 */
	public int getCost() {return cost;}
	/**
	 * Gets year for Truck
	 * @param none
	 * @return int
	 */
	public int getYear() {return year; }
	
	/**
	 * Returns information about the Truck
	 * @param none
	 * @return String
	 */
	public String toString() {
		return "Truck - " + this.color + " " + this.year + " " + this.make + " " + this.model + " for " + this.cost + " dollars" + "\nCan go up to " + this.speed + "km/h with a load of "+ load + " and has " + fuel + " fuel left";
	}
	/**
	 * Creates a clone of another Truck object
	 * @param none
	 * @return Car
	 */
	public Truck clone() {
		return new Truck(this.model, this.make, this.color, this.year, this.speed, this.cost,this.year);
	}
	/**
	 * Checks if two Truck objects are Equal
	 * @param Car
	 * @return boolean
	 */
	public boolean equals(Truck v) {
		if (v instanceof Truck) {
			String model = this.model;
			String make = this.make;
			String color = this.color;
			Truck temp = (Truck)v;
			String vmodel = temp.getModel();
			String vmake = temp.getMake();
			String vcolor = temp.getColor();
			return (model == vmodel && make == vmake && color == vcolor);
		} 
		else
			return false;
		}
	/**
	 * Returns name of Object
	 * @param none
	 * @return "Truck"
	 */
	public String name() {
		return "Truck";
	}
	/**
	 * Draws a Truck using the selected color
	 * @param Color
	 * @param GCanvas
	 * @return none
	 */
	public void draw(Color color, GCanvas canvas) {
		GRect body = new GRect(50, 500, 500, 100);
		body.setFilled(true);
		body.setColor(color);
		canvas.add(body);
		GOval wheel = new GOval(90,550,100,100);
		GOval wheel2 = new GOval(400,550,100,100);
		wheel.setFilled(true);
		wheel2.setFilled(true);
		canvas.add(wheel);
		canvas.add(wheel2);
		GRect windowMiddle = new GRect(225, 350, 150, 150);
		windowMiddle.setFilled(true);
		windowMiddle.setColor(color);
		canvas.add(windowMiddle);
		GPolygon triangleFront = new GPolygon();
		triangleFront.addVertex(375, 500);
		triangleFront.addVertex(375, 350);
		triangleFront.addVertex(550, 500);
		triangleFront.setColor(Color.GRAY);
		triangleFront.setFilled(true);
		canvas.add(triangleFront);
		GRect light = new GRect(500,525,50,20);
		light.setColor(Color.YELLOW);
		light.setFilled(true);
		canvas.add(light);
	}
	/**
	 * Generates a random Truck make and returns the String value
	 * @param Truck
	 * @return String
	 */
	public String randomTruckGenerator(Truck truck) {
		String[] TruckMakes = new String[]{"Subaru","Dodge","Honda","Toyota","Ford", "Volvo", "Chevrolet", "GMC"};
		int rnd = new Random().nextInt(TruckMakes.length);
		String TruckMake = TruckMakes[rnd];
		return TruckMake;
	}
	// Private class variable
	private int fuel = 120;
	// Private instance variable
	private double load;
	private String model,make;
	

}
