package myfirstprogram;

import java.util.Scanner;

public class MathOperation {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the first number");
		int n1 =s.nextInt();
		System.out.println("Enter the second number");
		int n2 =s.nextInt();
		System.out.println("The addition of the numbers is:"  +(n1+n2));
		System.out.println("The multiplication of the numbers is:"  +(n1*n2));
		System.out.println("The division of the numbers is:"  +(n1/n2));
		System.out.println("The substraction of the numbers is:"  +(n1-n2));
	}

}
