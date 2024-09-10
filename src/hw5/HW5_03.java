package hw5;

public class HW5_03 
{
	public int maxElement(int[][] arr)
	{
		int max = arr[0][0];
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				if(arr[i][j] > max)
					max = arr[i][j];
			}
		}
		return max;
	}
	
	public double maxElement(double[][] arr)
	{
		double max = arr[0][0];
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				if(arr[i][j] > max)
					max = arr[i][j];
			}
		}
		return max;
	}
	
	public static void main(String[] args) 
	{
		int[][] intArray = { {1, 2, 3},
							 {1, 0, 5},
							 {9, 100, 66, 99} };
		
		double[][] doubleArray = {  {1.2, 2.5, 3.6},
									{1.5, 33.6, 5.9},
									{99.8, 33.9, 66.8} };
		
		HW5_03 h = new HW5_03();
		System.out.println(h.maxElement(intArray));
		System.out.println(h.maxElement(doubleArray));
	}
	
}