package BankPackage;

public class bankAccount {
	int accountNumber;
	String accountHolderName;
    double balance;
	double interestRate;
	
	public bankAccount(int theAccountNumber, double theBalance, String theHoldersName, double theInterestRate)  {
		accountNumber = theAccountNumber;
		accountHolderName = theHoldersName;
		balance = theBalance;
		interestRate = theInterestRate;
	}
	
	public String accountInformation(String accountHolderName, String accountNo) {
		return accountHolderName + accountNo;
	}
	
	
	public double deposit(double amount) {
		if (amount > 0) {
			balance += amount;
//			System.out.println(amount + " Deposited Succesfuly. New balance is " + balance);
			return  balance;
		}
		else {
//			System.out.println("Invalid");
			return amount;
		}
	}
	
	public int deposit(int amount) {
		return amount;
	}
	
	public double withdraw(double amount) {
		
		if (amount > balance) {
//			System.out.println("Insufficient funds");
			return 0;
		}
		
		else if (amount < 0) {
//			System.out.println("You cannot withdraw an amount less than 0. Enter a correct value");
			return 0;
		}
		
		else if(balance > 0) {
			balance -= amount;
//			System.out.println( " You have withdrawn " + amount + " succesfuly. New balance is  " + balance);
			return balance;
		}
		 
		else {
//			System.out.println("Invalid");
			return 0;
		}
			
		
	}
	
	public int withdraw(int balance) {
		return balance;
	}
	

	
	

	public static void main(String[] args) {
		
      bankAccount money = new bankAccount(1234789, 20000, "Dorian Kalisa", 0.5);
      
      double bankBalance = money.deposit(3000);
    System.out.println(bankBalance);
    
//      money.withdraw(5000);
//      money.withdraw(4000);
//      money.withdraw(-5000);
    
    double bankWithdraw = money.withdraw(5000);
    System.out.println("Your account balance is " + bankWithdraw);
    
    String accountInfo = money.accountInformation("Dorian Kalisa ", "023457857339");
    System.out.println(accountInfo);
    
    String accountInfo2 = money.accountInformation("John Peter ", "98594002848");
    System.out.println(accountInfo2);
    
    System.out.println(money.accountNumber + " " );
    
      

	}

}
