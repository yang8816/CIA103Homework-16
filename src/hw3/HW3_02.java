package hw3;
import java.util.Scanner;

public class HW3_02 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("開始猜數字吧！");
		int answer = (int)(Math.random()*101);		
//		System.out.println("答案: "+answer);
		
		int input;
		while(true)
		{	
			input = sc.nextInt();
			if(input == answer)
			{
				System.out.println("答對了！答案就是"+answer);
				break;
			}
			else if(input > answer)
				System.out.println("太大了");
			else 
				System.out.println("太小了");		
		}			
	}
}

