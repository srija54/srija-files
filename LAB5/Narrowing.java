package myfirstprogram;

public class Narrowing {
	
		   public static void main(String args[]) {
	 int bigNumber = 10000000;

	   short littleNumber = 1000;

	   littleNumber = (short) bigNumber;
	   System.out.println(littleNumber);
	}
}
