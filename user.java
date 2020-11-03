package practice_atm;

import java.util.Arrays;
import java.util.Scanner;

public class user {
	private int accountNo;
	private int[] birthdate = new int [3];
	private String phoneNo;
	private String address;
	private boolean flag;
	private boolean ageFlag;
	private boolean dateFlag;
	Scanner sc = new Scanner (System.in);
	
	user()
	{
		for(int i=0; i<this.birthdate.length; i++)
			this.birthdate[i] = 0;
		this.phoneNo = "NA";
		this.address ="NA";
		this.ageFlag= false;
		this.flag = false;
		this.dateFlag = false;
	}
	user(int[] birthdate, String phoneNo, String address)
	{
		for(int i=0; i<birthdate.length; i++)
			this.birthdate[i] = birthdate[i];
		this.phoneNo = phoneNo;
		this.address = address;
		this.ageFlag= false;
		this.flag = false;
		this.dateFlag = false;
	}
	
	public boolean addUserData(int accountNo1)
	{
		this.accountNo = accountNo1;
		System.out.println("Enter your birthdate : ");
		for(int i=0; i<birthdate.length; i++)
			this.birthdate[i] = sc.nextInt();
		validateDate();
		checkAge();
		if(this.dateFlag == false  && this.ageFlag == true )
		{
			System.out.println("Enter your phone no : ");
			this.phoneNo = sc.next();
			System.out.println("Enter your address : ");
			this.address = sc.next();
			this.flag = true;
			return flag;
		}
		else {
			this.flag = false;
			return flag;}
	}
	public boolean delUserData(int accountNo)
	{
		if(this.accountNo == accountNo)
		{
			this.birthdate = null;
			this.address = null;
			this.phoneNo = null;
			this.flag = false;
			return flag;
		}
		else
		{
			this.flag = true;
			return flag;
		}
	}
	public String showUser()
	{
		String temp = Arrays.toString(getBirthdate());
		return ("Birthdate :\t\t"+temp+"\nAddress :\t\t"+this.address+"\nPhone No :\t\t"+this.phoneNo);
	}
	
	private void validateDate()
	{
		if(this.birthdate[0] >= 32 || this.birthdate[0] == 0) {
			System.out.println("Invalid date.");
			this.dateFlag = true;}
		else if(this.birthdate[1] >= 13 || this.birthdate[1] == 0) {
			System.out.println("Invalid date.");
			this.dateFlag = true;}
		else if(this.birthdate[2] >= 2021 || this.birthdate[2] == 0) {
			System.out.println("Invalid date.");
			this.dateFlag = true;}
		else
			this.dateFlag = false;
		
		//month wise verification is not done yet............................
	}
	
	private void checkAge()
	{
		int day = 3;
		int month = 11;
		int year = 2020;
		int valYear, valMonth, valDay;
		valYear = year - this.birthdate[2];
		valMonth = month - this.birthdate[1];
		valDay = day - this.birthdate[0];
		if (valYear > 18)
		{
			ageFlag = true;
		}
		else if(valYear == 18 || valYear > 17)
		{
			if(valMonth >= 0)
			{
				if(valDay >= 0)
				ageFlag = true;
			}
		}
		else
			ageFlag = false;

		if(ageFlag != true)
			System.out.println("You are not eligible.");
		
		//Age of customer should be at least 18 years or more than that.
	}
	
	public int[] getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(int[] birthdate) {
		this.birthdate = birthdate;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAccountNo() {
		return accountNo;
	}
	
}
