
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




public class ManagementCompany {
	private String name;
	private Property[] properties;
	private String taxID;
	private double mgmFeePer;
	private final int MGMT_WIDTH = 10;
	private final int MAX_PROPERTY = 5;
	private final int MGMT_DEPTH = 10;
	private int numberOfProperties = 0;
	private Plot plot;
	
	  /**
	   * A No-Arg Constructor that creates a Management Company object.
	   */
	
	public ManagementCompany() {
		this.name = "";
		this.mgmFeePer = 0;
		this.taxID = "";
		this.plot = new Plot(0,0,MGMT_WIDTH,MGMT_DEPTH);
		this.properties = new Property[MAX_PROPERTY];
	}
	 /**
	   * A management company parameterized constructor with a default company plot.
	   * @param name name of the company
	   * @param taxID taxID of the property
	   * @param mgmFeePer management fee
	   */
	public ManagementCompany(String name, String taxID, double mgmFee) {
		this.taxID = taxID;
		this.name = name;
		this.mgmFeePer = mgmFee;
		this.properties = new Property[MAX_PROPERTY];
		this.plot = new Plot(0,0,MGMT_WIDTH,MGMT_DEPTH);
	}
	 /**
	   * A management company parameterized constructor that sets the plot for the company.
	   * @param name
	   * @param taxID
	   * @param mgmFeePer
	   * @param x
	   * @param y
	   * @param width
	   * @param depth
	   */
	public ManagementCompany(String name, String taxID, double mgmFee, int x, int y,int width, 
			int depth) {
		this.taxID = taxID;
		this.name = name;
		this.mgmFeePer = mgmFee;
		this.properties = new Property[MAX_PROPERTY];
		this.plot = new Plot(x,y,width,depth);
	}
	  /**
	   * Copy constructor creates a ManagementCompany object using another ManagementComapany object..
	   * @param otherCompany otherCompany is an object that is a copy
	   */
	public ManagementCompany(ManagementCompany otherCompany) {
		this.taxID = otherCompany.taxID;
		this.name = otherCompany.name;
		this.properties = new Property[MAX_PROPERTY];
		this.mgmFeePer = otherCompany.mgmFeePer;
		
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	 /**
	   * A get method that returns the size of properties array.
	   * @return MAX_PROPERTY size of the array.
	   */
	public int getMAX_PROPERTY() {
		return MAX_PROPERTY;
	}
	
	public Plot getPlot() {
		return plot; 
	}
	 /**
	   * Adds a an already created property to the array.
	   * @param property
	   * @return
	   */
	
	public int addProperty(Property property) {
		 
		boolean notContain = false;
		
		for (int i = 0; i < numberOfProperties; i++) {
			if (properties[i].getPlot().overlaps(property.getPlot())) {
				return -4;
			}
		}
		if (numberOfProperties >= MAX_PROPERTY) {
			return -1;
		}

		if (property == null) {
			return -2;
		}

		if (this.plot.encompasses(property.getPlot()) == notContain) {
			return -3;
		} 
		
		if (numberOfProperties < MAX_PROPERTY){
			properties[numberOfProperties] = property;
			numberOfProperties++;
		}
		
		return numberOfProperties-1;
	}
	  /**
	   * A method that adds the property with four arguments and a default plot to the array.
	   * @param name
	   * @param city
	   * @param rent
	   * @param owner
	   * @return
	   */
	public int addProperty(String name, String city, double rent, String owner) {
		int v3;
		v3 = addProperty(new Property(name, city, rent, owner));
		return v3;
	}
	  /**
	   * An add property that has all the parameters for the property and the plot.
	   * @param name
	   * @param city
	   * @param rent
	   * @param owner
	   * @param x
	   * @param y
	   * @param width
	   * @param depth
	   * @return
	   */
	
	public int addProperty(String name, String city, double rent, String owner, int x, int y, 
			int width, int depth) {
		int v2;
		v2 = addProperty(new Property(name, city, rent, owner, x, y, width, depth));
		return v2;
	}
	 /**
	   * A method that adds up all the amounts of rent.
	   * not finished yet.
	   */
	
public double totalRent() {
		
		double total = 0.0;
		for (int i = 0; i < numberOfProperties; i++) {
			total += properties[i].getRentAmount();
		}
		return total;
	}

public double maxRentProp() {
	
	double max_Rent = 0.0;
	max_Rent = properties[maxRentPropertyIndex()].getRentAmount();
	return max_Rent;
}
public int maxRentPropertyIndex() {
	
	int count = 0;
	double maxRent = properties[count].getRentAmount();
	double rent_Amount;
	
	for(int i = 0; i < numberOfProperties; i++){	
		rent_Amount = properties[i].getRentAmount();
		
		if(!(properties[i] == null)){
			if(rent_Amount > maxRent){
				count = i;
				maxRent = rent_Amount;
			}
		}
		
	}
	
	return count; 
}
public String displayPropertyAtIndex(int i) {
	
	String index = "";
	if (properties[i] != null) {
		index = ("Owner: " + properties[i].getOwner() + "City: " + properties[i].getCity() 
				+ "Property Name: " + properties[i].getPropertyName() + "Rent Amount: " 
				+ properties[i].getRentAmount() + "Plot: " + properties[i].getPlot());
	}
	return index;

}
public String toString() {
	
	String print = "";
	System.out.println("List of the properties for Alliance, taxID: " + taxID);
	System.out.println("__________________________________________________");
	for (int i = 0; i < numberOfProperties; i++) {
		if (properties[i] != null) {
			print = (" Property Name: " + properties[i].getPropertyName() + "\n" 
		+ "  Located in: " + properties[i].getCity() + "\n" + "  Belonging to: " 
		+ properties[i].getOwner() + "\n" + "  Rent Amount: " + properties[i].getRentAmount());
			}
		System.out.println(print);
	}
	System.out.println("__________________________________________________");
	return("Total management Fee: " + ((mgmFeePer * totalRent()) / 100.0));
}

}
// By Abhishek Poudel.
