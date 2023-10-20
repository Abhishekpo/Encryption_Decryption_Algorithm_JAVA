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
public class Plot {

	private int x;
	private int y;
	private int width;
	private int depth;
	
	public Plot() {
		this.x = 0;
		this.y = 0;
		this.width = 1;
		this.depth = 1;
}
	public Plot(Plot p) { 
		x = p.x;
		y = p.y;
		width = p.width;
		depth = p.depth;
	}
	
	public Plot(int x, int y, int width, int depth) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.depth = depth;
	}
	
	
public boolean overlaps(Plot a) {
		
		boolean overlap = true; 
		int xParameter = a.x;
		int xPlot = x; 
		int width1 = width; 		
		int yPlot = y; 
		int depth1 = depth; 
		boolean notOverlapping = false; 
		
		if(xParameter >= xPlot + width1 || (xParameter + a.width) <= xPlot)
		{
			overlap = notOverlapping;
			
		}
		
		if(a.y >= yPlot + depth1  || (a.y + a.depth) <= yPlot)
		{
			overlap = notOverlapping;
		}
		
		return overlap;
		
	}
public boolean encompasses(Plot a) {
	
	int xVal = a.x;
	int yVal = a.y;
	int widthVal = a.width;
	int depthVal = a.depth;
	
	return xVal >= x && yVal >= y && xVal + widthVal <= x + width && yVal + depthVal <= 
			y + depth;
}

public void setX(int x) {
	this.x = x;
}
public int getX() {
	return x;
}
public void setY(int y) {
	this.y = y;
}
public int getY() {
	return y;
}
public void setWidth(int width) {
	this.width = width;
}
public int getWidth() {
	return width;
}
public void setDepth(int depth) {
	this.depth = depth;
}
public int getDepth() {
	return depth;
}
public String toString(){
	return ("Upper left: (" + this.x + "," + this.y + "); Width: " + this.width + " Depth: "
			+ this.depth);
}

}








