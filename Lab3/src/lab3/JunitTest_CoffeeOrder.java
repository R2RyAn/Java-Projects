package lab3;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runners.MethodSorters;
import org.junit.FixMethodOrder;
import org.junit.Rule;
import java.lang.reflect.Field;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
//ALREADY IMPLEMENTED; DO NOT MODIFY 
// NO NEED TO SUBMIT THIS FILE
public class JunitTest_CoffeeOrder {
	@Rule
    public Timeout globalTimeout = Timeout.seconds(1);

	
	
	private String getcoffeeType(CoffeeOrder p) {
		String v="";
		try {
			Field name = CoffeeOrder.class.getDeclaredField("coffeeType");
			name.setAccessible(true);
			v = (String)name.get(p);
			
		} catch (Exception x) {
			fail("exception occurred trying to get this.getcoffeeType");
			System.out.println(x);
		}
		return v;
	}
	
	private String getcupSize(CoffeeOrder p) {
		String v="";
		try {
			Field name = CoffeeOrder.class.getDeclaredField("cupSize");
			name.setAccessible(true);
			v = (String)name.get(p);
			
		} catch (Exception x) {
			fail("exception occurred trying to get this.getcupSize");
			System.out.println(x);
		}
		return v;
	}
	
	
	@Test
	public void test_0_0_CoffeeOrderCtor() {
		CoffeeOrder c = new CoffeeOrder();
		String actualcoffeeType = this.getcoffeeType(c);
		String actualcupSize = this.getcupSize(c);
		
		String expectedcoffeeType = "IceCoffee";
		String expectedcupSize = "L";
		
		String errorcoffeeType = String.format(
				"\n Test no-arg constructor  failed  Returned name ( %s ) " + " but correct name is ( %s ). \n",
				actualcoffeeType, expectedcoffeeType);
		assertTrue(errorcoffeeType, expectedcoffeeType.equals(actualcoffeeType));
		
		String errorcupSize = String.format(
				"\n Test no-arg constructor  failed  Returned address ( %s ) " + " but correct address is ( %s ). \n",
				actualcupSize, expectedcupSize);
		
		assertTrue(errorcupSize, expectedcupSize.equals(actualcupSize));
		
	}
	@Test
	public void test_1_0_CoffeeOrderCtor() {
		CoffeeOrder c = new CoffeeOrder("Espresso","XL");
		String actualcoffeeType = this.getcoffeeType(c);
		String actualcupSize = this.getcupSize(c);
		
		String expectedcoffeeType = "Espresso";
		String expectedcupSize = "XL";
		
		String errorcoffeeType = String.format(
				"\n Test arg constructor  failed  Returned name ( %s ) " + " but correct name is ( %s ). \n",
				actualcoffeeType, expectedcoffeeType);
		assertTrue(errorcoffeeType, expectedcoffeeType.equals(actualcoffeeType));
		
		String errorcupSize = String.format(
				"\n Test arg constructor  failed  Returned address ( %s ) " + " but correct address is ( %s ). \n",
				actualcupSize, expectedcupSize);
		
		assertTrue(errorcupSize, expectedcupSize.equals(actualcupSize));
		
	}
	@Test
	public void test_1_1_CoffeeOrderCtor() {
		
		CoffeeOrder c = new CoffeeOrder("Espresso","S");
		
		String actualcoffeeType = this.getcoffeeType(c);
		String actualcupSize = this.getcupSize(c);
		
		String expectedcoffeeType = "Espresso";
		String expectedcupSize = "S";
		
		String errorcoffeeType = String.format(
				"\n Test arg constructor  failed  Returned name ( %s ) " + " but correct name is ( %s ). \n",
				actualcoffeeType, expectedcoffeeType);
		assertTrue(errorcoffeeType, expectedcoffeeType.equals(actualcoffeeType));
		
		String errorcupSize = String.format(
				"\n Test arg constructor  failed  Returned address ( %s ) " + " but correct address is ( %s ). \n",
				actualcupSize, expectedcupSize);
		
		assertTrue(errorcupSize, expectedcupSize.equals(actualcupSize));
		
	}
	@Test
	public void test_1_2_CoffeeOrderCtor() {
		
		CoffeeOrder c = new CoffeeOrder("Espresso","M");
		
		String actualcoffeeType = this.getcoffeeType(c);
		String actualcupSize = this.getcupSize(c);
		
		String expectedcoffeeType = "Espresso";
		String expectedcupSize = "M";
		
		String errorcoffeeType = String.format(
				"\n Test arg constructor  failed  Returned name ( %s ) " + " but correct name is ( %s ). \n",
				actualcoffeeType, expectedcoffeeType);
		assertTrue(errorcoffeeType, expectedcoffeeType.equals(actualcoffeeType));
		
		String errorcupSize = String.format(
				"\n Test arg constructor  failed  Returned address ( %s ) " + " but correct address is ( %s ). \n",
				actualcupSize, expectedcupSize);
		
		assertTrue(errorcupSize, expectedcupSize.equals(actualcupSize));
		
	}
	@Test
	public void test_1_3_CoffeeOrderCtor() {
		
		
		CoffeeOrder c = new CoffeeOrder("Espresso","L");
		
		String actualcoffeeType = this.getcoffeeType(c);
		String actualcupSize = this.getcupSize(c);
		
		String expectedcoffeeType = "Espresso";
		String expectedcupSize = "L";
		
		String errorcoffeeType = String.format(
				"\n Test arg constructor  failed  Returned name ( %s ) " + " but correct name is ( %s ). \n",
				actualcoffeeType, expectedcoffeeType);
		assertTrue(errorcoffeeType, expectedcoffeeType.equals(actualcoffeeType));
		
		String errorcupSize = String.format(
				"\n Test arg constructor  failed  Returned address ( %s ) " + " but correct address is ( %s ). \n",
				actualcupSize, expectedcupSize);
		
		assertTrue(errorcupSize, expectedcupSize.equals(actualcupSize));
		
	}
	@Test
	public void test_2_0_CoffeeOrderCtor() {
		CoffeeOrder c = new CoffeeOrder("Latte","L");
		String actualcoffeeType = this.getcoffeeType(c);
		String actualcupSize = this.getcupSize(c);
		
		String expectedcoffeeType = "Latte";
		String expectedcupSize = "L";
		
		String errorcoffeeType = String.format(
				"\n Test arg constructor  failed  Returned name ( %s ) " + " but correct name is ( %s ). \n",
				actualcoffeeType, expectedcoffeeType);
		assertTrue(errorcoffeeType, expectedcoffeeType.equals(actualcoffeeType));
		
		String errorcupSize = String.format(
				"\n Test arg constructor  failed  Returned address ( %s ) " + " but correct address is ( %s ). \n",
				actualcupSize, expectedcupSize);
		
		assertTrue(errorcupSize, expectedcupSize.equals(actualcupSize));
		
	}
	@Test
	public void test_2_1_CoffeeOrderCtor() {
		
		CoffeeOrder c = new CoffeeOrder("Latte","S");
		String actualcoffeeType = this.getcoffeeType(c);
		String actualcupSize = this.getcupSize(c);
		
		String expectedcoffeeType = "Latte";
		String expectedcupSize = "S";
		
		String errorcoffeeType = String.format(
				"\n Test arg constructor  failed  Returned name ( %s ) " + " but correct name is ( %s ). \n",
				actualcoffeeType, expectedcoffeeType);
		assertTrue(errorcoffeeType, expectedcoffeeType.equals(actualcoffeeType));
		
		String errorcupSize = String.format(
				"\n Test arg constructor  failed  Returned address ( %s ) " + " but correct address is ( %s ). \n",
				actualcupSize, expectedcupSize);
		
		assertTrue(errorcupSize, expectedcupSize.equals(actualcupSize));
		
	}
	
	
	@Test
	public void test_3_0_CoffeeOrderCtor() {
		CoffeeOrder c = new CoffeeOrder("AmericanDark","M");
		String actualcoffeeType = this.getcoffeeType(c);
		String actualcupSize = this.getcupSize(c);
		
		String expectedcoffeeType = "AmericanDark";
		String expectedcupSize = "M";
		
		String errorcoffeeType = String.format(
				"\n Test arg constructor  failed  Returned name ( %s ) " + " but correct name is ( %s ). \n",
				actualcoffeeType, expectedcoffeeType);
		assertTrue(errorcoffeeType, expectedcoffeeType.equals(actualcoffeeType));
		
		String errorcupSize = String.format(
				"\n Test arg constructor  failed  Returned address ( %s ) " + " but correct address is ( %s ). \n",
				actualcupSize, expectedcupSize);
		
		assertTrue(errorcupSize, expectedcupSize.equals(actualcupSize));
		
	}
	
