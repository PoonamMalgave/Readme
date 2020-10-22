package myPackage;

import java.util.Scanner;

public class Product {
	public String name;
	public int id;
	public String discription;
	public double price;
	Scanner sc = new Scanner (System.in);
	
	Product()
	{
		this.name="";
		this.id=0;
		this.discription="";
		this.price=0.0;
	}
	Product(String name, int id, String discription, double price)
	{
		this.name=name;
		this.id=id;
		this.discription=discription;
		this.price= price;
	}
	Product(String name)
	{
		this(name, 0, "", 0.0);
	}
	Product(int id)
	{
		this("", id, "", 0.0);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDiscription() {
		return discription;
	}
	public void setDiscription(String discription) {
		this.discription = discription;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void addProduct()
	{
		System.out.println("Enter Product name : ");
		this.name= sc.next();
		System.out.println("Enter Product id : ");
		this.id= sc.nextInt();
		System.out.println("Enter Product Discription : ");
		this.discription= sc.next();
		System.out.println("Enter Product Price : ");
		this.price= sc.nextDouble();
	}
}
