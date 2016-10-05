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
	public void testVII_seeven(){
		int num=romans.convertToInteger("VII");
		assertEquals(7, num);
		
	}
}
