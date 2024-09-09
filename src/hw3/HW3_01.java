package hw3;
import java.util.Arrays;
import java.util.Scanner;

public class HW3_01 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int[] x = new int[3];
		System.out.println("請輸入三個整數:");
		
		for(int i = 0; i < x.length; i++)
			x[i]= sc.nextInt();
			
		Arrays.sort(x);
		
		if(x[0]+x[1] <= x[2])
			System.out.println("不是三角形");
		else 
		{
			if(x[0] == x[1])
			{
				if(x[1] == x[2])
					System.out.println("正三角形");
				else 
					System.out.println("等腰三角形");			
			}
			else
			{
				if(Math.pow(x[0],2) + Math.pow(x[1],2) == Math.pow(x[2],2))
					System.out.println("直角三角形");
				else 
					System.out.println("其它三角形");			
			}															
		}
		sc.close();
	}	
}
