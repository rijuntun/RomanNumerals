import static org.junit.Assert.*;

import org.junit.Test;

public class TestRomanNumerals {
    RomanNumerals romans = new RomanNumerals();
    
	@Test
	public void testRomanNumeralsCreated() {
		//fail("Not yet implemented");
		assertNotNull(romans);

	}
	@Test
	public void test_I_one(){
		
		int num=romans.convertToInteger("I");
		assertEquals(1,num);
		
	}
	
	@Test
	public void testII_two(){
		
		int num=romans.convertToInteger("II");
		assertEquals(2,num);
		
	}


	@Test
	public void testIII_three(){
		
		int num=romans.convertToInteger("III");
		assertEquals(3,num);
		
	}
	
	@Test
	public void testIV_four(){
		int num=romans.convertToInteger("IV");
		assertEquals(4, num);
		
	}

	@Test
	public void testV_five(){
		int num=romans.convertToInteger("V");
		assertEquals(5, num);
		
	}

	@Test
	public void testVI_six(){
		int num=romans.convertToInteger("VI");
		assertEquals(6, num);
		
	}
	
	@Test
	public void testVII_seven(){
		int num=romans.convertToInteger("VII");
		assertEquals(7, num);
		
	}
	@Test
	public void testVIII_eight(){
		int num=romans.convertToInteger("VIII");
		assertEquals(8, num);
		
	}

	@Test
	public void testIX_nine(){
		int num=romans.convertToInteger("IX");
		assertEquals(9, num);		
		
	}
	
	@Test
	public void testX_ten(){
		int num=romans.convertToInteger("X");
		assertEquals(10, num);		
		
	}

	@Test
	public void testXIII_thiirteen(){
		int num=romans.convertToInteger("XIII");
		assertEquals(13, num);		
		
	}
	@Test
	public void testXX_twenty(){
		int num=romans.convertToInteger("XX");
		assertEquals(20, num);		
		
	}
	@Test
	public void testL_fiftty(){
		int num=romans.convertToInteger("L");
		assertEquals(50, num);		
		
	}
	
	
	@Test
	public void testXL_fourty(){
		int num=romans.convertToInteger("XL");
		assertEquals(40, num);		
		
	}

	@Test
	public void testLXXX_eighty(){
		int num=romans.convertToInteger("LXXX");
		assertEquals(80, num);		
		
	}
	
	@Test
	public void testC_hundred(){
		int num=romans.convertToInteger("C");
		assertEquals(100, num);		
		
	}
	@Test
	public void testXC_ninety(){
		int num=romans.convertToInteger("XC");
		assertEquals(90, num);		
		
	}
	@Test
	public void testXX_two_hundred(){
		int num=romans.convertToInteger("XX");
		assertEquals(200, num);		
		
	}



	
}
