package lab4;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runners.MethodSorters;
import org.junit.FixMethodOrder;
import org.junit.Rule;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
//ALREADY IMPLEMENTED; DO NOT MODIFY 
// NO NEED TO SUBMIT THIS FILE

/*
 	 * Tests included in this class serve as documentation on how instances of a vending machine work.
	 * 
	 * Be sure to also read the following sections from your Lab4 instructions PDF: 
	 * 	- The Vending Machine Problem
	 * 	- Lab Restrictions
	 * 
	 * Programming IDEs such as Eclipse are able to fix such compilation errors for you. 
	 * However, you are advised to follow the guidance as specified in the written notes above
	 * to fix these compilation errors manually, because: 
	 * 	1) it helps you better understand how the intended classes and methods work together; and 
	 * 	2) you may be tested in a written test or exam without the assistance of IDEs.
	 * 
 */

public class JunitTest_YorkVendingMachine {
	@Rule
    public Timeout globalTimeout = Timeout.seconds(1);

	/*
	 * Tests related to an initial, empty vending machine
	 */
	@Test
	public void test_YorkVendingMachine_01a() {
		YorkVendingMachine yvm = new YorkVendingMachine();
		String result = yvm.getMessage();
		assertEquals("Empty VM Started", result);
	}
	
	@Test
	public void test_YorkVendingMachine_01b1() {
		YorkVendingMachine yvm = new YorkVendingMachine();
		String result = yvm.checkStock("Coke");
		assertEquals("Coke (0)", result);
		result = yvm.getMessage(); // status remains initialized
		assertEquals("Empty VM Started", result);
	}
	
	@Test
	public void test_YorkVendingMachine_01b2() {
		YorkVendingMachine vm = new YorkVendingMachine();
		String result = vm.checkStock("Orange Juice");
		assertEquals("Orange Juice (0)", result);
		result = vm.getMessage(); // status remains initialized
		assertEquals("Empty VM Started", result);
	} 
	
	@Test
	public void test_YorkVendingMachine_01b3() {
		YorkVendingMachine vm = new YorkVendingMachine();
		String result = vm.checkStock("Kitkat Chunky Bar");
		assertEquals("Kitkat Chunky Bar (0)", result);
		result = vm.getMessage(); // status remains initialized
		assertEquals("Empty VM Started", result);
	} 
	
	@Test
	public void test_YorkVendingMachine_01b4() {
		YorkVendingMachine vm = new YorkVendingMachine();
		String result = vm.checkStock("Lay's Classic Chips");
		assertEquals("Lay's Classic Chips (0)", result);
		result = vm.getMessage(); // status remains initialized
		assertEquals("Empty VM Started", result);
	}
	
	@Test
	public void test_YorkVendingMachine_01b5() {
		YorkVendingMachine vm = new YorkVendingMachine();
		String result = vm.checkStock("Lay's BBQ Chips"); // invalid product name
		assertEquals("Invalid product: Lay's BBQ Chips", result); // Notice the space between colon (:) and the invalid product's name.
		result = vm.getMessage(); // status remains initialized
		assertEquals("Empty VM Started", result);
	}
	
	@Test
	public void test_YorkVendingMachine_01c() {
		YorkVendingMachine vm = new YorkVendingMachine();
		String result = vm.checkStock();
		assertEquals("Stock: Coke (0), Orange Juice (0), Kitkat Chunky Bar (0), Lay's Classic Chips (0)", result);
	}
	
