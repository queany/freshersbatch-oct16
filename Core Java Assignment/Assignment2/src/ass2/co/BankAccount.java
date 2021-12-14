package ass2.co;

public class BankAccount {
private String name;
protected double balance;
public String getName() {
	return this.name;
}
public void deposite(double amount) {
	this.balance+=amount;
}
public boolean withdraw(double amount) {
	if(balance>=amount) {
		balance-=amount;
		return true;
	}

	else {
		return false;
	}
}



}
