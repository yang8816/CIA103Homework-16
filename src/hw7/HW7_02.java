package hw7;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class HW7_02 
{
	public static void main(String[] args) throws IOException
	{
		File f = new File("src/hw7/Data.txt");
		FileOutputStream fos = new FileOutputStream(f,true);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		PrintStream ps = new PrintStream(bos);
		for(int i=0; i<10; i++)
		{
			int num = (int)(Math.random()*1000) + 1;
			ps.print(num + "\t");
		}
		ps.println("");
		ps.close();
		bos.close();
		fos.close();
	}
}
