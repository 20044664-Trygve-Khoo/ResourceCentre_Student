import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ResourceCentreTest {
	private Camcorder cc1;
	private Camcorder cc2;
<<<<<<< HEAD
	private Chromebook cb1; //Code
	private Chromebook cb2; //Code
=======
	private Chromebook cb1;
	private Chromebook cb2;
>>>>>>> branch 'master' of https://github.com/20044664-Trygve-Khoo/ResourceCentre_Student.git
	private ArrayList<Camcorder> camcorderList;
<<<<<<< HEAD
	private ArrayList<Chromebook> chromebookList; //Code
=======
	private ArrayList<Chromebook> chromebookList;

>>>>>>> branch 'master' of https://github.com/20044664-Trygve-Khoo/ResourceCentre_Student.git
	public ResourceCentreTest() {
		super();
	}

	@Before
	public void setUp() throws Exception {
		// prepare test data
		cc1 = new Camcorder("CC0011", "Nikon HDSLR", 40);
		cc2 = new Camcorder("CC0012", "Sony DSC-RX100M7", 20);
		cb1 = new Chromebook("CB0011", "My Google Chromebook 1st", "Mac OS");
		cb2 = new Chromebook("CB0012", "SAMSUNG Chromebook 4+", "Win 10");

<<<<<<< HEAD
		camcorderList= new ArrayList<Camcorder>();
		new ArrayList<Chromebook>();
		
		chromebookList = new ArrayList<Chromebook>();
	    new ArrayList<Chromebook>(); //Code
}
	
=======
		camcorderList = new ArrayList<Camcorder>();
		chromebookList = new ArrayList<Chromebook>();
	}

>>>>>>> branch 'master' of https://github.com/20044664-Trygve-Khoo/ResourceCentre_Student.git
	@Test
	public void testAddCamcorder() {
		// Item list is not null, so that can add a new item
		assertNotNull("Test if there is valid Camcorder arraylist to add to", camcorderList);

		// Given an empty list, after adding 1 item, the size of the list is 1
		ResourceCentre.addCamcorder(camcorderList, cc1);
		assertEquals("Test if that Camcorder arraylist size is 1?", 1, camcorderList.size());

		// The item just added is as same as the first item of the list
		assertSame("Test that Camcorder is added same as 1st item of the list?", cc1, camcorderList.get(0));

		// Add another item. test The size of the list is 2?
		ResourceCentre.addCamcorder(camcorderList, cc2);
		assertEquals("Test that Camcorder arraylist size is 2?", 2, camcorderList.size());
		
		//The item just added is as same as the second item of the list
		assertSame("Test that Camcorder is added same as 2nd item of the list?", cc2, camcorderList.get(1));
	}
<<<<<<< HEAD
	
	
	
	
=======

>>>>>>> branch 'master' of https://github.com/20044664-Trygve-Khoo/ResourceCentre_Student.git
	@Test
	public void testAddChromebook() {
		// fail("Not yet implemented");
		// write your code here
<<<<<<< HEAD
		
		// Item list is not null, so that can add a new item
				assertNotNull("Test if there is valid Chromebook arraylist to add to", chromebookList);
				
				//Given an empty list, after adding 1 item, the size of the list is 1
				ResourceCentre.addChromebook(chromebookList, cb1);		
				assertEquals("Test if that Chromebook arraylist size is 1?", 1, chromebookList.size());
				
				//The item just added is as same as the first item of the list
				assertSame("Test that Chromebook is added same as 1st item of the list?", cb1, chromebookList.get(0));
				
				//Add another item. test The size of the list is 2?
				ResourceCentre.addChromebook(chromebookList, cb2);
				assertEquals("Test that Camcorder arraylist size is 2?", 2, chromebookList.size());
				//The item just added is as same as the first item of the list
				assertSame("Test that Chromebook is added same as 1st item of the list?", cb2, chromebookList.get(1));
		
		
		
=======
		// Item list is not null, so that can add a new item
		assertNotNull("Test if there is valid Chromebook arraylist to add to", chromebookList);

		// Given an empty list, after adding 1 item, the size of the list is 1
		ResourceCentre.addChromebook(chromebookList, cb1);
		assertEquals("Test if that Chromebook arraylist size is 1?", 1, chromebookList.size());

		// The item just added is as same as the first item of the list
		assertSame("Test that Chromebook is added same as 1st item of the list?", cb1, chromebookList.get(0));

		// Add another item. test The size of the list is 2?
		ResourceCentre.addChromebook(chromebookList, cb2);
		assertEquals("Test that Chromebook arraylist size is 2?", 2, chromebookList.size());
		assertSame("Test that Chromebook is added same as 1st item of the list?", cb2, chromebookList.get(1));

>>>>>>> branch 'master' of https://github.com/20044664-Trygve-Khoo/ResourceCentre_Student.git
	}
