package hw7;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public abstract class HW7_05 
{	
	public static void main(String[] args) throws Exception
	{
		FileInputStream fis = new FileInputStream("c:/data/Object.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		try {
			while(true)
			{
				((Animal) ois.readObject()).speak();
			}
		} catch  (EOFException e) {
			System.out.println("資料讀取完畢！");
		} 
		ois.close();
		fis.close();
	}
}
