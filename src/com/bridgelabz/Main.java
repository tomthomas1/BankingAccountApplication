package com.bridgelabz;

/**
 * Main method to calculate the interest & balance
 * Here we are creating the object and calling the constructor and passing the saving balance
 * @author Tom
 *
 */
public class Main {
	public static void main(String[] args) {
		/**
		 * created 2 objects for 2 accounts
		 */
		SavingAccount saver1 = new SavingAccount(2000);
		SavingAccount saver2 = new SavingAccount(3000);

		/**
		 * we are calling the setAnnualIntrestRate and passing the 4% interest rate 
		 */
		SavingAccount.setAnnualIntrestRate(4);

		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();

		System.out.println("---------Saving Account Application------- ");
		System.out.println("This month with 4% Interest Rate ");
		System.out.println("Saver 1 Balnace is : " + saver1.getSavingBalance());
		System.out.println("Saver 2 Balnace is : " + saver2.getSavingBalance());

		/**
		 * we are calling the modifyIntrestRate and passing the 5% interest rate 
		 */
		SavingAccount.modifyIntrestRate(5);

		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();

		System.out.println("---------Saving Account Application------- ");
		System.out.println("Next month with 5% Interest Rate ");
		System.out.println("Saver 1 Balnace is : " + saver1.getSavingBalance());
		System.out.println("Saver 2 Balnace is : " + saver2.getSavingBalance());
		
		
	}

}
