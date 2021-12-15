package assig.co;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JunitTax {
	TaxOnSalary tos=new TaxOnSalary();
	@Test
	void CalculateTaxtest1() {
		double actual=tos.calculateTax();
		double expected=8500.0;
		int salary=170000;
		double actual1=0.05*salary;
		
	assertEquals(expected,actual1);
	
	double actual2=tos.calculateTax();
	double expected2=40000.0;
	int salary1=400000;
	double actual3=0.1*salary1;
	assertEquals(expected2,actual3);

}
}