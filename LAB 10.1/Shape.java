package srija;

public abstract class Shape{
	
	    abstract double calculation();
	}

	class Rectangle extends Shape {
	     double length;
	    double width;

	    Rectangle(double length, double width) {
	        this.length = length;
	        this.width = width;
	    }

	    
	    double calculation() {
	        return length * width;
	    }
	}

	class Circle extends Shape{
	    private double radius;

	    Circle(double radius) {
	        this.radius = radius;
	    }

	  
	    double calculation() {
	        return Math.PI * radius * radius;
	    }
	

	
	    public static void main(String[] args) {
	        Rectangle rectangle = new Rectangle(5, 4);
	        System.out.println("Area of Rectangle: " + rectangle.calculation());

	        Circle circle = new Circle(3);
	        System.out.println("Area of Circle: " + circle.calculation());
	    }
	}
	