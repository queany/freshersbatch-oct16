package test.co;
import java.util.*;

public class TestStoreMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Customer name:");
		String name=sc.nextLine();
		System.out.println("Enter Customer Id  :");
		String idno=sc.nextLine();
		System.out.println("Enter Customer balance:");
		double balance=sc.nextDouble();
		
		Customer c=new Customer(name,idno,balance);
		
		System.out.println("Item1");
		System.out.println("Enter Item name:");
		sc.nextLine();
		String itemName=sc.nextLine();
		System.out.println("Enter Item id:");
		String itemno=sc.nextLine();
		System.out.println("Enter item Quantity :");
		int itemquantity=sc.nextInt();
		System.out.println("Enter item price");
		double price=sc.nextDouble();
		
		Item a=new Item( itemName,itemno,itemquantity,price);
		
		c.buyItem(a); 
			
	}

	}


