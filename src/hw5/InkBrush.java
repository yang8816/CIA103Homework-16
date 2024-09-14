package hw5;

public class InkBrush extends Pen
{
	public InkBrush()
	{
		super();
	}
	
	public InkBrush(String brand, double price)
	{
		super(brand,price);
	}
	
	@Override
	public double getPrice()
	{
		System.out.print("InkBrush price = ");
		return super.getPrice()*0.9;
	}
	
	@Override
	public void write()
	{
		System.out.println("沾墨汁再寫");
	}
}
