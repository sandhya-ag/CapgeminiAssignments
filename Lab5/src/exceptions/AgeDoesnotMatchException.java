package exceptions;

//exercise 1


public class AgeDoesnotMatchException extends Exception{
	 
	private static final long serialVersionUID = 1L;


	public AgeDoesnotMatchException(String message) {
super(message);
	}
	    
	 
	   public String toString(){
	     return ("CustomException[Age is not between 17 and 24]") ;
	  }
}