	@Test
	public void test_3_1_CoffeeOrderCtor() {
		

		CoffeeOrder c = new CoffeeOrder("AmericanDark","L");
		String actualcoffeeType = this.getcoffeeType(c);
		String actualcupSize = this.getcupSize(c);
		
		String expectedcoffeeType = "AmericanDark";
		String expectedcupSize = "L";
		
		String errorcoffeeType = String.format(
				"\n Test arg constructor  failed  Returned name ( %s ) " + " but correct name is ( %s ). \n",
				actualcoffeeType, expectedcoffeeType);
		assertTrue(errorcoffeeType, expectedcoffeeType.equals(actualcoffeeType));
		
		String errorcupSize = String.format(
				"\n Test arg constructor  failed  Returned address ( %s ) " + " but correct address is ( %s ). \n",
				actualcupSize, expectedcupSize);
		
		assertTrue(errorcupSize, expectedcupSize.equals(actualcupSize));
		
	}
	
	@Test
	public void test_3_2_CoffeeOrderCtor() {
		
		CoffeeOrder c = new CoffeeOrder("AmericanDark","S");


		String actualcoffeeType = this.getcoffeeType(c);
		String actualcupSize = this.getcupSize(c);
		
		String expectedcoffeeType = "AmericanDark";
		String expectedcupSize = "S";
		
		String errorcoffeeType = String.format(
				"\n Test arg constructor  failed  Returned name ( %s ) " + " but correct name is ( %s ). \n",
				actualcoffeeType, expectedcoffeeType);
		assertTrue(errorcoffeeType, expectedcoffeeType.equals(actualcoffeeType));
		
		String errorcupSize = String.format(
				"\n Test arg constructor  failed  Returned address ( %s ) " + " but correct address is ( %s ). \n",
				actualcupSize, expectedcupSize);
		
		assertTrue(errorcupSize, expectedcupSize.equals(actualcupSize));
		
	}
	