	/*
	 * Tests related to adding stock to the vending machine
	 */
	@Test
	public void test_YorkVendingMachine_02() {
		YorkVendingMachine vm = new YorkVendingMachine();
		
		/*
		 * Add stock of Coke
		 */
		vm.addtoStock("Coke", 5); // this changes the status
		
		String result = vm.getMessage();
		assertEquals("Product added: Coke (5)", result); // Notice the space after the colon ":" and before the opening parenthesis "(".
		
		result = vm.checkStock("Coke");
		assertEquals("Coke (5)", result);
		
		result = vm.checkStock();
		assertEquals("Stock: Coke (5), Orange Juice (0), Kitkat Chunky Bar (0), Lay's Classic Chips (0)", result);
		
		/*
		 * Add stock of Orange Juice
		 */
		vm.addtoStock("Orange Juice", 5); // this changes the status
		
		result = vm.getMessage();
		assertEquals("Product added: Orange Juice (5)", result); // Notice the space after the colon ":" and before the opening parenthesis "(".
		
		result = vm.checkStock("Orange Juice");
		assertEquals("Orange Juice (5)", result);
		
		result = vm.checkStock();
		assertEquals("Stock: Coke (5), Orange Juice (5), Kitkat Chunky Bar (0), Lay's Classic Chips (0)", result);
		
		/*
		 * Add stock of Kitkat Chunky Bar
		 */
		vm.addtoStock("Kitkat Chunky Bar", 5); // this changes the status
		
		result = vm.getMessage();
		assertEquals("Product added: Kitkat Chunky Bar (5)", result); // Notice the space after the colon ":" and before the opening parenthesis "(".
		
		result = vm.checkStock("Kitkat Chunky Bar");
		assertEquals("Kitkat Chunky Bar (5)", result);
		
		result = vm.checkStock();
		assertEquals("Stock: Coke (5), Orange Juice (5), Kitkat Chunky Bar (5), Lay's Classic Chips (0)", result);
		
		/*
		 * Add stock of Lay's Classic Chips
		 */
		vm.addtoStock("Lay's Classic Chips", 5); // this changes the status
		
		result = vm.getMessage();
		assertEquals("Product added: Lay's Classic Chips (5)", result); // Notice the space after the colon ":" and before the opening parenthesis "(".
		
		result = vm.checkStock("Lay's Classic Chips");
		assertEquals("Lay's Classic Chips (5)", result);
		
		result = vm.checkStock();
		assertEquals("Stock: Coke (5), Orange Juice (5), Kitkat Chunky Bar (5), Lay's Classic Chips (5)", result);
		
		
		/*test add batch */
		vm.addBatch(4);
		result = vm.checkStock();
		assertEquals("Stock: Coke (9), Orange Juice (9), Kitkat Chunky Bar (9), Lay's Classic Chips (9)", result);
		
		
		/*
		 * Add stock of an invalid product
		 */
		vm.dispense("Maltesers Chocolate", 4); // this changes the status
		
		result = vm.getMessage();
		assertEquals("Invalid product: Maltesers Chocolate", result); // Notice the space between colon (:) and the invalid product's name.
		
		result = vm.checkStock("Maltesers Chocolate");
		assertEquals("Invalid product: Maltesers Chocolate", result); // Notice the space between colon (:) and the invalid product's name.
		
		result = vm.checkStock(); // stock of existing products remain the same
		assertEquals("Stock: Coke (9), Orange Juice (9), Kitkat Chunky Bar (9), Lay's Classic Chips (9)", result);
	}
	
