package Myfirst;

import java.util.Scanner;

class Person1{
	 String name;
	   int id;
	  
	     Scanner sc=new Scanner(System.in);
	         
		
		    public void per() {
		    	 System.out.println(" Enter your name:");
			      name=sc.next();
			      System.out.println(" Enter your id:");
			      id=sc.nextInt();
		    }
		}

		class Teacher extends Person1 {
			String dept;
			String subject;
		     
		    Scanner sc=new Scanner(System.in);
		    void teach()
		     {
		        
		      System.out.println(" enter your dept name:");
		       dept=sc.next();
		       System.out.println(" enter your subject name:");
		       subject=sc.next();
		   
		}
		}
		
		class  Student extends Teacher {
			String branch;
			int rollno;
		     
		    Scanner sc=new Scanner(System.in);
		    void stu()
		     {
		        
		      System.out.println(" enter your branch :");
		       branch=sc.next();
		       System.out.println(" Enter your rollno:");
			      rollno=sc.nextInt();
		   
		    }
		}
      class Staff extends Student{
   	   String admin;
		     
		    Scanner sc=new Scanner(System.in);
		    void staf()
		     {
		        
		      System.out.println(" enter your admin:");
		       admin=sc.next();
		   
		    }
		}
		
public class SchoolSystem {

	public static void main(String[] args) {
		 Staff S = new Staff();
	       
	        S.per();
	       S.teach();
	        S.stu();
	        S.staf();
	       
		

	}

}
