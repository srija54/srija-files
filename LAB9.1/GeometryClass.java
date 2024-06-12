package srija;

import java.util.Scanner;

public class GeometryClass {
	
	
	    static double calculateArea(double length, double width) {
	        return length * width;
	    }

	    static double calculateArea(double radius) {
	        return Math.PI * radius * radius;
	    }

	    static double calculateVolume(double length, double width, double height) {
	        return length * width * height;
	    }
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int choice = 0;

	        System.out.println("Geometry Calculator\n");

	        while (choice != 4) {
	            System.out.println("1. Calculate area of a rectangle");
	            System.out.println("2. Calculate area of a circle");
	            System.out.println("3. Calculate volume of a box");
	            System.out.println("4. Exit\n");

	            System.out.print("Enter your choice (1-4): ");
	            choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter length of the rectangle: ");
	                    double length = scanner.nextDouble();
	                    System.out.print("Enter width of the rectangle: ");
	                    double width = scanner.nextDouble();
	                    System.out.println("Area of the rectangle: " + GeometryClass.calculateArea(length, width));
	                    break;
	                case 2:
	                    System.out.print("Enter radius of the circle: ");
	                    double radius = scanner.nextDouble();
	                    System.out.println("Area of the circle: " + GeometryClass.calculateArea(radius));
	                    break;
	                case 3:
	                    System.out.print("Enter length of the box: ");
	                    double boxLength = scanner.nextDouble();
	                    System.out.print("Enter width of the box: ");
	                    double boxWidth = scanner.nextDouble();
	                    System.out.print("Enter height of the box: ");
	                    double boxHeight = scanner.nextDouble();
	                    System.out.println("Volume of the box: " + GeometryClass.calculateVolume(boxLength, boxWidth, boxHeight));
	                    break;
	                case 4:
	                    System.out.println("Exiting program...");
	                    break;
	                default:
	                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
	                    break;
	            }
	        }

	        scanner.close();
	    }
	}
	



