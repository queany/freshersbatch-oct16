package Account.queany;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AccountTest {

	@Test
	void test() {
		AccountTest test=new AccountTest();
		Account ac1=new Account("1030456","Queany",7000);
		Account ac2=new Account("1030456","Kevin");
	}

}
