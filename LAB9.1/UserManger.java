package srija;

public class UserManger {
	
	    void authenticate(String username, String password) {
	       
	       System.out.println("enter valid inputs");
	       }
		 
	    void authenticate(String email, int password ) {
	    	 System.out.println("enter valid inputs to authenticate");
	      
	    }
	    public static void main(String args[]) 
	    { 
	        UserManger s = new UserManger(); 
	        s.authenticate("@gmail.com", 123); 
	       
	    } 
	}
	


