package srija;

import java.util.Scanner; //imported the Scanner class

public class TransposeMatrix { //defined a class TransposeMatrix
	public static void main(String args[]) { //defined a main method
		int i, j;// Declared and initialize variables i, j to 0.
		System.out.println("Enter total rows and columns: ");// Printed a message to the console to enter the total rows and columns of the matrix.
		Scanner s = new Scanner(System.in);// Create an object of the Scanner class and read the user input of rows and columns
		int row = s.nextInt();
		int column = s.nextInt();
		int array[][] = new int[row][column];//Create a 2D array of integer type using the input dimensions.
		System.out.println("Enter matrix:");//Print a message to the console to enter the elements of the matrix.
		//Use nested for loops to read user input and store them in the matrix.
	 	for(i = 0; i < row; i++)
	  	{
	   	    for(j = 0; j < column; j++) 
	     	    {
	        	array[i][j] = s.nextInt();
	        	System.out.print(" ");
	            }
	  	}
		System.out.println("The above matrix before Transpose is ");//Print the matrix before transpose.
		//Use nested for loops to calculate the matrix
	  	for(i = 0; i < row; i++)
	    	{
	      	    for(j = 0; j < column; j++)
	            {
	          	System.out.print(array[i][j]+" ");
	            }
	      	  System.out.println(" ");
	        }
	 	System.out.println("The above matrix after Transpose is ");
	 	//Use nested for loops to calculate the transpose of the matrix and print it to the console.
	  	for(i = 0; i < column; i++)
	    	{
	      	    for(j = 0; j < row; j++)
	            {
	                System.out.print(array[j][i]+" ");
	            }
	            System.out.println(" ");
	        }
	    }
	}