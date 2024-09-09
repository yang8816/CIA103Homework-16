package hw4;

import java.util.Scanner;

public class HW4_04 
{
	public static void main(String[] args) 
	{
		int x[][] = { {2500, 800, 500, 1000, 1200},
					  {25, 32, 8, 19, 27} };
		int count = 0;
		String empno = "";
		Scanner sc = new Scanner(System.in);
		int money = sc.nextInt();
		
		for(int i=0; i<x[0].length; i++)
		{
			if(money < x[0][i])
			{
				count++;
				empno = empno + x[1][i] + " ";
			}
		}
		
		System.out.println("有錢可借的員工編號: " + empno + "共 " + count + " 人！");
	}
}