<<<<<<< HEAD
	
	
=======

>>>>>>> branch 'master' of https://github.com/20044664-Trygve-Khoo/ResourceCentre_Student.git
	@Test
	public void testRetrieveAllCamcorder() {
		// Test if Item list is not null but empty, so that can add a new item
		assertNotNull("Test if there is valid Camcorder arraylist to add to", camcorderList);

		// test if the list of camcorders retrieved from the SourceCentre is empty
		String allCamcorder = ResourceCentre.retrieveAllCamcorder(camcorderList);
		String testOutput = "";
		assertEquals("Check that ViewAllCamcorderlist", testOutput, allCamcorder);

		// Given an empty list, after adding 2 items, test if the size of the list is 2
		ResourceCentre.addCamcorder(camcorderList, cc1);
		ResourceCentre.addCamcorder(camcorderList, cc2);
		assertEquals("Test if that Camcorder arraylist size is 2?", 2, camcorderList.size());

		// test if the expected output string same as the list of camcorders retrieved
		// from the SourceCentre
		allCamcorder = ResourceCentre.retrieveAllCamcorder(camcorderList);

		testOutput = String.format("%-10s %-30s %-10s %-10s %-20d\n", "CC0011", "Nikon HDSLR", "Yes", "", 40);
		testOutput += String.format("%-10s %-30s %-10s %-10s %-20d\n", "CC0012", "Sony DSC-RX100M7", "Yes", "", 20);

		assertEquals("Check that ViewAllCamcorderlist", testOutput, allCamcorder);

	}

	@Test
