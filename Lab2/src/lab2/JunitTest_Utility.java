package lab2;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runners.MethodSorters;
import org.junit.FixMethodOrder;
import org.junit.Rule;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
//ALREADY IMPLEMENTED; DO NOT MODIFY 
// NO NEED TO SUBMIT THIS FILE
public class JunitTest_Utility {
	@Rule
    public Timeout globalTimeout = Timeout.seconds(1);

	
	@Test
	public void test_1_0_() {
		short x=122;
		String result= Utility.binaryRepresentation(x);
		String expect = "The decimal value (122) has binary representation [0000000001111010]";
		String str = String.format("\nTest binaryRepresentation fail for (%d)  Returned ( %s ), but correct is ( %s )\n",
				x, result, expect);
	
		assertEquals(str, expect,result);		
	}

	@Test
	public void test_1_1_() {
		short x=102;
		String result= Utility.binaryRepresentation(x);
		String expect = "The decimal value (102) has binary representation [0000000001100110]";
		String str = String.format("\nTest binaryRepresentation fail for (%d)  Returned ( %s ), but correct is ( %s )\n",
				x, result, expect);

		assertEquals(str, expect,result);		
	}
	
	@Test
	public void test_1_2_() {
		short x=204;
		String result= Utility.binaryRepresentation(x);
		String expect = "The decimal value (204) has binary representation [0000000011001100]";
		String str = String.format("\nTest binaryRepresentation fail for (%d)  Returned ( %s ), but correct is ( %s )\n",
				x, result, expect);

		assertEquals(str, expect,result);		
	}

	@Test
	public void test_2_0_() {
		int x=150, y=156;
		String result= Utility.countofMult357(x,y);
		String expect = "Between (150) and (156) there are (3) multiple of 3, (2) multiple of 5 and (1) multiple of 7";
		String str = String.format("\nTest countofMult357 fail for (%d) and (%d) Returned ( %s ), but correct is ( %s )\n",
				x, y, result, expect);
		
		assertEquals(str, expect,result);		
	}
	

	@Test
	public void test_2_1_() {
		int x=150, y=156;
		String result= Utility.countofMult357(x,y);
		String expect = "Between (150) and (156) there are (3) multiple of 3, (2) multiple of 5 and (1) multiple of 7";
		String str = String.format("\nTest countofMult357 fail for (%d) and (%d) Returned ( %s ), but correct is ( %s )\n",
				x, y, result, expect);
		
		assertEquals(str, expect,result);		
	}
	
	
	
	@Test
	public void test_2_2_() {
		int x=5, y=25;
		String result= Utility.countofMult357(x,y);
		String expect = "Between (5) and (25) there are (7) multiple of 3, (5) multiple of 5 and (3) multiple of 7";
		String str = String.format("\nTest countofMult357 fail for (%d) and (%d) Returned ( %s ), but correct is ( %s )\n",
				x, y, result, expect);
		
		assertEquals(str, expect,result);		
	}
	

	@Test
	public void test_2_3_() {
		int x=1, y=4;
		String result= Utility.countofMult357(x,y);
		String expect = "Between (1) and (4) there are (1) multiple of 3, (0) multiple of 5 and (0) multiple of 7";
		String str = String.format("\nTest countofMult357 fail for (%d) and (%d) Returned ( %s ), but correct is ( %s )\n",
				x, y, result, expect);
		
		assertEquals(str, expect,result);		
	}
	@Test
	public void test_2_4_() {
		int x=41, y=24;
		String result= Utility.countofMult357(x,y);
		String expect = "Error: lower limit (41) is not less than or equal to upper limit (24)";
		String str = String.format("\nTest countofMult357 fail for (%d) and (%d) Returned ( %s ), but correct is ( %s )\n",
				x, y, result, expect);
		
		assertEquals(str, expect,result);		
	}
	
	
	@Test
	public void test_3_1_() {
		int n = 15;
		String result= Utility.perfectNumber(n);
		String expect = "Perfect numbers up to (15): [6]";
		String str = String.format("\nTest perfectNumber fail for (%d) Returned ( %s ), but correct is ( %s )\n",
				n, result, expect);
		assertEquals(expect,result);	
		assertEquals(str, expect,result);		
	}
	
	@Test
	public void test_3_2_() {
		int n = 150;
		String result= Utility.perfectNumber(n);
		String expect = "Perfect numbers up to (150): [6 28]";
		String str = String.format("\nTest perfectNumber fail for (%d) Returned ( %s ), but correct is ( %s )\n",
				n, result, expect);
		
		assertEquals(str, expect,result);		
	}
	
	@Test
	public void test_3_3_() {
		int n = 1500;
		String result= Utility.perfectNumber(n);
		String expect = "Perfect numbers up to (1500): [6 28 496]";
		String str = String.format("\nTest perfectNumber fail for (%d) Returned ( %s ), but correct is ( %s )\n",
				n, result, expect);
		
		assertEquals(str, expect,result);		
	}
	
	@Test
	public void test_4_1_isPalindromeInt() {
		final int n = 16;
		String  result = Utility.isPalindromeInt(n);
		String expect = "Integer (16) is NOT Palindrome";
		String str = String.format("\nTest isPalindromeInt fail for (%d) Returned ( %s ), but correct is ( %s )\n",
				n, result, expect);
			
		assertEquals(str, expect,result);
		
	}
	
	
	
	@Test
	public void test_4_2_isPalindromeInt() {
		final int n = 161;
		String  result = Utility.isPalindromeInt(n);
		String expect = "Integer (161) is Palindrome";
		String str = String.format("\nTest isPalindromeInt fail for (%d) Returned ( %s ), but correct is ( %s )\n",
				n, result, expect);
		
		assertEquals(str, expect,result);
	
	}
	@Test
	public void test_4_3_isPalindromeInt() {
		final int n = 1006001;
		String  result = Utility.isPalindromeInt(n);
		String expect = "Integer (1006001) is Palindrome";
		String str = String.format("\nTest isPalindromeInt fail for (%d) Returned ( %s ), but correct is ( %s )\n",
				n, result, expect);
			
		assertEquals(str, expect,result);
		
	}
	
	@Test
	public void test_4_4_isPalindromeInt() {
		final int n = 1230603201;
		String  result = Utility.isPalindromeInt(n);
		String expect = "Integer (1230603201) is NOT Palindrome";
		String str = String.format("\nTest isPalindromeInt fail for (%d) Returned ( %s ), but correct is ( %s )\n",
				n, result, expect);
		
		assertEquals(str, expect,result);

	}
	
	
}
