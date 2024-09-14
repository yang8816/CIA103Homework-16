package hw5;

public class TestPen 
{
	public static void main(String[] args)
	{
		Pen[] p = new Pen[2];
		p[0]= new Pencil("pencil1",20);
		p[1]= new InkBrush("inkbrush2",30);
		
		for(int i=0; i<p.length; i++)
		{
			System.out.println("Brand : "+ p[i].getBrand());
			p[i].write();
			System.out.println(p[i].getPrice());
		}	
	}
}
