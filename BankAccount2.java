public class BankAccount2{
	private double balance;
	private String titleOfAccount;
	private String nameOfAccountHolder;
	private String branchCode;
	private String branchAddress;
	private double interestRate;

	public BankAccount(int money, String title,String AccountHolder){
		this(money,title,AccountHolder,null,null);
	}
	public BankAccount(int money, String title,String AccountHolder,String bCode,String bAddress){
		balance=money;
		titleOfAccount=title;
		nameOfAccountHolder=AccountHolder;
		branchCode=bCode;
		branchAddress=bAddress;
	}
	
	public String getName(){
		return titleOfAccount;
	}

	public void renameAccount(String name){
		titleOfAccount=name;
	}

	public void cashWithdrawl(int money){
		balance-=money;
	}

	public void cashDeposit(int money){
		balance+=money;
	}

	public double remainingBalance(){
		return balance;
	}

	public void updateBalance(){
		if(balance>100000)
			balance+=(10.0/100)*balance;
	}
	
	public int calculateInterest(int rate, int amount, int time){
		return (amount*rate*time)/100;
	}

	public int payableTax(int money, int rate){
		return money>100000?(money*rate)/100:0;
	}
}