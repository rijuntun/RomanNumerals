import java.lang.*;

public class RomanNumerals {
	public int convertToInteger(String romanNum) {
		// To be Implemented
		int retval=0;
		int lastNumber=0;
		int lastRmToInt=0;
		int next=0;

	    
		
		for (int i = 0, n = romanNum.length(); i < n; i++) {
		    char c = romanNum.charAt(i);
		    if (romanNum.length()<i)
		    	next=romanToInt(romanNum.charAt(i+1));
		    	
		    else
		    	next=0;
		    
		    switch  (c){
		    
		    case 'M':
		    {
		    	retval=processInt(1000,lastNumber,retval,next);
		    	lastNumber=1000;
		    }
		    break;

		    case 'D':
		    {
		    	retval=processInt(500,lastNumber,retval,next);
		    	lastNumber=500;
		    }
		    break;
		    
		    case 'C':
		    {
		    	retval=processInt(100,lastNumber,retval, next);
		    	lastNumber=100;
		    }
		    break;
		    
		    case 'L':
		    {
			    retval=processInt(50,lastNumber,retval, next);
			    lastNumber=50;
		    }
		    break;
		    case 'X':
		    {
			    retval=processInt(10,lastNumber,retval,next);
			    lastNumber=10;
		    }
		    break;
		    
		    	
		    case'V':
		    {
		    	
		    	retval=processInt(5,lastNumber,retval,next);
		    	lastNumber=5;
		    	
		    }
		    break;
		    case 'I':
		    {
		    	retval=processInt(1,lastNumber,retval,next);
		    	lastNumber=1;
		    }	
		    break;
		    }
		 }
	   
		return retval;
		
		
	}
	
	  public static int processInt(int rmToInt, int lastNumber, int cumulativeValue, int nextInt) {
	        if (lastNumber < rmToInt) {
      	
	        		//return lastRmToInt+rmToInt;
	            return Math.abs((cumulativeValue - rmToInt));
	        } else {
	            return cumulativeValue + rmToInt;
	        }
	    }
	  
	  public static int romanToInt(char c){
		  switch (c){
		  case 'M': return 1000;
		  case 'D': return 500;
		  case 'C': return 100;
		  case 'L': return 50;
		  case 'X': return 10;
		  case 'V': return 5;
		  case 'I': return 1;
		  default: return 0;
		  }
	  }
	  
	  
}
