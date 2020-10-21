package myPackage;

public class OrderProcessing extends ShoppingCart {
	OrderProcessing o1 = new OrderProcessing();
	ShoppingCart c1= new ShoppingCart();
	
	OrderProcessing()
	{
		c1.bill();
	}

	public ShoppingCart getC1() {
		return c1;
	}
	public void setC1(ShoppingCart c1) {
		this.c1 = c1;
	}
	
	
}
