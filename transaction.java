package practice_atm;

import java.util.Scanner;

public class transaction {
	private int addMoney;
	private int withdraw;
	private int balance;
	private double savInterest;
	private double curInterest;
	private static boolean flagW;
	private static boolean flagA;
	private static int count;

	private int[] deducted = new int[10];
	private int[] added = new int[10];
	private int[] balanceLeft = new int[10];
	Scanner sc = new Scanner (System.in);
	
	transaction()
	{
		this.addMoney = 0;
		this.withdraw = 0;
		this.balance = 0;
		
	}
	transaction(int addMoney, int withdraw, int balance )
	{
		this.addMoney = addMoney;
		this.withdraw = withdraw;
		this.balance = balance;
	}
	static
	{
		flagW = false; 
		flagA = false;
		count = 0;
	}
	
	public void addMoney()
	{
		System.out.println("Adding money in your account...");
		System.out.println("Enter ammount : ");
		this.addMoney = sc.nextInt();
		this.balance += this.addMoney;
		System.out.println("Your account balance is : "+this.balance);
		flagA = true;
		caltransaction();
	}
	
	public void withdraw()
	{
		System.out.println("Withdrawing...");
		System.out.println("Enter ammount : ");
		this.withdraw = sc.nextInt();
		this.balance -= this.withdraw;
		flagW = true;
		minBalance();
		System.out.println("Your account balance is : "+this.balance);
		caltransaction();
	}
	
	public double calInterest(String accountType)
	{
		if (accountType.equals("Saving") || accountType.equals("saving") || accountType.equals("s"))
		{
			this.savInterest += (this.balance * 0.03);
			return this.savInterest;
		}
		else
		{
			this.curInterest += (this.balance * 0.05);
			return this.curInterest;
		}
	}
	
	private void caltransaction()
	{
		if(flagW == true)
		{
			deducted[count] = this.withdraw;
			balanceLeft[count] = this.balance;
			count++;
			flagW = false;
		}

		if(flagA == true)
		{
			added[count]= this.addMoney;
			balanceLeft[count] = this.balance;
			count++;
			flagA = false;
		}
	}
	public void checkWithdrawals()
	{
		System.out.println("\nSR.No."+"\tTransaction"+"\tBalance");
		for(int i=0; i<count; i++)
		{
			if(deducted[i] != 0)
				System.out.println("\n"+i+"\t- "+deducted[i]+"\t\t: "+balanceLeft[i]);
			if(added[i] != 0)
				System.out.println("\n"+i+"\t+ "+added[i]+"\t\t: "+balanceLeft[i]);
		}	
	}
	private void minBalance()
	{
		if(this.balance <= 201)
		{
			System.out.println("Insufficient balance.");
			flagW = false;
			this.balance += this.withdraw;
		}
	}
	
	public int getAddMoney() {
		return addMoney;
	}
	public void setAddMoney(int addMoney) {
		this.addMoney = addMoney;
	}
	public int getWithdraw() {
		return withdraw;
	}
	public void setWithdraw(int withdraw) {
		this.withdraw = withdraw;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
}
