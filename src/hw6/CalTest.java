package hw6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalTest 
{
	public static void main(String[] args) 
	{
		Calculator c = new Calculator();
		Scanner sc = new Scanner(System.in);	
		boolean check = true;
		 
		do {
			try {
				System.out.println("請輸入x的值: ");
				int x = sc.nextInt();
				System.out.println("請輸入y的值: ");
				int y = sc.nextInt();
				System.out.println(x+"的"+y+"次方等於"+c.powerXY(x, y));
				check = false;
			} catch (CalException e) {
				System.out.println(e.getMessage());
			} catch (InputMismatchException e) {
				System.out.println("輸入格式不正確");
				sc.next();
			}
		}while(check);
		
	}
}