	@Test
	public void test_3_3_CoffeeOrderCtor() {
		
		CoffeeOrder c = new CoffeeOrder("AmericanDark","XL");
		String actualcoffeeType = this.getcoffeeType(c);
		String actualcupSize = this.getcupSize(c);
		
		String expectedcoffeeType = "AmericanDark";
		String expectedcupSize = "XL";
		
		String errorcoffeeType = String.format(
				"\n Test arg constructor  failed  Returned name ( %s ) " + " but correct name is ( %s ). \n",
				actualcoffeeType, expectedcoffeeType);
		assertTrue(errorcoffeeType, expectedcoffeeType.equals(actualcoffeeType));
		
		String errorcupSize = String.format(
				"\n Test arg constructor  failed  Returned address ( %s ) " + " but correct address is ( %s ). \n",
				actualcupSize, expectedcupSize);
		
		assertTrue(errorcupSize, expectedcupSize.equals(actualcupSize));
		
	}
	
	@Test
	public void test_4_0_CoffeeOrderCtor() {
		CoffeeOrder c = new CoffeeOrder("IceCoffee","M");
		String actualcoffeeType = this.getcoffeeType(c);
		String actualcupSize = this.getcupSize(c);
		
		String expectedcoffeeType = "IceCoffee";
		String expectedcupSize = "M";
		
		String errorcoffeeType = String.format(
				"\n Test arg constructor  failed  Returned name ( %s ) " + " but correct name is ( %s ). \n",
				actualcoffeeType, expectedcoffeeType);
		assertTrue(errorcoffeeType, expectedcoffeeType.equals(actualcoffeeType));
		
		String errorcupSize = String.format(
				"\n Test arg constructor  failed  Returned address ( %s ) " + " but correct address is ( %s ). \n",
				actualcupSize, expectedcupSize);
		
		assertTrue(errorcupSize, expectedcupSize.equals(actualcupSize));
		
	}
	
