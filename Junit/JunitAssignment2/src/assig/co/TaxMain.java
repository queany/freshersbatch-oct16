package assig.co;

public class TaxMain {

	public static void main(String[] args) {
		TaxOnSalary tos=new TaxOnSalary(false);
		TaxOnSalary tos1=new TaxOnSalary(true);
		tos.inputsalary();
		tos1.inputsalary();
		System.out.println("Tax1  :"   +tos.calculateTax());
		System.out.println("Tax2  :"   +tos1.calculateTax());
	

	}

}
