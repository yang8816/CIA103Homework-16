package hw7;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class HW7_04 
{
	public static void main(String[] args) throws IOException
	{
		File folder = new File("C:/data");
		File f = new File(folder,"Object.ser");
		if(!folder.exists())
		{
			folder.mkdir();
		}
		
		Object[] obj = new Object[4];
		obj[0] = new Cat("cat1");
		obj[1] = new Cat("cat2");
		obj[2] = new Dog("dog1");
		obj[3] = new Dog("dog2");
		
		FileOutputStream fos = new FileOutputStream(f);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		for(int i=0; i<obj.length; i++)
		{
			oos.writeObject(obj[i]);
		}
		oos.close();
		fos.close();
	}
}