	@Test
	public void test_4_1_CoffeeOrderCtor() {
		
		CoffeeOrder c = new CoffeeOrder("IceCoffee","S");
		String actualcoffeeType = this.getcoffeeType(c);
		String actualcupSize = this.getcupSize(c);
		
		String expectedcoffeeType = "IceCoffee";
		String expectedcupSize = "S";
		
		String errorcoffeeType = String.format(
				"\n Test arg constructor  failed  Returned name ( %s ) " + " but correct name is ( %s ). \n",
				actualcoffeeType, expectedcoffeeType);
		assertTrue(errorcoffeeType, expectedcoffeeType.equals(actualcoffeeType));
		
		String errorcupSize = String.format(
				"\n Test arg constructor  failed  Returned address ( %s ) " + " but correct address is ( %s ). \n",
				actualcupSize, expectedcupSize);
		
		assertTrue(errorcupSize, expectedcupSize.equals(actualcupSize));
		
	}
	
	@Test
	public void test_5_1_CoffeeOrderCopyCtor() {
		CoffeeOrder c1 = new CoffeeOrder("Espresso","L");
		CoffeeOrder c = new CoffeeOrder(c1);
		String actualcoffeeType = this.getcoffeeType(c);
		String actualcupSize = this.getcupSize(c);
		
		String expectedcoffeeType = "Espresso";
		String expectedcupSize = "L";
		
		String errorcoffeeType = String.format(
				"\n Test Copy constructor  failed  Returned name ( %s ) " + " but correct name is ( %s ). \n",
				actualcoffeeType, expectedcoffeeType);
		assertTrue(errorcoffeeType, expectedcoffeeType.equals(actualcoffeeType));
		
		String errorcupSize = String.format(
				"\n Test Copy constructor  failed  Returned address ( %s ) " + " but correct address is ( %s ). \n",
				actualcupSize, expectedcupSize);
		
		assertTrue(errorcupSize, expectedcupSize.equals(actualcupSize));
		
	}
	@Test
	public void test_5_2_CoffeeOrderCopyCtor() {
		CoffeeOrder c1 = new CoffeeOrder("AmericanRegular","L");
		CoffeeOrder c = new CoffeeOrder(c1);
		String actualcoffeeType = this.getcoffeeType(c);
		String actualcupSize = this.getcupSize(c);
		
		String expectedcoffeeType = "AmericanRegular";
		String expectedcupSize = "L";
		
		String errorcoffeeType = String.format(
				"\n Test Copy constructor  failed  Returned name ( %s ) " + " but correct name is ( %s ). \n",
				actualcoffeeType, expectedcoffeeType);
		assertTrue(errorcoffeeType, expectedcoffeeType.equals(actualcoffeeType));
		
		String errorcupSize = String.format(
				"\n Test Copy constructor  failed  Returned address ( %s ) " + " but correct address is ( %s ). \n",
				actualcupSize, expectedcupSize);
		
		assertTrue(errorcupSize, expectedcupSize.equals(actualcupSize));
		
	}
	
	
	@Test
	public void test_6_0_CoffeeOrderCopyCtor() {
		CoffeeOrder c1 = new CoffeeOrder("Latte","L");
		CoffeeOrder c = new CoffeeOrder(c1);
		String actualcoffeeType = this.getcoffeeType(c);
		String actualcupSize = this.getcupSize(c);
		
		String expectedcoffeeType = "Latte";
		String expectedcupSize = "L";
		
		String errorcoffeeType = String.format(
				"\n Test Copy constructor  failed  Returned name ( %s ) " + " but correct name is ( %s ). \n",
				actualcoffeeType, expectedcoffeeType);
		assertTrue(errorcoffeeType, expectedcoffeeType.equals(actualcoffeeType));
		
		String errorcupSize = String.format(
				"\n Test Copy constructor  failed  Returned address ( %s ) " + " but correct address is ( %s ). \n",
				actualcupSize, expectedcupSize);
		
		assertTrue(errorcupSize, expectedcupSize.equals(actualcupSize));
		
	}
	

	
	@Test
	public void test_7_1_CoffeeOrderCopyCtor() {
		CoffeeOrder c1 = new CoffeeOrder("Latte","XL");
		CoffeeOrder c = new CoffeeOrder(c1);
		String actualcoffeeType = this.getcoffeeType(c);
		String actualcupSize = this.getcupSize(c);
		
		String expectedcoffeeType = "Latte";
		String expectedcupSize = "XL";
		
		String errorcoffeeType = String.format(
				"\n Test Copy constructor  failed  Returned name ( %s ) " + " but correct name is ( %s ). \n",
				actualcoffeeType, expectedcoffeeType);
		assertTrue(errorcoffeeType, expectedcoffeeType.equals(actualcoffeeType));
		
		String errorcupSize = String.format(
				"\n Test  Copy constructor  failed  Returned address ( %s ) " + " but correct address is ( %s ). \n",
				actualcupSize, expectedcupSize);
		
		assertTrue(errorcupSize, expectedcupSize.equals(actualcupSize));
		
	}
	
	
	
