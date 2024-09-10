/* 
 * 做法:	1.亂數決定驗證碼會有幾個數字、字母
 *		2.再亂數產生 0~9數字 與 大小寫英文ASCII code 存入陣列
 *		3.再隨機取出陣列中的内容
*/
package hw5;
import hw3.HW3_03;

public class HW5_05 
{
	public static void genAuthCode()
	{
		//亂數決定有幾個數字
		int num = (int)(Math.random()*9);
		System.out.println("驗證碼中數字個數 = " + num);
			
		int[] code = new int[8];
		//將隨機產生的數字存入陣列
		for(int i=0; i<num; i++)
			code[i] = (int)(Math.random()*10);
		
		//將隨機產生的字母的ASCII code存入陣列
		//範圍A~Z:65-90 a~z:97-122
		for(int i=num; i<code.length; i++)
		{	
			int letter = (int)(Math.random()*58)+65; 
			if(letter > 90 && letter < 97)
			{	i--;
				continue;
			}
			code[i] = letter;
		}
		//查看驗證碼的内容爲何
		//再將它們隨機排列印出
		System.out.print("驗證碼内容:");
		for(int i=0; i<code.length; i++)
			System.out.print(code[i] + " ");
		System.out.println();
		
		//使用作業3 第三題的Static方法
		//傳回8個 範圍在0~7的隨機不重複數字
		int[] index = HW3_03.getNoRepeat(8,8);
		
		System.out.println("本次隨機產生驗證碼為: ");
		//index陣列内容即爲驗證碼印出順序
		for(int i=0; i<7; i++)
		{
			if(code[index[i]] > 9)
				System.out.print((char)code[index[i]]);
			else 
				System.out.print(code[index[i]]);
		}
	}
	
	public static void main(String[] args)
	{
		genAuthCode(); 
	}
}