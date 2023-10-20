/**
 * 
 Class: CMSC203 CRN 35533

 Program: Assignment 4

 Instructor: Ahmed Tarek

 Summary of Description: 
 
A property management company manages individual properties they will build to rent, 
and charges them a management fee as the percentage of the monthly rental amount. 
The properties cannot overlap each other, and each property must be 
within the limits of the management company’s plot.  
Write an application that lets the user create a management company and add the properties 
managed by the company to its list. Assume the maximum number of
properties handled by the company is 5.  
 
 Due Date:  03/31/22

 Integrity Pledge: I pledge that I have completed the programming assignment independently.
 I have not copied the code from a student or any source.

Abhishek Poudel.


 * @author Abhishek Poudel
 *
 */

public class Property {

	 private String propertyName;
	 private String city;
	 private String owner;
	 private Plot plot;
	 private double rentAmount;
	

  public Property() {
		this.propertyName = "";
		this.city = "";
		this.owner = "";
		this.plot = new Plot(0,0,1,1);
		this.rentAmount = 0;
	}
	
	public Property(Property p) {
		propertyName = p.propertyName;
		city = p.city;
		owner = p.owner;
		rentAmount = p.rentAmount;	
	}
	
	public Property(String propertyName, String city, double rentAmount, String owner, int x, 
			int y, int width, int depth) {
		        this.propertyName = propertyName;
				this.city = city;
				this.owner = owner;
				this.plot = new Plot(x, y, width, depth);
				this.rentAmount = rentAmount;
				
			}
	
	public Property(String propertyName, String city, double rentAmount, String owner) {
		this.propertyName = propertyName;
		this.city = city;
		this.owner = owner;
		this.plot = new Plot(0, 0, 1, 1);
		this.rentAmount = rentAmount;
		
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getOwner() {
		return owner;
	}
	
	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}

	public String getPropertyName() {
		return propertyName;
	}

	public void setRentAmount(double rentAmount) {
		this.rentAmount = rentAmount;
	}

	public double getRentAmount() {
		return rentAmount;
		
	}
  
	public void setPlot(int x, int y, int width, int depth) {
		this.plot = new Plot(x, y, width, depth);
	}
	
	public Plot getPlot() {
		return plot;
	}

	public String toString() {
		return ("Property Name: " + this.propertyName + "\n Located in " + this.city + 
				"\n Belonging to: " + this.owner + "\n Rent Amount: " + this.rentAmount);
	}





	
	
}
