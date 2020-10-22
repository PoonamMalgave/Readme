package myPackage;

public class OrderProcessing extends ShoppingCart {
	OrderProcessing o1 = new OrderProcessing();
	ShoppingCart c1= new ShoppingCart();
	
	public ShoppingCart getC1() {
		return c1;
	}
	public void setC1(ShoppingCart c1) {
		this.c1 = c1;
	}
	
	public void ConfirmOreder()
	{
		System.out.println("Your total bill is : " +c1.bill(c1));
		System.out.println("We are processing your order : ");
		System.out.println("Your Order is Confirmed.");
	}
	public void CancelOrder()
	{
		System.out.println("Enter Your Name : ");
		boolean flag= false;
		flag = c1.removeProduct(c1);
		if(flag == true)
			System.out.println("Your oreder is successfully canceled.");
		else
			System.out.println("Sorry! Failed cancelling your order.");
	}
}