	@Test
	public void test_9_0_CoffeeOrdersetCoffeeType() {
		CoffeeOrder c = new CoffeeOrder("IceCoffee","M");
		c.setCoffeeType("AmericanRegular");
		String actualcoffeeType = this.getcoffeeType(c);
		String actualcupSize = this.getcupSize(c);
		
		String expectedcoffeeType = "AmericanRegular";
		String expectedcupSize = "M";
		
		String errorcoffeeType = String.format(
				"\n Test setCoffeeType  failed  Returned name ( %s ) " + " but correct name is ( %s ). \n",
				actualcoffeeType, expectedcoffeeType);
		assertTrue(errorcoffeeType, expectedcoffeeType.equals(actualcoffeeType));
		
		String errorcupSize = String.format(
				"\n Test setCoffeeType  failed  Returned address ( %s ) " + " but correct address is ( %s ). \n",
				actualcupSize, expectedcupSize);
		
		assertTrue(errorcupSize, expectedcupSize.equals(actualcupSize));
		
	}
	
	
	
	@Test
	public void test_10_0_CoffeeOrdersetCupSize() {
		CoffeeOrder c = new CoffeeOrder("IceCoffee","M");
		c.setCupSize("XL");
		String actualcoffeeType = this.getcoffeeType(c);
		String actualcupSize = this.getcupSize(c);
		
		String expectedcoffeeType = "IceCoffee";
		String expectedcupSize = "XL";
		
		String errorcoffeeType = String.format(
				"\n Test setCupSize  failed  Returned name ( %s ) " + " but correct name is ( %s ). \n",
				actualcoffeeType, expectedcoffeeType);
		assertTrue(errorcoffeeType, expectedcoffeeType.equals(actualcoffeeType));
		
		String errorcupSize = String.format(
				"\n Test setCupSize  failed  Returned address ( %s ) " + " but correct address is ( %s ). \n",
				actualcupSize, expectedcupSize);
		
		assertTrue(errorcupSize, expectedcupSize.equals(actualcupSize));
		
	}
	
	
	@Test
	public void test_11_0_CoffeeOrdergetCoffeeType() {
		CoffeeOrder c = new CoffeeOrder("IceCoffee","M");
		String actualcoffeeType = c.getCoffeeType();
		String actualcupSize = this.getcupSize(c);
		
		String expectedcoffeeType = "IceCoffee";
		String expectedcupSize = "M";
		
		String errorcoffeeType = String.format(
				"\n Test getCoffeeType  failed  Returned name ( %s ) " + " but correct name is ( %s ). \n",
				actualcoffeeType, expectedcoffeeType);
		assertTrue(errorcoffeeType, expectedcoffeeType.equals(actualcoffeeType));
		
		String errorcupSize = String.format(
				"\n Test getCoffeeType  failed  Returned address ( %s ) " + " but correct address is ( %s ). \n",
				actualcupSize, expectedcupSize);
		
		assertTrue(errorcupSize, expectedcupSize.equals(actualcupSize));
		
	}
	
	
	
	
	@Test
	public void test_12_0_CoffeeOrdergetCupSize() {
		CoffeeOrder c = new CoffeeOrder("IceCoffee","L");
		String actualcoffeeType = this.getcoffeeType(c);
		String actualcupSize = c.getCupSize();
		
		String expectedcoffeeType = "IceCoffee";
		String expectedcupSize = "L";
		
		String errorcoffeeType = String.format(
				"\n Test getCupSize  failed  Returned name ( %s ) " + " but correct name is ( %s ). \n",
				actualcoffeeType, expectedcoffeeType);
		assertTrue(errorcoffeeType, expectedcoffeeType.equals(actualcoffeeType));
		
		String errorcupSize = String.format(
				"\n Test getCupSize  failed  Returned address ( %s ) " + " but correct address is ( %s ). \n",
				actualcupSize, expectedcupSize);
		
		assertTrue(errorcupSize, expectedcupSize.equals(actualcupSize));
		
	}
	
