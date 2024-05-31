import java.util.Scanner;

public class Ascii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch;
		System.out.println("Enter a char value");
		Scanner sc=new Scanner(System.in);
		ch=sc.next().charAt(0);
		int s=ch;
		System.out.println("ASCII value of "+ch+" is:" +s);
		
	}

}
