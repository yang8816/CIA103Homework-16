package hw5;

public class Pencil extends Pen
{
	public Pencil()
	{
		super();
	}
	
	public Pencil(String brand, double price)
	{
		super(brand, price);
	}
	
	@Override
	public double getPrice()
	{
		System.out.print("Pencil price = ");
		return super.getPrice()*0.8;
	}
	
	@Override
	public void write()
	{
		System.out.println("削鉛筆再寫");
	}
}
