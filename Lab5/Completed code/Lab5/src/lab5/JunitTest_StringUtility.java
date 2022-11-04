package lab5;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runners.MethodSorters;

import org.junit.FixMethodOrder;
import org.junit.Rule;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class JunitTest_StringUtility {
	@Rule
	public Timeout globalTimeout = Timeout.seconds(1);
	@Test
	public void test_00_digitCountinString() {
		final String str = "mystring123";
		int n = StringUtility.digitCountinString(str);
		int expect = 3;
		String error = String.format(
				"\nTest digitCountinString fail for ( %s ). Returned ( %s ), but correct is ( %s )\n", str, n, expect);
		assertTrue(error, expect == n);
	}

	@Test
	public void test_01_digitCountinString() {
		final String str = "Test03 on Thursday 19-03";
		int n = StringUtility.digitCountinString(str);
		int expect = 6;
		String error = String.format(
				"\nTest digitCountinString fail for ( %s ). Returned ( %s ), but correct is ( %s )\n", str, n, expect);
		assertTrue(error, expect == n);
	}

	@Test
	public void test_02_digitCountinString() {
		final String str = "mystring";
		int n = StringUtility.digitCountinString(str);
		int expect = 0;
		String error = String.format(
				"\nTest digitCountinString fail for ( %s ). Returned ( %s ), but correct is ( %s )\n", str, n, expect);
		assertTrue(error, expect == n);
	}
	@Test
	public void test_03_digitCountinString() {
		final String str = "EECS1021EECS1022";
		int n = StringUtility.digitCountinString(str);
		int expect = 8;
		String error = String.format(
				"\nTest digitCountinString fail for ( %s ). Returned ( %s ), but correct is ( %s )\n", str, n, expect);
		assertTrue(error, expect == n);
	}
	
	
	@Test
	public void test_00_sumofDigitinString() {
		final String n= "514abcd495";
		int  sum = StringUtility.sumofDigitinString(n);
		int  expect = 28 ;
		String str = String.format("\nTest sumofDigitinString fail for %s. Returned ( %d ), but correct is ( %d )\n", n,sum, expect );
		assertTrue(str, expect==sum);
	}

	@Test
	public void test_01_sumofDigitinString() {
		final String n= "123abcd1234";
		int  sum = StringUtility.sumofDigitinString(n);
		int  expect = 16 ;
		String str = String.format("\nTest sumofDigitinString fail for %s. Returned ( %d ), but correct is ( %d )\n", n,sum, expect );
		assertTrue(str, expect==sum);
	}
	@Test
	public void test_02_sumofDigitinString() {
		final String n= "87159825ABC";
		int  sum = StringUtility.sumofDigitinString(n);
		int  expect = 45 ;
		String str = String.format("\nTest sumofDigitinString fail for %s. Returned ( %d ), but correct is ( %d )\n", n,sum, expect );
		assertTrue(str, expect==sum);
	}
	
	@Test
	public void test_03_sumofDigitinString() {
		final String n= "ABC";
		int  sum = StringUtility.sumofDigitinString(n);
		int  expect = 0 ;
		String str = String.format("\nTest sumofDigitinString fail for %s. Returned ( %d ), but correct is ( %d )\n", n,sum, expect );
		assertTrue(str, expect==sum);
	}
	
	@Test
	public void test_04_sumofDigitinString() {
		final String n= "u0t4u7t7u7t7ututu99";
		int  sum = StringUtility.sumofDigitinString(n);
		int  expect = 50 ;
		String str = String.format("\nTest sumofDigitinString fail for %s. Returned ( %d ), but correct is ( %d )\n", n,sum, expect );
		assertTrue(str, expect==sum);
	}
	
	
	@Test
	public void test_00_lengthofMaxConsecutiveZeros() {
		final String n= "11101110001";
		int  result = StringUtility.lengthofMaxConsecutiveZeros(n);
		int  expect = 3 ;
		String str = String.format("\nTest lengthofMaxConsecutiveZeros fail for %s. Returned ( %d ), but correct is ( %d )\n", n,result, expect );
		assertTrue(str, expect==result);
	}
	@Test
	public void test_01_lengthofMaxConsecutiveZeros() {
		final String n= "111000000001110001";
		int  result = StringUtility.lengthofMaxConsecutiveZeros(n);
		int  expect = 8 ;
		String str = String.format("\nTest lengthofMaxConsecutiveZeros fail for %s. Returned ( %d ), but correct is ( %d )\n", n,result, expect );
		assertTrue(str, expect==result);
	}
	@Test
	public void test_03_lengthofMaxConsecutiveZeros() {
		final String n= "11101";
		int  result = StringUtility.lengthofMaxConsecutiveZeros(n);
		int  expect = 1 ;
		String str = String.format("\nTest lengthofMaxConsecutiveZeros fail for %s. Returned ( %d ), but correct is ( %d )\n", n,result, expect );
		assertTrue(str, expect==result);
	}
	
	@Test
	public void test_04_lengthofMaxConsecutiveZeros() {
		final String n= "11100000000100000000000000000000000000000000";
		int  result = StringUtility.lengthofMaxConsecutiveZeros(n);
		int  expect = 32 ;
		String str = String.format("\nTest lengthofMaxConsecutiveZeros fail for %s. Returned ( %d ), but correct is ( %d )\n", n,result, expect );
		assertTrue(str, expect==result);
	}
	
	
	@Test
	public void test_00_removeDuplicatesChar() {
		final String str= "EECCCCCSSSLLLLLAB";
		char [] cleanstr = StringUtility.removeDuplicatesChar(str).toCharArray();
		char []  expect = "ECSLAB".toCharArray();
		Arrays.sort(expect);
		Arrays.sort(cleanstr);
		String str1 = String.format("\nTest removeDuplicatesChar fail for %s. Returned ( %s ),"
				+ " but correct is ( %s )\n", str,StringUtility.removeDuplicatesChar(str), "ECSLAB" );
		assertTrue(str1, Arrays.equals(cleanstr, expect));
	}
	
	@Test
	public void test_01_removeDuplicatesChar() {
		final String str= "0001110001001";
		char [] cleanstr = StringUtility.removeDuplicatesChar(str).toCharArray();
		char []  expect = "01".toCharArray();
		Arrays.sort(expect);
		Arrays.sort(cleanstr);
		String str1 = String.format("\nTest removeDuplicatesChar fail for %s. Returned ( %s ),"
				+ " but correct is ( %s )\n", str,StringUtility.removeDuplicatesChar(str), "01" );
		assertTrue(str1, Arrays.equals(cleanstr, expect ));
	}
	
	@Test
	public void test_02_removeDuplicatesChar() {
		final String str= "AAAABBBCCC";
		char [] cleanstr = StringUtility.removeDuplicatesChar(str).toCharArray();
		char []  expect = "CBA".toCharArray();
		Arrays.sort(expect);
		Arrays.sort(cleanstr);
		String str1 = String.format("\nTest removeDuplicatesChar fail for %s. Returned ( %s ), but correct is ( %s )\n", str,cleanstr, expect );
		assertTrue(str1, Arrays.equals(cleanstr, expect));
	}
	
	
	@Test
	public void test_00_removeConsecutiveDuplicates() {
		final String str= "000000";
		String cleanstr = StringUtility.removeConsecutiveDuplicates(str);
		String  expect = "0" ;
		String str1 = String.format("\nTest removeConsecutiveDuplicates fail for %s. Returned ( %s ), but correct is ( %s )\n", str,cleanstr, expect );
		assertTrue(str1, expect.equals(cleanstr));
	}

	@Test
	public void test_01_removeConsecutiveDuplicates() {
		final String str= "ccccvvvvvvaaaaaabbbcaaaa";
		String cleanstr = StringUtility.removeConsecutiveDuplicates(str);
		String  expect = "cvabca" ;
		String str1 = String.format("\nTest removeConsecutiveDuplicates fail for %s. Returned ( %s ), but correct is ( %s )\n", str,cleanstr, expect );
		assertTrue(str1, expect.equals(cleanstr));
	}
	
	@Test
	public void test_02_removeConsecutiveDuplicates() {
		final String str= "ECCCCCSSSSSLLLLLLLAAAAAAB";
		String cleanstr = StringUtility.removeConsecutiveDuplicates(str);
		String  expect = "ECSLAB" ;
		String str1 = String.format("\nTest removeConsecutiveDuplicates fail for %s. Returned ( %s ), but correct is ( %s )\n", str,cleanstr, expect );
		assertTrue(str1, expect.equals(cleanstr));
	}

	@Test
	public void test_03_removeConsecutiveDuplicates() {
		final String str= "YYYORKKKKKKKTTOOORONTO";
		String cleanstr = StringUtility.removeConsecutiveDuplicates(str);
		
		String  expect = "YORKTORONTO" ;
		String str1 = String.format("\nTest removeConsecutiveDuplicates fail for %s. Returned ( %s ), but correct is ( %s )\n", str,cleanstr, expect );
		assertTrue(str1, expect.equals(cleanstr));
	}

	
	@Test
	public void test_00_whitespaceCountinString() {
		final String str = "mystring123";
		int n = StringUtility.whitespaceCountinString(str);
		int expect = 0;
		String error = String.format(
				"\nTest whitespaceCountinString fail for ( %s ). Returned ( %s ), but correct is ( %s )\n", str, n,
				expect);
		assertTrue(error, expect == n);
	}

	@Test
	public void test_01_whitespaceCountinString() {
		final String str = "I am EECS1022 Student";
		int n = StringUtility.whitespaceCountinString(str);
		int expect = 3;
		String error = String.format(
				"\nTest whitespaceCountinString fail for ( %s ). Returned ( %s ), but correct is ( %s )\n", str, n,
				expect);
		assertTrue(error, expect == n);
	}
	
	@Test
	public void test_02_whitespaceCountinString() {
		final String str = "AAAA BB B B EECS 1 0 2 2 S tudent";
		int n = StringUtility.whitespaceCountinString(str);
		int expect = 10;
		String error = String.format(
				"\nTest whitespaceCountinString fail for ( %s ). Returned ( %s ), but correct is ( %s )\n", str, n,
				expect);
		assertTrue(error, expect == n);
	}
	
	
	@Test
	public void test_00_compressString() {
		String inputStr = "bbbcfreb$b";
		String expected = "b3c1f1r1e1b1$1b1";
		String result = StringUtility.compressString(inputStr);
		String error = String.format("error on compressString, expected  %s , but returned %s", expected, result);
		assertTrue(error, expected.equals(result));
				
	}
	
	@Test
	public void test_01_compressString() {
		String inputStr = "bbbcffffreb$b";
		String expected = "b3c1f4r1e1b1$1b1";
		String result = StringUtility.compressString(inputStr);
		String error = String.format("error on compressString, expected  %s , but returned %s", expected, result);
		assertTrue(error, expected.equals(result));
				
	}
	@Test
	public void test_02_compressString() {
		String inputStr = "SHOWSHOWSHOWSHOWCASECASE";
		String expected = "S1H1O1W1S1H1O1W1S1H1O1W1S1H1O1W1C1A1S1E1C1A1S1E1";
		String result = StringUtility.compressString(inputStr);
		
		String error = String.format("error on compressString, expected  %s , but returned %s", expected, result);
		assertTrue(error, expected.equals(result));
				
	}
	
	

}
