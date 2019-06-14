package BankDemo;

public class Insuffientfund extends Exception{
	
	double amount;
	
	public Insuffientfund(double amount) {
		// TODO Auto-generated constructor stub
		
		this.amount = amount;
		
	}
	
	public double getAmount(){
		
		return amount;
	}

}
