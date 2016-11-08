import java.util.Scanner;
public class TestBankAccount{
	public static void main(String[]args){
		Scanner input= new Scanner(System.in);
		int accountNo=0;
		char action='a';
		BankAccount account1,account2,account3,currentAccount;

		account1=new BankAccount(1000,"Account1");
		account2=new BankAccount(1000,"Account2");
		account3=new BankAccount(1000,"Account3");
		currentAccount=account1;
		
		while(action!='q'){
			action='a';
			System.out.println("Enter 1,2 & 3 for " + account1.getName() + " " + account2.getName() + " " + account3.getName() + " respectively");
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
			System.out.println(currentAccount.getName());
			System.out.println("Enter d to deposit funds, w to withdraw,b to check balance,u to update balance, r to rename account, q to quit & s to switch accounts");

			while(action!='s' && action!='q'){
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
				}	
			}
		}
	}
}