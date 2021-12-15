package Account.queany;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Account ac1=new Account("1030456","Queany",7000);
		Account ac2=new Account("1030456","Kevin");
		System.out.println("Id for acc1:"+ac1.getId());
		System.out.println("AccountId:"+ac2.getId());
		System.out.println("Name:"+ac1.getName());
		System.out.println("Balance:"+ac1.getBalance());
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter deposit amount");
		System.out.println("Balance:"+ac1.credit(obj.nextInt()));
		System.out.println("Enter withdrawal amount");
		System.out.println("Balance:"+ac1.debit(obj.nextInt()));
		System.out.println("Enter transfer amount");
		System.out.println("Balance:"+ac1.transferTo(ac2, obj.nextInt()));
		System.out.println(ac1.toString());
		System.out.println(ac2.toString());
	}

}
