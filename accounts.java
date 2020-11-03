package practice_atm;

import java.util.Scanner;

public class accounts {
	private String name;
	private int accountNo;
	private int passwd;
	private String accountType;
	private static int count;
	
	
	Scanner sc = new Scanner(System.in);
	bank b1 = new bank();
	user u = new user();
	transaction t1 = new transaction();
	
	accounts()
	{
		this.name ="NA";
		accountNo = count;
		this.passwd = 0000;
		this.accountType = "NA";
	}
	accounts(String name,int passwd, String accountType)
	{
		this.name= name;
		this.passwd = passwd;
		accountNo = count;
		this.accountType = accountType;
	}
	static
	{
		count = 100;
	}

	public void createAccount()
	{
		count++;
		System.out.println("Enter your name : ");
		this.name = sc.next();
		System.out.println("Enter account type you want to create : ");
		this.accountType = sc.next();
		System.out.println("Create new Password : ");
		this.passwd = sc.nextInt();
		boolean userFlag = u.addUserData(accountNo);
		if (userFlag == true)
		{
			System.out.println("Your Account is created successfully.");
			System.out.println("Your Account no is : "+ getAccountNo() +"\n");
		}
		System.out.println("Do you want to addMoney in your Account?");
		String wish = sc.next();
		if(wish.equals("y") || wish.equals("Y"))
			t1.addMoney();
		else
			t1.setBalance(0);
		System.out.println("........................................................................................");
		boolean bankFlag = true;
		b1.updateaccounts(bankFlag);
	}
	
	public void deleteAccount(int accountNo1)
	{
		this.name = "NA";
		this.accountType = "NA";
		this.accountNo = 0;
		
		boolean userFlag = u.delUserData(accountNo1 );
		if (userFlag == false)
			System.out.println("Your Account has been deleted successfully.");
		boolean bankFlag = false;
		b1.updateaccounts(bankFlag);
	}
	
	public void showdetails()
	{
		System.out.println("\nShowing Account details : ");
		System.out.println("Name :\t\t\t"+this.name);
		System.out.println("Account No :\t\t"+this.accountNo);
		System.out.println("Account Type :\t\t"+this.accountType);
		System.out.println("Password :\t\t****");
		System.out.print(u.showUser()+b1.showBankDetails()+"Account Balance :\t"+t1.getBalance()+"\n");
	}
	
	public void addMoney()
	{
		t1.addMoney();
	}
	public void withdraw()
	{
		t1.withdraw();
	}
	public void checkBalance()
	{
		System.out.println(t1.getBalance());
	}
	public void calInterest()
	{
		System.out.println(t1.calInterest(this.accountType));
	}
	public void checkTransaction()
	{
		t1.checkWithdrawals();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public int getPasswd() {
		return passwd;
	}
	public void setPasswd(int passwd) {
		this.passwd = passwd;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	
}
