package com.bridgelabz;

/**
 *  Java program to calculate the monthly Interest and showing the balance.
 *  Here we creating static variable annualInterestRate and savingBalance
 * @author Tom
 *
 */
public class SavingAccount {
    static private double annualIntrestRate;
	private double savingBalance;
	
	/**
	 * We have constructed a parameterized constructor and passing the saving balance to it.
	 * @param savingBalance
	 */
	public SavingAccount(double savingBalance) {
		super();
		this.savingBalance = savingBalance;
	}


	/**
	 * Here will have modified the annual Interest Rate here by taking the input from console
	 * Then we are setting the annualIntrestRate as newInterestRate
	 * @param newInterestRate
	 */
	public static void modifyIntrestRate(double newInterestRate) {
		annualIntrestRate = newInterestRate;
	}


	/**
	 * Here we are setting the annual Interest Rate here by taking the input from console
	 * Then we are setting the annualIntrestRate as newInterestRate
	 * @param newInterestRate
	 */
	public static void setAnnualIntrestRate(double newInterestRate) {
		annualIntrestRate = newInterestRate;
	}


	/**
	 * getters and setters for the account balance
	 * @return -  It will return the account balance
	 */
	public double getSavingBalance() {
		return savingBalance;
	}


	public void setSavingBalance(double savingBalance) {
		this.savingBalance = savingBalance;
	}
	
	/**
	 * Method to calculate the monthly Interest
	 * 1. Here we are multiplying the saving balance with annualInterest div by 100. And the result div by 12 for calculating per month
	 * Then we are adding the monthlyInterest to the saving balance
	 */
	public void calculateMonthlyInterest() {
		double monthlyInt = savingBalance*(annualIntrestRate/100)/12;
		savingBalance+=monthlyInt;
	} 

}
