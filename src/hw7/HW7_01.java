package hw7;

import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class HW7_01 
{
	public static void main(String[] args) throws IOException
	{
		File f = new File("src/hw7/Sample.txt");
		
		if(f.exists())
		{
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			
			String data = "";
			int charcounter = 0 ,linecounter = 0;
			
			System.out.print("Sample.txt檔案共有");
			System.out.print(f.length() + "個位元組,");
			
			while((data = br.readLine()) != null)
			{
				charcounter += data.length();
				linecounter++;
			}
			System.out.print(charcounter + "個字元,");
			System.out.print(linecounter + "列資料");
			
			br.close();
			fr.close();
		}
		else 
			System.out.println("檔案不存在");
	}
		
}