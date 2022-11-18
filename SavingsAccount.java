
public class SavingsAccount extends BankAccount {
	
	private double rate=2.5;
	private int savingsNumber=0;
	private String accountNumber; 
	
	
	
	public SavingsAccount(String name, double amount) {
		
		super(name, amount);
		this.accountNumber=super.getAccountNumber()+"-"+savingsNumber;
		
		
	}
	
	public SavingsAccount(SavingsAccount saving , double amount) {
		super(saving,amount);
		this.savingsNumber=saving.savingsNumber+1;
		this.accountNumber=super.getAccountNumber()+"-"+savingsNumber;
		savingsNumber++;
		
		
	}
	
	
	
	public void postInterest () {
		double amount=(super.getBalance()*rate)/100/12;
		super.deposit(amount);
	}
	@Override
	public String getAccountNumber()
	{
		return this.accountNumber;
	}
	
	
}
