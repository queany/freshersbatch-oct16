package beanlife.co;

public class Samosa {
private double price;

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	System.out.println("Setting property");
	this.price = price;
}

public Samosa() {
	super();
	
}

@Override
public String toString() {
	return "Samosa [price=" + price + "]";
}
public void init() {
	System.out.println("Inside init method");
}
public void destroy() {
	System.out.println("Inside destroy method");
}
}
