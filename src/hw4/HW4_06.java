package hw4;

public class HW4_06
{
	public static void main(String[] args) 
	{
		int[][] x = { {10,  35, 40,  100, 90, 85, 75, 70},
					  {37,  75, 77,  89,  64, 75, 70, 95},
					  {100, 70, 79,  90,  75, 70, 79, 90},
					  {77,  95, 70,  89,  60, 75, 85, 89},
					  {98,  70, 89,  90,  75, 90, 89, 90},
					  {90,  80, 100, 75,  50, 20, 99, 75} };
		
		int count[] = new int[8];//存每個人最高分次數
		
		for(int i=0; i<x.length; i++)
		{
			int max = x[i][0] , index = 0;
			//存每次最高分的值，且存其索引
			for(int j=0; j<x[i].length; j++)
			{
				if(x[i][j] > max)
				{
					max = x[i][j];
					index = j;
				}
			}
			count[index]++;
		}
	
		for(int i=0; i<count.length; i++)
			System.out.println(i+1 + "號最高分次數: " + count[i]+" ");
	}
}
