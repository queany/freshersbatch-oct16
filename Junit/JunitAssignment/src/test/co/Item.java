package test.co;

public class Item {
	private String itemName;
	 private String itemno;
	 private int itemquantity;
	 private double price;
	 
	 
	 public Item( String itemName,String itemno,int itemquantity,double price)
	 {
		 this.itemName=itemName;
		 this.itemno=itemno;
		 this.itemquantity=itemquantity;
		 this.price=price;
		 
	 }
	 public Item( String itemName,String itemno,int itemquantity)
	 {
		 this.itemName=itemName;
		 this.itemno=itemno;
		 this.itemquantity=itemquantity;
		 this.price=500;
		 
	 }
	 public Item( String itemName,String itemno)
	 {
		 this.itemName=itemName;
		 this.itemno=itemno;
		 this.itemquantity=2;
		 this.price=500;		 
	 }

	
	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemno() {
		return itemno;
	}

	public void setItemno(String itemno) {
		this.itemno = itemno;
	}
	
	public int getItemquantity() {
		return itemquantity;
	}
	
	public void setItemquantity(int itemquantity) {
		this.itemquantity = itemquantity;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Item [itemName=" + itemName + ", itemno=" + itemno + ", itemquantity=" + itemquantity + ", price="
				+ price + "]";
	}
	 

}
