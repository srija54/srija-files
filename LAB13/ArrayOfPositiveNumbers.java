package srija;

import java.util.Scanner;//imported the Scanner class from java.util package

public class ArrayOfPositiveNumbers {//defined a class ArrayOfPositiveNumbers
	
		public static void main(String[] args)//defined a main method
		{   
			//Create a object of scanner class
			Scanner sc =new Scanner(System.in);
			System.out.print("Enter the Array Limit :");//print statement in order to enter the limit of array
			int s =sc.nextInt();//Read the limit of the array
			int [] a =new int[s];// Initialize an integer array of size of s
			int sum = 0;// Initialize a variable to store the sum of positive elements

			for(int i=0;i<s;i++)// Input loop to populate the array with user inputs
			{
				System.out.printf("Element of a[%d] :",i);
				a[i]=sc.nextInt();
			}
			// Loop through the array to calculate sum of positive elements
			for(int p:a)
			{
				if(p>0) {
					sum = sum + p;
			}
				// Output the sum of positive  array elements
			System.out.println("Sum of Positive Array Elements : " +sum);
	    }
	
        
		} 
      
    }


