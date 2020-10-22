package myPackage;

import java.util.Scanner;

public class Customer {
	private String name;
	private String emailId;
	private int phoneNo;
	private String address;
	Scanner sc = new Scanner (System.in);
	
	Customer()
	{
		this.name= "";
		this.emailId= "";
		this.phoneNo= 0;
		this.address= "";
	}
	Customer(String name, String emailId, int phoneNo, String address)
	{
		this.name= name;
		this.emailId= emailId;
		this.phoneNo= phoneNo;
		this.address= address;
	}
	Customer(String name)
	{
		this(name, "", 0, "");
	}
	Customer(int phoneNo)
	{
		this("", "", phoneNo, "");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public int getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void RegisterNewCustomer()
	{
		System.out.println("Enter ypur name :");
		this.name= sc.nextLine();
		System.out.println("Enter your Email Id : ");
		this.emailId= sc.nextLine();
		System.out.println("Enter your Contatct No : ");
		this.phoneNo= sc.nextInt();
		System.out.println("Enter your address : ");
		this.address= sc.nextLine();
	}
	
	public void Notify()
	{
		System.out.println("Thank You"+this.name+" For Joining With OSA. "
				+ "Happy Shopping!");
	}
}
