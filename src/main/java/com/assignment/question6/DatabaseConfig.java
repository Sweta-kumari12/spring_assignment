package com.assignment.question6;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
/*@Component is a Spring annotation that marks this class as a Spring-managed component. This means
 *  that Spring will automatically create an instance of this class and manage its lifecycle.
 */
@Component
public class DatabaseConfig {
	/*@Value is another Spring annotation that is used to inject values into a component's properties.
	 *  In this class, we have two properties, x and y, which are annotated with @Value. The values of 
	 *  these properties are set using Spring Expression Language (SpEL) expressions enclosed in curly braces {}.
	 */

	@Value("Sweta Mishra")
	private String AccountHolderName;
	
	@Value("Saving")
	private String AccountType;
	
	@Value("63746")
	private int AccountNumber;

	public String getAccountHolderName() {
		return AccountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		AccountHolderName = accountHolderName;
	}

	public String getAccountType() {
		return AccountType;
	}

	public void setAccountType(String accountType) {
		AccountType = accountType;
	}

	public int getAccountNumber() {
		return AccountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		AccountNumber = accountNumber;
	}

	public DatabaseConfig() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void details() {
		System.out.println("AccountHolderName: " + getAccountHolderName());
		System.out.println("AccountType: " + getAccountType());
		System.out.println("AccountNumber: " + getAccountNumber());
	}

	}