package hw2;

public class HomeWork2 
{
	public static void main(String args[])
	{
//1.題目一
		int sum1=0;
		for(int i=1; i<=1000; i++)
		{
			if(i%2 == 0)
			sum1 += i; 
		}
		System.out.println(sum1+"\n");
		
//2.題目二
		int sum2=1;
		for(int i=1; i<=10; i++)
		{
			sum2 *= i;
		}
		System.out.println(sum2+"\n");
				
//3.題目三
		int sum3=1,i=1;
		while(i<=10)
		{
			sum3 *= i;
			i++;
		}
		System.out.println(sum3+"\n");

//4.題目四
		for(int j=1; j<=10; j++)
			System.out.print(j*j+" ");
		System.out.println("\n");
		
		
//5.題目五
		int count=0;
		for(int j=1; j<=49; j++)
		{
			if(j==4 || j%10==4 || j/10==4)
				continue;
			System.out.print(j+" ");
			count++;
		}
		System.out.println();
		System.out.println("總共有："+count+"個"+"\n");
		
//6.題目六	
		for(int j=10; j>=1; j--)
		{
			int z=1;
			while(z<=j)
				{
					System.out.print(z+" ");
					z++;
				}
			System.out.println();
		}
		System.out.println();
		
//7.題目七
		char z='A';
		for(int j=0; j<=5; j++)
		{
			int k=0;
			while(k<=j)
				{
					System.out.print((char)(z+j));
					k++;
				}
			System.out.println();
		}
		System.out.println();
			
//8.for + do while
		for(int o=1; o<=9; o++)
		{
			int j=1;
			do{
			System.out.print(o+"*"+j+"="+o*j+"\t");
			j++;		
			}while(j<10);
			System.out.println();
		}
		System.out.println();
		
//9.while + do while
		int p=1;
		while(p<10)
		{
			int j=1;
			do{
			System.out.print(p+"*"+j+"="+p*j+"\t");
			j++;		
			}while(j<10);
			System.out.println();
			p++;
		}	
	}	
}
