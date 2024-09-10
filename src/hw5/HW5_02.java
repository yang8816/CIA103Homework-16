package hw5;

import hw4.HW4_01;

public class HW5_02 
{
	public static void randAvg()
	{
		int[] randNum = new int[10];
		for(int i=0; i<10; i++)
		{
			randNum[i] = (int)(Math.random()*101);
			System.out.print(randNum[i] + " ");
		}
		//使用HW4第一題中的Static方法 傳回陣列平均值	
		System.out.println();
		System.out.println("平均爲: " + HW4_01.getAvg(randNum));
	}
	
	public static void main(String[] args) 
	{
		randAvg();
	}
}
