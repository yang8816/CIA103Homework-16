package hw4;

import java.util.Scanner;

public class HW4_05 
{
	public static void main(String[] args) 
	{
		int count = 0;
		Scanner sc = new Scanner(System.in);
		int[] date = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] x = new int[3];//依序存 年 月 日
		for(int i=0; i<x.length; i++)
		{
			x[i] = sc.nextInt();
		}
		
		if(judgeLeap(x[0]) == -1)
			date[1] = 28;
			
		if(x[1] > 12 || x[1] < 1 || x[2] < 1 || x[2] > date[x[1] - 1] )//判斷有無超過每月最大天數
			System.out.println("日期輸入錯誤！");
		else 
		{
			for(int i=0; i<x[1]-1; i++)
			{
				count+=date[i];
			}
			count+=x[2];
			System.out.println("輸入的日期為該年第" + count + "天");
		}	
	}

	//如果是閏年傳回-1 不然傳回1
	public static int judgeLeap(int year)
	{
		if(year % 4 != 0 )
			return -1;
		else 
		{
			if(year % 100 == 0)
			{
				if(year % 400 == 0)
					return 1;
				else 
					return -1;
			}
			else 
				return 1;
		}
	}
	
}
