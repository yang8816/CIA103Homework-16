package hw5;

import java.util.Scanner;

public class HW5_01 
{
	public static void starSquare(int width, int height)
	{
		for(int i=0; i<height; i++)
		{	for(int j=0; j<width; j++)
				System.out.print("*");
			System.out.println();
		}
	}
	
	public static void main(String[] args)
	{	
		Scanner sc = new Scanner(System.in);
		int width = 0,height = 0;
		if(sc.hasNextInt())
		{
			width = sc.nextInt();
			height = sc.nextInt();
			starSquare(width,height);
		}
		else 
			System.out.println("請重新輸入");
	}	
}