	@Test
	public void test_13_0_CoffeeOrdercoffeeOrderTime() {
		CoffeeOrder c = new CoffeeOrder("IceCoffee","L");

		int actual  = c.coffeeOrderTime();
		int expected =  10;
		
		String errorcoffeeTime = String.format(
				"\n Test coffeeOrderTime  failed  Returned  ( %d ) " + " but correct name is ( %d ). \n",
				actual, expected);
		assertEquals(errorcoffeeTime,expected, actual );
			
	}
	
	
	
	@Test
	public void test_13_1_CoffeeOrdercoffeeOrderTime() {
		CoffeeOrder c = new CoffeeOrder("IceCoffee","S");
		
		int actual  = c.coffeeOrderTime();
		int expected =  8;
		
		String errorcoffeeTime = String.format(
				"\n Test coffeeOrderTime  failed  Returned  ( %d ) " + " but correct name is ( %d ). \n",
				actual, expected);
		assertEquals(errorcoffeeTime,expected, actual );
			
	}
	

	@Test
	public void test_13_3_CoffeeOrdercoffeeOrderTime() {
		CoffeeOrder c = new CoffeeOrder("IceCoffee","XL");
		
		int actual  = c.coffeeOrderTime();
		int expected =  12;
		
		String errorcoffeeTime = String.format(
				"\n Test coffeeOrderTime  failed  Returned name ( %d ) " + " but correct name is ( %d ). \n",
				actual, expected);
		assertEquals(errorcoffeeTime,expected, actual );
			
	}
	
	@Test
	public void test_14_1_CoffeeOrdercoffeeOrderTime() {
		CoffeeOrder c = new CoffeeOrder("AmericanDark","S");
		int actual  = c.coffeeOrderTime();
		int expected =  11;
		
		String errorcoffeeTime = String.format(
				"\n Test coffeeOrderTime  failed  Returned name ( %d ) " + " but correct name is ( %d ). \n",
				actual, expected);
		assertEquals(errorcoffeeTime,expected, actual );
			
	}
	@Test
	public void test_14_2_CoffeeOrdercoffeeOrderTime() {
		CoffeeOrder c = new CoffeeOrder("AmericanDark","M");
		int actual  = c.coffeeOrderTime();
		int expected =  12;
		
		String errorcoffeeTime = String.format(
				"\n Test coffeeOrderTime  failed  Returned name ( %d ) " + " but correct name is ( %d ). \n",
				actual, expected);
		assertEquals(errorcoffeeTime,expected, actual );
			
	}
	
