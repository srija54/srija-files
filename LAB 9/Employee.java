package Myfirst;

import java.util.Scanner;

 class Company{
	 String name;
	   int id;
	  
	     Scanner sc=new Scanner(System.in);
	         
		
		    public void emp() {
		    	 System.out.println(" Enter your name:");
			      name=sc.next();
			      System.out.println(" Enter your age:");
			      id=sc.nextInt();
		    }
		}

		class Manager extends Company {
			String dept;
		     
		    Scanner sc=new Scanner(System.in);
		    void man()
		     {
		        
		      System.out.println(" enter your dept name:");
		       dept=sc.next();
		   
		}
		}
		
		class Worker extends Manager {
			String work;
		     
		    Scanner sc=new Scanner(System.in);
		    void wor()
		     {
		        
		      System.out.println(" enter your work :");
		       work=sc.next();
		   
		    }
		}
       class Intern extends Worker{
    	   String role;
		     
		    Scanner sc=new Scanner(System.in);
		    void rol()
		     {
		        
		      System.out.println(" enter your role :");
		       role=sc.next();
		   
		    }
		}
		class Employee{
		
		    public static void main (String args[]) {
		        
		        Intern e = new Intern();
		       
		        e.emp();
		       e.man();
		        e.wor();
		        e.rol();
		       
		       
		    }
			}
		
		