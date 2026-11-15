package weeklyassignment6;

class BankAccount 
{
	String accountHolder;
	double balance;
	BankAccount(String accountHolder , double balance)
	{
		this.accountHolder=accountHolder;
		this.balance=balance;
	}
	
	void withdraw(double amount)
	{
		try
		{
			System.out.println("Account Holder: " + accountHolder);
            System.out.println("Current Balance: " + balance);
            System.out.println("Withdrawal Amount: " + amount);

            if (amount < 0) {
            	throw new Exception("Invalid amount!");
            }

            if (amount > balance) {
            	throw new Exception("Insufficient balance!");
            }

            balance = balance - amount;

            System.out.println("Remaining Balance: " + balance);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			System.out.println("Transaction process completed.");
		}
	}
}

public class ExceptionHandling_Bank_Account_Withdrawl {

	public static void main(String[] args) {
		BankAccount acc = new BankAccount("Rahul" , 10000);
		acc.withdraw(3000);
		System.out.println();
		acc.withdraw(15000);

	}

}
