package assig.co;
import java.util.Scanner;
public class TaxOnSalary {
	private double salary;
	private boolean isPANsubmitted;
	public TaxOnSalary()
	 {
		 
	 }
	
	 public TaxOnSalary(boolean isPANsubmitted)
	{
		this.isPANsubmitted=isPANsubmitted;
		this.salary=1000;
	}
	 

	public double getSalary() {
		return salary;
	}
	
	public boolean isPANsubmitted() {
		return isPANsubmitted;
	}
	public void inputsalary() 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the input salary");
		salary=sc.nextDouble();
	
	}
	public double calculateTax()
	{
		if(salary<180000 &&  isPANsubmitted==true)
		{
		return 0;
	    }
		else if(salary<180000 && isPANsubmitted==false )
		{
			return 0.05*salary;
		}
		else if(salary<500000)
		{
			return 0.1*salary;
		}
		else if(salary<1000000)
		{
			return 0.2*salary;
		}
		else
		{
			return 0.3*salary;
		}
	}
}
