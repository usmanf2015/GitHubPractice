//UsmanFarooq-15026371
//Lab Week4-Q3
public class TestBankAccount3{
	public static void main(String[]args){
		int size=5;
		BankAccount[] accounts=new BankAccount[size];

		//initiallizing array with default constructor
		for(int i=0;i<size;i++){
			accounts[i]=new BankAccount();
			System.out.println(accounts[i].getName()+"\t"+accounts[i].remainingBalance());
		}

		//initiallizing array with non-empty constructor
		
		accounts[0]=new BankAccount("Faizan",1000);
		accounts[1]=new BankAccount("Shahid",1520);
		accounts[2]=new BankAccount("Naveed",5214);
		accounts[3]=new BankAccount("Waleed",7565);
		accounts[4]=new BankAccount("Usama",4444);

		for(int i=0;i<size;i++){
			System.out.println(accounts[i].getName()+"\t"+accounts[i].remainingBalance());
		}
		
	}
}