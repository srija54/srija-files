package srija;

import java.util.Scanner;

public interface BankingInterface {
	
	    void deposit(double amount);
	    void withdraw(double amount);
	    double getBalance();
	}

	class SavingsAccount implements BankingInterface {
	    private double balance;

	   
	    public void deposit(double amount) {
	        balance += amount;
	    }

	   
	    public void withdraw(double amount) {
	        if (amount <= balance) {
	            balance -= amount;
	        } else {
	            System.out.println("Insufficient funds!");
	        }
	    }

	   
	    public double getBalance() {
	        return balance;
	    }
	}

	class CurrentAccount implements BankingInterface {
	    private double balance;

	   
	    public void deposit(double amount) {
	        balance += amount;
	    }

	   
	    public void withdraw(double amount) {
	        balance -= amount;
	    }

	   
	    public double getBalance() {
	        return balance;
	    }
	

	
	    public static void main(String[] args) {
	    	 Scanner scanner = new Scanner(System.in);

	        
	         SavingsAccount savingsAccount = new SavingsAccount();
	         System.out.print("Enter initial deposit amount for savings account: ");
	         double savingsInitialDeposit = scanner.nextDouble();
	         savingsAccount.deposit(savingsInitialDeposit);

	         System.out.print("Enter amount to withdraw from savings account: ");
	         double savingsWithdrawAmount = scanner.nextDouble();
	         savingsAccount.withdraw(savingsWithdrawAmount);
	         System.out.println("Savings Account Balance: " + savingsAccount.getBalance());

	        
	         CurrentAccount currentAccount = new CurrentAccount();
	         System.out.print("Enter initial deposit amount for current account: ");
	         double currentInitialDeposit = scanner.nextDouble();
	         currentAccount.deposit(currentInitialDeposit);

	         System.out.print("Enter amount to withdraw from current account: ");
	         double currentWithdrawAmount = scanner.nextDouble();
	         currentAccount.withdraw(currentWithdrawAmount);
	         System.out.println("Current Account Balance: " + currentAccount.getBalance());

	         scanner.close();
	     }
	 }
	 

	    
	       