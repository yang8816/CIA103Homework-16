package hw4;

public class HW4_01 
{
	public static void main(String[] args) 
	{
		int sum = 0;
		double avg = 0;
		int[] x= {29, 100, 39, 41, 50, 8, 66, 77, 95, 15};
		
		for(int i=0; i < x.length; i++)
		{
			sum += x[i];
		}
		avg = (double) sum / x.length;
		System.out.println("所有元素的平均值 = "+avg);
		
		System.out.print("大於平均值的元素：");
		for(int i=0; i < x.length; i++)
		{
			if (x[i] > avg)
				System.out.print(x[i]+" ");
		}
	}
}