	@Test
	public void test_15_0_CoffeeOrdercoffeeOrderTime() {
		CoffeeOrder c = new CoffeeOrder("Latte","M");
		int actual  = c.coffeeOrderTime();
		int expected =  13;
		
		String errorcoffeeTime = String.format(
				"\n Test coffeeOrderTime  failed  Returned name ( %d ) " + " but correct name is ( %d ). \n",
				actual, expected);
		assertEquals(errorcoffeeTime,expected, actual );
			
	}
	


	@Test
	public void test_16_0_CoffeeOrdertoString() {
		CoffeeOrder c = new CoffeeOrder("Latte","M");
		String  actual  = c.toString();
		String  expected =  "Coffee Order with Coffee type is Latte and cup size is M";
		
		assertEquals(expected, actual );
			
	}
	@Test
	public void test_16_1_CoffeeOrdertoString() {
		CoffeeOrder c = new CoffeeOrder("Espresso","M");
		String  actual  = c.toString();
		String  expected =  "Coffee Order with Coffee type is Espresso and cup size is M";
		
		assertEquals(expected, actual );
			
	}

	
	@Test
	public void test_16_4_CoffeeOrdertoString() {
		CoffeeOrder c = new CoffeeOrder("AmericanRegular","L");
		String  actual  = c.toString();
		String  expected =  "Coffee Order with Coffee type is AmericanRegular and cup size is L";
		
		assertEquals(expected, actual );
			
	}
	@Test
	public void test_16_5_CoffeeOrdertoString() {
		CoffeeOrder c = new CoffeeOrder("AmericanRegular","S");
		String  actual  = c.toString();
		String  expected =  "Coffee Order with Coffee type is AmericanRegular and cup size is S";
		
		assertEquals(expected, actual );
			
	}
	
	@Test
	public void test_16_6_CoffeeOrdertoString() {
		CoffeeOrder c = new CoffeeOrder("AmericanRegular","M");
		String  actual  = c.toString();
		String  expected =  "Coffee Order with Coffee type is AmericanRegular and cup size is M";
		
		assertEquals(expected, actual );
			
	}
	
	
	@Test
	public void test_17_0_CoffeeOrderException() {
		try {
			// create object with wrong cup size 
		CoffeeOrder c = new CoffeeOrder("AmericanRegular","LLL");
		fail();
		}
		catch (IllegalArgumentException e) {
			// exception is expected and we catch it
		}			
	}
	
	@Test
	public void test_17_1_CoffeeOrderException() {
		try {
			// create object with wrong parameters 
		CoffeeOrder c = new CoffeeOrder("AmericanRRegular","L");
		fail();
		}
		catch (IllegalArgumentException e) {
			// exception is expected and we catch it
		}			
	}
	@Test
	public void test_17_2_CoffeeOrderException() {
		try {
			// create object with wrong parameters
			CoffeeOrder c = new CoffeeOrder("Espresso","M");
			c.setCoffeeType("AmericanRRegular");
			fail();
		}
		catch (IllegalArgumentException e) {
			// exception is expected and we catch it
		}	
		
	}
	@Test
	public void test_17_3_CoffeeOrderException() {
		try {
			// create object with wrong parameters
			CoffeeOrder c = new CoffeeOrder("Espresso","M");
			c.setCupSize("ML");
			fail();
		}
		catch (IllegalArgumentException e) {
			// exception is expected and we catch it
		}	
		
	}
	@Test
	public void test_17_4_CoffeeOrderException() {
		try {
			// create object with wrong parameters 
			CoffeeOrder c = new CoffeeOrder("EEEpresso","M");
			fail();
		}
		catch (IllegalArgumentException e) {
			// exception is expected and we catch it
		}	
		
	}
	@Test
	public void test_17_5_CoffeeOrderException() {
		try {
			// create object with wrong parameters
			CoffeeOrder c = new CoffeeOrder("Espresso","M");
			c.setCoffeeType("Espreesso");
			fail();
		}
		catch (IllegalArgumentException e) {
			// exception is expected and we catch it
		}	
		
	}
	

	
}
