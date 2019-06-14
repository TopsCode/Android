package BankDemo;

import java.util.Scanner;

public class BankDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CheckingAccount c = new CheckingAccount(101);
		
		c.getBalance();
		
		System.out.println("Enter the amount for deposite :");
		Scanner sc = new Scanner(System.in);
		double amount = sc.nextDouble();
		
		c.desposite(amount);
		
		System.out.println("Current Balance :"+c.getBalance());
		
		
		try{
			
			System.out.println("Enter the amount for withdraw :");
			amount = sc.nextDouble();
			
			c.withdraw(amount);
			System.out.println("Current Balance :"+c.getBalance());
			
		}catch(Insuffientfund e){
			
			System.out.println("Sorry you need Another"+e.getAmount());
			c.getBalance();
			
		}

	}

}