	/*
	 * Tests related to reducing stock from the vending machine
	 */
	@Test
	public void test_YorkVendingMachine_03() {
		YorkVendingMachine yvm = new YorkVendingMachine();
		
		/*
		 * Add stocks of products
		 */
		yvm.addtoStock("Coke", 5); 
		yvm.addtoStock("Orange Juice", 6);
		yvm.addtoStock("Kitkat Chunky Bar", 7); 
		yvm.addtoStock("Lay's Classic Chips", 8);
		String result = yvm.checkStock();
		assertEquals("Stock: Coke (5), Orange Juice (6), Kitkat Chunky Bar (7), Lay's Classic Chips (8)", result);
		
		/*
		 * Remove stock of Coke
		 */
		yvm.dispense("Coke", 1); // this changes the status
		
		result = yvm.getMessage();
		assertEquals("Product removed: Coke (1)", result); // Notice the space after the colon ":" and before the opening parenthesis "(".
		
		result = yvm.checkStock("Coke");
		assertEquals("Coke (4)", result);
		
		result = yvm.checkStock();
		assertEquals("Stock: Coke (4), Orange Juice (6), Kitkat Chunky Bar (7), Lay's Classic Chips (8)", result);
		
		/*
		 * Remove stock of Orange Juice
		 */
		yvm.dispense("Orange Juice", 2); // this changes the status
		
		result = yvm.getMessage();
		assertEquals("Product removed: Orange Juice (2)", result); // Notice the space after the colon ":" and before the opening parenthesis "(".
		
		result = yvm.checkStock("Orange Juice");
		assertEquals("Orange Juice (4)", result);
		
		result = yvm.checkStock();
		assertEquals("Stock: Coke (4), Orange Juice (4), Kitkat Chunky Bar (7), Lay's Classic Chips (8)", result);
		
		/*
		 * Remove stock of Kitkat Chunky Bar
		 */
		yvm.dispense("Kitkat Chunky Bar", 3); // this changes the status
		
		result = yvm.getMessage();
		assertEquals("Product removed: Kitkat Chunky Bar (3)", result); // Notice the space after the colon ":" and before the opening parenthesis "(".
		
		result = yvm.checkStock("Kitkat Chunky Bar");
		assertEquals("Kitkat Chunky Bar (4)", result);
		
		result = yvm.checkStock();
		assertEquals("Stock: Coke (4), Orange Juice (4), Kitkat Chunky Bar (4), Lay's Classic Chips (8)", result);
		
		/*
		 * Remove stock of Lay's Classic Chips
		 */
		yvm.dispense("Lay's Classic Chips", 4); // this changes the status
		
		result = yvm.getMessage();
		assertEquals("Product removed: Lay's Classic Chips (4)", result); // Notice the space after the colon ":" and before the opening parenthesis "(".
		
		result = yvm.checkStock("Lay's Classic Chips");
		assertEquals("Lay's Classic Chips (4)", result);
		
		result = yvm.checkStock();
		assertEquals("Stock: Coke (4), Orange Juice (4), Kitkat Chunky Bar (4), Lay's Classic Chips (4)", result);
		
		/*
		 * Remove stock of an invalid product
		 */
		yvm.dispense("M & M's Chocoloate Bag", 4); // this changes the status
		
		result = yvm.getMessage();
		assertEquals("Invalid product: M & M's Chocoloate Bag", result); // Notice the space between colon (:) and the invalid product's name.
		
		result = yvm.checkStock("M & M's Chocoloate Bag");
		assertEquals("Invalid product: M & M's Chocoloate Bag", result); // Notice the space between colon (:) and the invalid product's name.
		
		result = yvm.checkStock(); // stock of existing products remain the same
		assertEquals("Stock: Coke (4), Orange Juice (4), Kitkat Chunky Bar (4), Lay's Classic Chips (4)", result);
		/*Test Clearing the overall stock */
		yvm.clear();
		result = yvm.checkStock(); // stock of existing products remain the same
		assertEquals("Stock: Coke (0), Orange Juice (0), Kitkat Chunky Bar (0), Lay's Classic Chips (0)", result);
		
		
	}
	
	/*
	 * Additional tests related to using a vending machine
	 */
	@Test
	public void test_YorkVendingMachine_04() {
		YorkVendingMachine yvm = new YorkVendingMachine();
		
		/* You may add additional, similar tests on other products */
		 
		yvm.addtoStock("Kitkat Chunky Bar", 7);
		assertEquals("Kitkat Chunky Bar (7)", yvm.checkStock("Kitkat Chunky Bar"));
		assertEquals("Stock: Coke (0), Orange Juice (0), Kitkat Chunky Bar (7), Lay's Classic Chips (0)", yvm.checkStock());
		
		yvm.dispense("Kitkat Chunky Bar", 3);
		assertEquals("Kitkat Chunky Bar (4)", yvm.checkStock("Kitkat Chunky Bar"));
		assertEquals("Stock: Coke (0), Orange Juice (0), Kitkat Chunky Bar (4), Lay's Classic Chips (0)", yvm.checkStock());
		
		yvm.addtoStock("Kitkat Chunky Bar", 5);
		assertEquals("Kitkat Chunky Bar (9)", yvm.checkStock("Kitkat Chunky Bar"));
		assertEquals("Stock: Coke (0), Orange Juice (0), Kitkat Chunky Bar (9), Lay's Classic Chips (0)", yvm.checkStock());
		
		/*Test Clearing the overall stock */
		yvm.clear();
		assertEquals("Stock: Coke (0), Orange Juice (0), Kitkat Chunky Bar (0), Lay's Classic Chips (0)", yvm.checkStock());
		
		/*Test add batch */
		yvm.addBatch(5);
		assertEquals("Stock: Coke (5), Orange Juice (5), Kitkat Chunky Bar (5), Lay's Classic Chips (5)", yvm.checkStock());
		
	}
	
	

	
}
