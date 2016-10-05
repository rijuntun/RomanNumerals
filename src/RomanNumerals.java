import java.lang.*;

public class RomanNumerals {
	public int convertToInteger(String romanNum) {
		// To be Implemented
		int retval=0;
		int lastNumber=0;
		int lastRmToInt=0;

	    
		
		for (int i = 0, n = romanNum.length(); i < n; i++) {
		    char c = romanNum.charAt(i);
		    
		    switch  (c){
		    case 'L':
		    {
			    retval=processInt(50,lastNumber,retval);
			    lastNumber=50;
		    }
		    break;
		    case 'X':
		    {
			    retval=processInt(10,lastNumber,retval);
			    lastNumber=10;
		    }
		    break;
		    
		    	
		    case'V':
		    {
		    	
		    	retval=processInt(5,lastNumber,retval);
		    	lastNumber=5;
		    	
		    }
		    break;
		    case 'I':
		    {
		    	retval=processInt(1,lastNumber,retval);
		    	lastNumber=1;
		    }	
		    break;
		    }
		 }
	   
		return retval;
		
		
	}
	
	  public static int processInt(int rmToInt, int lastNumber, int lastRmToInt) {
	        if (lastNumber < rmToInt) {
	            return Math.abs((lastRmToInt - rmToInt));
	        } else {
	            return lastRmToInt + rmToInt;
	        }
	    }
}
