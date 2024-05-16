package myfirstprogram;

import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {

	   Scanner t=new Scanner(System.in);
	   String userinput1  ;
	   {
		   System.out.println("Enter YES to move to next step:");
		   userinput1=t.nextLine();
	   }
	   
		
        double radius,area;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        

        radius = sc.nextDouble();
        area = Math.PI*radius*radius;
        System.out.println("Area of circle is:" +area);
	}

}
