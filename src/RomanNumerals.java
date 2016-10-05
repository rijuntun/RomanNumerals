
public class RomanNumerals {
	public int convertToInteger(String romanNum) {
		// To be Implemented
		int retval=0;
		int lastNumber=0;
		int lastRmToInt=0;

	    
		
		for (int i = 0, n = romanNum.length(); i < n; i++) {
		    char c = romanNum.charAt(i);
		    
		    switch  (c){
		    	
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
	        if (lastNumber <= rmToInt) {
	            return lastRmToInt - rmToInt;
	        } else {
	            return lastRmToInt + rmToInt;
	        }
	    }
}
