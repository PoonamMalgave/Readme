package practice_atm;

public class bank {
	private String branchName;
	private static int noOfAccounts;
	private String ifsc;
	
	bank()
	{
		this.branchName = "SME";
		this.ifsc = "SBI1432";
	}
	static
	{
		noOfAccounts = 0;
	}
	
	public String showBankDetails()
	{
		return "\nIFSC code :\t\t"+this.ifsc+"\nBranch name :\t\t"+this.branchName+"\n";
	}
	
	public void updateaccounts(boolean flag)
	{
		if(flag == true)
			noOfAccounts++;
		else
			noOfAccounts--;
	}
	public static void showMenu()
	{
		System.out.println("Welcome to SBI.");
		System.out.println("Here's your menu : ");
		System.out.println("\n1.Create new account "
				+ "\n2.Use ATM "
				+ "\n3.Account Settings "
				+ "\n4.Exit");	
		System.out.println("......................................................................................................................");
	}
	
	public static void showAtmMenu()
	{
		System.out.println("\n1.Check balance "
				+ "\n2.Add money"
				+ "\n3.Withdraw"
				+ "\n4.CalInterest"
				+ "\n5.Last withdrawals ");
	}
	public static void showAccountMenu()
	{
		System.out.println("\n1.Check account info"
				+ "\n2.Change passwd"
				+ "\n3.Delete account ");
	}
}
//ATM - check balance, add money, withdraw, calInterest, last withdrawals
//Account settings - change passwd, delete account, check account info
//