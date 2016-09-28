
public class RomanNumerals {
	public int convertToInteger(String romanNum) {
		// To be Implemented
		int retval=0;

	    
		
		for (int i = 0, n = romanNum.length(); i < n; i++) {
		    char c = romanNum.charAt(i);
		    
		    if (c=='I') 
		    {
		    	retval++;
		    }	
		 }
	   
		return retval;
		
		
	}
}