<<<<<<< HEAD
	public void testRetrieveAllChromebook() { //Code
		//fail("Not yet implemented");
		// // Test if Item list is not null but empty, so that can add a new item
		assertNotNull("Test if there is valid Chromebook arraylist to add to", chromebookList);
		
		//test if the list of camcorders retrieved from the SourceCentre is empty
				String allChromebook= ResourceCentre.retrieveAllChromebook(chromebookList);
				String testOutput = "";
				assertEquals("Check that ViewAllChromebooklist", testOutput, allChromebook);
				
		//Given an empty list, after adding 2 items, test if the size of the list is 2
		ResourceCentre.addChromebook(chromebookList, cb1);
		ResourceCentre.addChromebook(chromebookList, cb2);
		assertEquals("Test if that Chromebook arraylist size is 2?", 2, chromebookList.size());
		
		//test if the expected output string same as the list of camcorders retrieved from the SourceCentre
		allChromebook= ResourceCentre.retrieveAllChromebook(chromebookList);
=======
	public void testRetrieveAllChromebook() {
		// fail("Not yet implemented");
		// write your code here

		// Test if Item list is not null but empty, so that can add a new item
		assertNotNull("Test if there is valid Chromebook arraylist to add to", chromebookList);

		// test if the list of Chromebook retrieved from the SourceCentre is empty
		String allChromebook = ResourceCentre.retrieveAllChromebook(chromebookList);
		String testOutput = "";
		assertEquals("Check that ViewAllChromebooklist", testOutput, allChromebook);

		// Given an empty list, after adding 2 items, test if the size of the list is 2
		ResourceCentre.addChromebook(chromebookList, cb1);
		ResourceCentre.addChromebook(chromebookList, cb2);
		assertEquals("Test if that Chromebook arraylist size is 2?", 2, chromebookList.size());

		// test if the expected output string same as the list of Chromebook retrieved
		// from the SourceCentre
		allChromebook = ResourceCentre.retrieveAllChromebook(chromebookList);

		testOutput = String.format("%-10s %-30s %-10s %-10s %-20s\n", "CB0011", "My Google Chromebook 1st","Yes", "","Mac OS");
		testOutput += String.format("%-10s %-30s %-10s %-10s %-20s\n", "CB0012", "SAMSUNG Chromebook 4+","Yes","", "Win 10");

		assertEquals("Check that ViewAllChromebooklist", testOutput, allChromebook);


	}
>>>>>>> branch 'master' of https://github.com/20044664-Trygve-Khoo/ResourceCentre_Student.git

		testOutput = String.format("%-10s %-30s %-10s %-10s %-20s\n","CB0011", "My Google Chromebook 1st", "Yes", "","Mac OS");
		testOutput += String.format("%-10s %-30s %-10s %-10s %-20s\n","CB0012", "SAMSUNG Chromebook 4+","Yes","","Win 10");
	
		assertEquals("Check that ViewAllCamcorderlist", testOutput, allChromebook);
		
	}
	
	@Test
	public void testDoLoanCamcorder() {
<<<<<<< HEAD
		//fail("Not yet implemented");
		//Test that a given list is not null  - Boundary
		assertNotNull("test if there is valid Camcorder arraylist to loan from", camcorderList);
		
		//Newly added Items can be loan out successfully - Normal
		ResourceCentre.addCamcorder(camcorderList, cc1);
		Boolean loan = ResourceCentre.doLoanCamcorder(camcorderList, "CC0011", "" );
		assertTrue("Test if an available item able loan?", loan);
		
		//Loaned Items cannot be loaned out successfully - Normal
		loan = ResourceCentre.doLoanCamcorder(camcorderList, "CC0011", "" );
		assertFalse("Test if same item can be loaned again?", loan);
		
		//Item size list should be reduced after loaning of items - Normal
		assertEquals("Test that chromebook arraylist size has decrease in size by 1", 1, camcorderList.size());
		
=======
		// fail("Not yet implemented");
		// write your code here

>>>>>>> branch 'master' of https://github.com/20044664-Trygve-Khoo/ResourceCentre_Student.git
	}

	@Test
	public void testDoLoanChromebook() {
		// fail("Not yet implemented");
		// write your code here
		
		//Test that a given list is not null  - Boundary
		assertNotNull("test if there is valid Camcorder arraylist to loan from", chromebookList);
				
		//Newly added Items can be loan out successfully - Normal
		ResourceCentre.addChromebook(chromebookList, cb1);
		Boolean loan = ResourceCentre.doLoanChromebook(chromebookList, "CB0011", "" );
		assertTrue("Test if an available item able loan?", loan);
				
		//Loaned Items cannot be loaned out successfully - Normal
		loan = ResourceCentre.doLoanChromebook(chromebookList, "CB0011", "" );
		assertFalse("Test if same item can be loaned again?", loan);
				
		//Item size list should be reduced after loaning of items - Normal
		assertEquals("Test that chromebook arraylist size has decrease in size by 1", 1, chromebookList.size());
	}

	@Test
	public void testDoReturnCamcorder() {
		// fail("Not yet implemented");
		// write your code here

	}

	@Test
	public void testDoReturnChromebook() {
		// fail("Not yet implemented");
		// write your code here
	}

	@After
	public void tearDown() throws Exception {
		cc1 = null;
		cc2 = null;
		cb1 = null;
		cb2 = null;
		chromebookList = null;
		camcorderList = null;

	}

}
