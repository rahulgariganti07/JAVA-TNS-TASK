package task;

public class BankAccount {
	private String username;
	private String password;
	private double balance;
	
	public BankAccount(String username, String password, double balance) {
	    this.username = username;
	    this.password = password;
	    this.balance = balance;
	}
	public String getUsername() {
	    return username;
	}

	public String getPassword() {
	    return password;
	}

	public double getBalance() {
	    return balance;
	}
	public void deposit(double amount) {
	    if (amount > 0) {
	        balance = balance + amount;
	        System.out.println("Amount deposited successfully.");
	    } else {
	        System.out.println("Invalid amount.");
	    }
	}
	public void withdraw(double amount) {
	    if (amount <= 0) {
	        System.out.println("Invalid amount.");
	    } else if (amount > balance) {
	        System.out.println("Insufficient balance.");
	    } else {
	        balance = balance - amount;
	        System.out.println("Amount withdrawn successfully.");
	    }
	}
	public void changePassword(String oldPassword, String newPassword) {

	    if (password.equals(oldPassword)) {
	        password = newPassword;
	        System.out.println("Password changed successfully.");
	    } else {
	        System.out.println("Incorrect current password.");
	    }
	}

}
