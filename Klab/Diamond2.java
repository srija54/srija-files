package srija;

public class Diamond2 {
	
	
	    public static void main(String[] args) {
	        int rows = 5;
	        int spaces = rows - 1;
	        
	        for (int i = 1; i <= rows; i++) {
	            for (int j = 1; j <= spaces; j++) {
	                System.out.print("  ");
	            }
	            spaces--;
	            for (int j = 1; j <= 2 * i - 1; j++) {
	                System.out.print("* ");
	            }
	            System.out.println();
	        }
	    }
	}