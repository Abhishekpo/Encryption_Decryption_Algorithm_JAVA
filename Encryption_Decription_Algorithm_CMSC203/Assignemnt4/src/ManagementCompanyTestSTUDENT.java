

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ManagementCompanyTestSTUDENT {
	
	Property p1,p2,p3,p4,p5,p6;
	ManagementCompany m ;

	@Before
	public void setUp() throws Exception {
		//student create a management company
		p1 = new Property ("Appartment new", "Kathmandu", 4844.00, "Abhishek Poudel", 1,1,2,2);
		p2 = new Property ("Allure", "PrinceGeorge mall", 4114, "Sam Hunnsen", 5,1,2,2);
		p3 = new Property ("Strick", "Silver Spring", 4905, "Riccky patel", 8,1,2,2);
		
		m = new ManagementCompany("Sammy", "4444444", 8);
		
		m.addProperty(p1);
		m.addProperty(p2);
		m.addProperty(p3);
		
		
		
		//student add three properties, with plots, to mgmt co
		
	}

	@After
	public void tearDown() {
		p1=p2=p3=p4=p5=p6=null;
		m=null;

		//student set mgmt co to null  
	}
	

	@Test
	public void testAddPropertyDefaultPlot() {
		p4 = new Property ("lether man", "Germantown", 2613, "Bikram Sing",2,5,2,2);
		p5 = new Property ("Barringtong", "Silver Spring", 5327, "Resham Poudel",4,5,2,2);
		p6 = new Property ("New hampsaire ", "New hampshire", 1000, "Abinash Poudel",6,5,2,2);
		 
		assertEquals(m.addProperty(p4),3,0);
		assertEquals(m.addProperty(p5),4,0);
		assertEquals(m.addProperty(p6),-1,0);

		//student should add property with 4 args & default plot (0,0,1,1)
		//student should add property with 8 args
		//student should add property that exceeds the size of the mgmt co array and can not be added, add property should return -1	
	}
 
	@Test
	public void testMaxRentProp() {
		assertEquals(m.maxRentProp(),4905.0,0);
		//student should test if maxRentProp contains the maximum rent of properties
		
	}

	@Test
	public void testTotalRent() {
		assertEquals(m.totalRent(),13863.0,0);

		//student should test if totalRent returns the total rent of properties
	}
	

 }
