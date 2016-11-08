import java.util.Scanner;
public class TestBankAccount2{
	public static void main(String[]args){
		Scanner input= new Scanner(System.in); //to take manual input
		BankAccount account1,account2,account3,currentAccount; //to make multiple accounts

		account1=new BankAccount(1000,"Account1","abc");
		account2=new BankAccount(1000,"Account2","pqr");
		account3=new BankAccount(1000,"Account3","xyz","LH1241","Lahore");
		currentAccount=account1;
		
		char action='a';
		do{
			System.out.println("Enter 1,2 & 3 for " + account1.getName() + " " + account2.getName() + " " + account3.getName() + " respectively");
			int accountNo=0;
			while(accountNo<1 || accountNo>3){
				accountNo=input.nextInt();
			}
			switch(accountNo){
				case 1:
					currentAccount=account1;
					break;
				case 2:
					currentAccount=account2;
					break;
				case 3:
					currentAccount=account3;
					break;
			}
			action='a';
			while(action!='s' && action!='q'){
				System.out.println(currentAccount.getName());
				System.out.println("Enter d to deposit funds, w to withdraw,b to check balance,u to update balance, r to rename account,t to find payable tax,i to find interest, q to quit & s to switch accounts");
				action=input.next().charAt(0);
				switch(action){
					case 'd':
						System.out.println("Enter Amount ");
						currentAccount.cashDeposit(input.nextInt());
						break;
					case 'w':
						System.out.println("Enter Amount ");
						int temp=input.nextInt();
						if(temp<=currentAccount.remainingBalance())
							currentAccount.cashWithdrawl(temp);
						break;
					case 'b':
						System.out.println("Your Balance is " + currentAccount.remainingBalance());
						break;
					case 'u':
						System.out.println("Enter Amount ");
						currentAccount.updateBalance();
						break;
					case 'r':
						System.out.println("Enter name ");
						currentAccount.renameAccount(input.next());
						break;
					case 'i':
						System.out.println("Enter rate,amount & time(years)");
						System.out.println(currentAccount.calculateInterest(input.nextInt(),input.nextInt(),input.nextInt()));
						break;
					case 't':
						System.out.println("Enter amount & rate");
						System.out.println(currentAccount.payableTax(input.nextInt(),input.nextInt()));
						break;
				}	
			}
		}while(action!='q');
	}
}