package test.co;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

import org.junit.jupiter.api.Test;

class JTestCustomer {
	Customer c=new Customer("Queany","123",5000.0);
	Item a=new Item( "Cake","c12",2,1000.0);
	
	@Test
		public void testName() 
		{
				assertEquals("Queany",c.getName());
		}
	@Test
		public void testIdNo() 
		{
				assertEquals("123",c.getIdno());
		}
	@Test
		public void testPrice() 
		{
				assertEquals(5000,c.getBalance());
		}
	@Test
		public void testitemName() 
		{
				assertEquals("Cake",a.getItemName());
		}
	@Test
		public void testitemidno() 
		{
				assertEquals("c12",a.getItemno());
		}
	@Test
		public void testPrice1() 
		{
				assertEquals(1000,a.getPrice());
		}
		
	
		
	}


