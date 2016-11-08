//UsmanFarooq-15026371
//Lab Week4-Q3
public class BankAccount3{
	private String accountName;
	private double amount;
	
	public BankAccount(){
		this(null,0);
	}
	public BankAccount(String name,int money){
		accountName=name;
		amount=money;
	}
	
	public void renameAccount(String name){
		accountName=name;
	}

	public String getName(){
		return accountName;
	}

	public void cashWithdrawl(int money){
		amount-=money;
	}

	public void cashDeposit(int money){
		amount+=money;
	}

	public double remainingBalance(){
		return amount;
	}

	public void updateBalance(){
		if(amount>100000)
			amount+=(10.0/100)*amount;
	}
}