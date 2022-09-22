/*
Program: Java program to create a bank account and display the peopole with balance less than 1000.
@Author:- Debjit Talukder.
@Date:- 22Sep, 2022.
*/
import java.util.Scanner;
import java.util.*;  
class Account
{
	
	
	private int accID;
	private String accName;
	private double balance;
	
	
    Account()
	{
		
	}
	
	
	Account(int accID,String accName,double balance)
	{
		this.accID=accID;
		this.accName=accName;
		this.balance=balance;
		
	}
	
	
	public int getAccID()
	{
		return this.accID;
	}
	
	public void setAccID(int accID)
	{
		this.accID=accID;
	}

	
	public String getAccName()
	{
		return this.accName;
	}
	
	public void setAccName(String accName)
	{
		this.accName=accName;
	}
	
	
	public double getBalance()
	{
		return this.balance;
	}
	
	public void setBalance(double balance)
	{
		this.balance=balance;
	}
}
class Bank
{
	//main method
	public static void main(String ...args)
	{
		
		
		//declaring objects of Account class
		Account acc1= new Account(403610110002395,"Anudip Das",1000.0);
		Account acc2= new Account(403610110002578,"Paresh Rawal",999.0);
		
		// displaying the account
		System.out.println("Account ID:  "+acc1.getAccID()+"   Name:   "+acc1.getAccName()+"  Balance:  "+acc1.getBalance());
		System.out.println("Account ID:  "+acc2.getAccID()+"   Name:   "+acc2.getAccName()+"  Balance:  "+acc2.getBalance());
		
		
		
		
		
	}
	
}