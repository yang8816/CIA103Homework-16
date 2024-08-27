package hw1;

public class HomeWork1
{
	public static void main(String args[])
	{
//1.題目一
		int a=12,b=6,c=a+b,d=a*b;
			System.out.println("12+6="+c);
			System.out.println("12*6="+d);
			System.out.println();
		
//2.題目二		
		int egg=200;
			System.out.println("200顆蛋有"+egg/12+"打"+egg%12+"顆");
			System.out.println();
		
//3.題目三		
		int time=256559,day=time/86400,
			hour=time%86400/3600,
			minute=time%86400%3600/60,
			second=time%86400%3600%60;	
			System.out.println(day+"天"+hour+"小時"+minute+"分"+second+"秒");
			System.out.println();

//4.題目四	
		final double pi=3.1415;
		int r=5;
				System.out.println("圓面積="+pi*r*r);
				System.out.println("圓周長="+pi*2*r);
				System.out.println();
//5.題目五				
		double money10=150*Math.pow((1+0.02),10);				
				System.out.println("10年後有"+money10+"萬");
				System.out.println();
	
//6.題目六		
		System.out.println(5+5);
		//這裏是數值相加
		System.out.println(5+'5');
		/*
	     因爲'5'的Unicode編碼為0035且為十六進制
	     轉爲十進制為55 所以相加為58
		*/
		System.out.println(5+"5");
		//這裏是字串連接
	}
}
