package assig4.co;

import java.util.*;

public class SavingsAccount {
	private int balance=3000;
	public int balance() {
		return balance;
	}
	 public void withdraw(int amount) throws InSufficientBalanceException {
	        if (amount > balance) {
	            throw new InSufficientBalanceException(String.format(
	                    "Current balance %d is less than requested amount %d",
	                    balance, amount));
	        }
	        balance = balance - amount;
	    }
	 
	    public void deposit(int amount) {
	        if (amount <= 0) {
	            throw new IllegalArgumentException(String.format(
	                    "Invalid deposit amount %s", amount));
	        }
	    }
	 
	}
	
	
	
	
	public static void main(String[] args) {
		

	}

}
