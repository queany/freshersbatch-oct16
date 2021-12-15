package test.co;

public class Customer {
	private String name;
	private String idno;
	private double balance;
	private Item  item;
	
	public Customer(String name,String idno, double balance)
	{
		this.name=name;
		this.idno=idno;
		this.balance=balance;
	}
	public Customer(String name,String idno)
	{
		this.name=name;
		this.idno=idno;
		this.balance=5000;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void setIdno(String idno) {
		this.idno = idno;
	}
	
	

	public String getName() {
		return name;
	}
	
	public String getIdno() {
		return idno;
	}
	public double getBalance() {
		return  balance;
	}
	
	public void print_item_details()
	{
		System.out.println("Details");
		System.out.println("Item Name:" +item.getItemName());
		System.out.println("Item idno:" +item.getItemno());
		System.out.println("Item Quantity:" +item.getItemquantity());
		System.out.println("Item Price:" +item.getPrice());
	}
	public void buyItem(Item brought_item)
	{
		if(balance<(brought_item.getPrice()*brought_item.getItemquantity()))
		{
			System.out.println("Insufficient balance");
			return;
		}
		else if(brought_item.getItemquantity()<2)
		{
			System.out.println("Order not valid");
		}
		else
		{
			item=brought_item;
			this.balance-=((brought_item.getItemquantity())*(brought_item.getPrice()));
			 print_item_details();
			System.out.println("Current balance:"  +this.balance);
		}
	}
	@Override
	public String toString() {
		return "Customers [name=" + name + ", idno=" + idno + ", balance=" + balance + ", item=" + item + "]";
	}
	

}
