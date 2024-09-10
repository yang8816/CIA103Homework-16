package hw5;

public class MyRectangleMain
{
	public static void main(String[] args) 
	{
		MyRectangle m1 = new MyRectangle();
		m1.setWidth(10);
		m1.setDepth(20);
		System.out.println("面積爲: " + m1.getArea());
		
		MyRectangle m2 = new MyRectangle(10,20);
		System.out.println("面積爲: " + m2.getArea());
	}
}