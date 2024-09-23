package hw7;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

public class HW7_03 
{
	public static void copyFile(File src,File des)throws IOException
	{
		
		BufferedReader br = new BufferedReader(new FileReader(src));

		BufferedWriter bw = new BufferedWriter(new FileWriter(des));
		String data = "";

		while( (data = br.readLine()) != null )
		{
			if(data == "\n")
				System.out.println();
			bw.write(data);
		}
		
		bw.close();
		br.close();
	}
	
	public static void main(String[] args)
	{
		try {
			HW7_03.copyFile(new File("src/hw7/Sample.txt"), new File("src/hw7/des.txt"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
