package srija;

public class BankAccounts {
	public class BankAccount {
	    private String accountType;
	    private double balance;

	  
	    public BankAccount(String accountType) {
	        this.accountType = accountType;
	        this.balance = 0.0;
	    }

	   
	    public BankAccount(String accountType, double initialBalance) {
	        this.accountType = accountType;
	        this.balance = initialBalance;
	    }

	   
	    public void deposit(double amount) {
	        balance += amount;
	        System.out.println("Deposited " + amount + "  " + accountType + " account");
	    }

	   
	    public void deposit(String depositType, double amount) {
	        balance += amount;
	        System.out.println("Deposited " + amount + "  " + depositType + " into " + accountType + " account");
	    }

	    
	    public void withdraw(double amount) {
	        if (balance >= amount) {
	            balance -= amount;
	            System.out.println("Withdrawn " + amount + " from " + accountType + " account");
	        } else {
	            System.out.println("Insufficient funds");
	        }
	    }

	   
	    public double checkBalance() {
	        return balance;
	    }

	    public void main(String[] args) {
	        BankAccount savingsAccount = new BankAccount("Savings");
	        savingsAccount.deposit(1000);
	        savingsAccount.withdraw(200);
	        System.out.println("Savings Account Balance: " + savingsAccount.checkBalance());

	        BankAccount checkingAccount = new BankAccount("Checking", 500);
	        checkingAccount.deposit("cash", 300);
	        checkingAccount.withdraw(100);
	        System.out.println("Checking Account Balance: " + checkingAccount.checkBalance());
	    }
	}
}