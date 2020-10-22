package myPackage;

public class ShoppingCart extends Product {
	private int quantity;
	private double totalBill;
	ShoppingCart c1 = new ShoppingCart();
	
	ShoppingCart()
	{
		c1.id= 0;
		c1.name= "";
		this.quantity= 0;
		this.totalBill= 0;
	}
	ShoppingCart(int id, String name, int quantity, double totalBill)
	{
		this.c1.id= id;
		this.c1.name= name;
		this.quantity= quantity;
		this.totalBill= totalBill;
	}
	
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public void addProduct()
	{
		System.out.println("Enter product name : ");
		this.c1.name= sc.nextLine();
		System.out.println("Enter product Id : ");
		this.c1.id= sc.nextInt();
		System.out.println("Your "+c1.name+" is successfully added in your cart.");
	}
	public boolean removeProduct(ShoppingCart c1)
	{
		System.out.println("Enter product name : ");
		this.c1.name= sc.nextLine();
		System.out.println("Enter product Id : ");
		this.c1.id= sc.nextInt();
		System.out.println("Your "+c1.name+" is successfully removed from your cart.");
		return true;
	}
	public double bill(ShoppingCart c1)
	{
		this.totalBill= this.quantity*c1.price;
		return (this.totalBill);
	}
	public void billing()
	{
		this.totalBill= this.quantity*c1.price;
		System.out.println("Your total bill is : "+this.totalBill);
	}
}
