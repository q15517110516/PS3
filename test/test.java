import static org.junit.Assert.*;

import javax.naming.InsufficientResourcesException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

public class test {

	@AfterClass
	public static void tearDownAfterClass() throws Exception {

	}

	@Test
	public void Test() {
		Account AccountTest = new Account(1122, 20000,0.045);
		AccountTest.setAnnualInterestRate(0.045);

		try{
			AccountTest.Withdraw(2500);
		} catch (InsufficientResourcesException e) {
			System.out.println("You can't withdraw, because your balance is :" +  e.getAmount());
		}

		AccountTest.Deposit(3000);
		System.out.println("Your balance is:" + AccountTest.getBalance() + "The monthly interest is:"
				+ AccountTest.getMonthlyInterestRate()+
				"The date account created is:" + AccountTest.getDateCreated());
	}

}