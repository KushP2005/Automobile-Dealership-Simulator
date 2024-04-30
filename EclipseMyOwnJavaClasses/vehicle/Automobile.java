// Kush Pandya 6 9 2023
package vehicle;

import java.awt.Color;

import acm.graphics.GCanvas;
import acm.graphics.GRect;

abstract class Automobile {
	
	
	int speed;
	String color;
	int numVehicles;
	int year;
	int cost;
	String model;
	String make;
	
	public abstract int repair();
	protected abstract String drive();
	public void setCost(int cost) {
		// TODO Auto-generated method stub
		
	}
	public void setColor(String color) {
		// TODO Auto-generated method stub
		
	}
	public void setMake(String make) {}
	public void setModel(String model) {}
	public void draw(Color color, GCanvas canvas) {}
	public Object clone() {
		return null;
	}
	public void setSpeed(int carSpeed) {}
	public Object name() {
		// TODO Auto-generated method stub
		return null;
	}
	public void setYear(int year) {}
	
public String getModel() {return model; }
public String getMake() {return make; }
public double getSpeed() {return speed; }
public String getColor() {return color; }
public int getCost() {return cost;}
public int getYear() {return year; }
}
