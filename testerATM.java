package practice_atm;

import java.util.Scanner;

public class testerATM {
	
		static Scanner sc = new Scanner (System.in);
		static boolean flag = false;
		
		accounts a[] = new accounts[5];
		//month wise birth Date validation is possible
		//Phone no shouldn't be greater than 10 digits
		//There should be login provision for bank officials to check in and out and no of accounts
		//Display should be more properly arranged.
		//Change passwd
		
		void createAcc()
		{	
			int addEmp = 0;
			String wish;
			do {
					a[addEmp] = new accounts();	
					a[addEmp].createAccount();
					addEmp++;
					System.out.println("Do you want to create new account? (y/n) :");
					wish  = sc.next();
				}while(wish.equals("y") || wish.equals("Y"));
		}
		
		int validate()
		{
			System.out.println("Enter account no : ");
			int accNo = sc.nextInt();
			System.out.println("Enter Your Password : ");
			int passwd = sc.nextInt();
			for(int i=0; i<a.length; i++)
			{
				if(a[i].getAccountNo() == accNo)
				{
					int j = i;
					if(a[j].getPasswd() == passwd)
					{
						flag = true;
						System.out.println("Login Successful.");
						System.out.println("........................................................................................");
						return j;
					}
					else {
						System.out.println("Incorrect Password.");
						System.exit(1);}
				}
				else {
					System.out.println("Incorrect login info.");
					flag = false;
					System.exit(1);}
			}
			return 100;
		}
		
		void balancecheck()
		{
			int i = validate();
			if (flag == true)
			{
				System.out.println("Your account balance is : "); 
				a[i].checkBalance();
			}
		}
		
		void delAcc()
		{
			int i = validate();
			if (flag == true)
			{
				a[i].deleteAccount(a[i].getAccountNo());
			}
		}
		
		void addMoney()
		{
			int i = validate();
			if (flag == true)
			{
				a[i].addMoney();
			}
		}
		
		void withdraw()
		{
			int i = validate();
			if (flag == true)
			{
				a[i].withdraw();
			}
		}
		
		void calInterest()
		{
			int i = validate();
			if (flag == true)
			{
				System.out.println("Todays Interest : ");
				a[i].calInterest();
			}
		}
		
		void showDetails()
		{
			int i = validate();
			if (flag == true)
			{
				a[i].showdetails();
			}
		}
		
		void changePasswd()
		{
			int i = validate();
			if (flag == true)
			{
				System.out.println("Enter new password : ");
				int newPasswd = sc.nextInt();
				a[i].setPasswd(newPasswd);
			}
		}
		
		void transactions()
		{
			int i = validate();
			if (flag == true)
			{
				a[i].checkTransaction();
			}
		}
		
	public static void main(String[] args) {
		
		testerATM t1 = new testerATM();
		bank.showMenu();
		int choice;
		boolean myFlag = false;
		
		while(myFlag == false)
		{
			System.out.println("\nEnter your Main menu choice :");
			choice = sc.nextInt();
			
		switch(choice)
		{
		case 1: t1.createAcc();
				break;
		case 2: {
			  	bank.showAtmMenu();
				System.out.println("Enter your sub choice :");
				int atmChoice = sc.nextInt();
				switch(atmChoice)
				{
				case 1:t1.balancecheck();
						break;
				case 2:t1.addMoney();
						break;
				case 3:t1.withdraw();
						break;
				case 4:t1.calInterest();
						break;
				case 5:t1.transactions();
						break;
				default : System.exit(1);
				}
			 	break;
				}
		
		case 3: {
				bank.showAccountMenu();
				System.out.println("Enter your sub choice :");
				int accChoice = sc.nextInt();
				switch(accChoice)
				{
				case 1:t1.showDetails();
						break;
				case 2:t1.changePasswd();
						break;
				case 3:t1.delAcc();
						break;
				default : System.exit(1);
				}		
				break;
				}		
		case 4: System.exit(0);
				break;
		default: System.out.println("Invalid Input!");
				myFlag = true;
		 		System.exit(1);
		}
		}
		System.out.println("Task Complete.");
		sc.close();
	}

}