package javafiles;


public class EmployeeDetails {

		
	     int eid;  
	     String ename;  
	     static String company = "WIPRO";  
	     //static method to change the value of static variable  
	     static void change(){  
	     company= "info";  
	     }  
	     //constructor to initialize the variable  
	     EmployeeDetails(int e, String n,String c){  
	     eid = e;  
	     ename = n;
	     company=c;
	     }  
	     //method to display values  
	     void display(){System.out.println(eid+" "+ename+" "+company);}
	     
	     public static class TestStaticMethod{  
	    	    public static void main(String args[]){  
	    	    EmployeeDetails.change();//calling change method  
	    	    //creating objects  EmployeeDetai
	    	    EmployeeDetails s1 = new EmployeeDetails(11,"ram","wipro");  
	    	    EmployeeDetails s2 = new EmployeeDetails(12,"srija","wipro");  
	    	    EmployeeDetails s3 = new EmployeeDetails(13,"shyam","wipro");  

	    	    //calling display method  
	    	    s1.display();  
	    	    s2.display();  
	    	    s3.display();  
	    	    }  
	    	}  
	     
	
}



