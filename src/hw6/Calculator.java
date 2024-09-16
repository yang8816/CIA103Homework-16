package hw6;

public class Calculator 
{
	public Calculator() {}
	
	public int powerXY(int x, int y)throws CalException
	{
		if(y < 0)
			throw new CalException("次方為負值,結果回傳不爲整數！");
		else if(y == 0 && x == 0)
			throw new CalException("0的0次方沒有意義！");
		else 
			return (int)(Math.pow(x, y));		
	}
}