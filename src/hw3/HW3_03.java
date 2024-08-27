package hw3;
import java.util.Scanner;

public class HW3_03 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("輸入啦...阿文：");
		int input = sc.nextInt();
		int count = 0;
		for(int i=1; i<=49; i++)
		{
			if(i==input || i%10==input || i/10==input)
				continue;
			
			count++;
			System.out.print(i+" "+"\t");
			if(count%6 == 0)
				System.out.println();
		}
		System.out.println();
		System.out.println("總共："+count);
		
		
//進階挑戰		
		
//	int[] x = new int[44];//1~4 有35個數字 5~9有44個數字
//   	int count0 = 0;
//		System.out.println("輸入啦...阿文：");
//		int input0 = sc.nextInt();
//		
//		//存入符合條件數字
//		for(int i=1; i<=49; i++)
//		{
//			if(i==input0 || i%10==input0 || i/10==input0)
//				continue;	
//			x[count0]=i;
//			count0++;
//		}
//	
//		if(input0 < 5)
//		{
//			int[] y = getNoRepeat(35);
//			for(int i=0; i<6; i++)
//				System.out.print(x[y[i]]+" ");
//		}
//		else 
//		{
//			int[] y = getNoRepeat(44);
//			for(int i=0; i<6; i++)
//				System.out.print(x[y[i]]+" ");
//		}
	}
	
	//隨機產生6個不重複數字
//	public static int[] getNoRepeat(int r)
//	{
//		int[] y = new int[6];
//		for(int j=0; j<6; j++)			
//		{
//			y[j] = (int)(Math.random()*r);
//			for(int k=0; k<j; k++)
//			{
//				if(y[j] == y[k])
//				{	
//					j--;
//					break;
//				}
//			}				
//		}	
//		return y;
//	}
}