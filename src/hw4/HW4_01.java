package hw4;

public class HW4_01 
{
	//回傳陣列平均值
	public static double getAvg(int arr[])
	{
		int sum = 0;
		for(int i=0; i < arr.length; i++)
		{
			sum += arr[i];
		}
		return (double) sum / arr.length;
	}
	
	public static void main(String[] args) 
	{	
		int[] x= {29, 100, 39, 41, 50, 8, 66, 77, 95, 15};
		double avg = getAvg(x);
		System.out.println("所有元素的平均值 = "+ avg);
		
		System.out.print("大於平均值的元素：");
		for(int i=0; i < x.length; i++)
		{
			if (x[i] > avg)
				System.out.print(x[i]+" ");
		}
	}
}