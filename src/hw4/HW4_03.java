package hw4;

public class HW4_03 
{
	public static void main(String[] args) 
	{	
		String[] planet = {"mercury", "venus", "earth", "mars", 
						   "jupiter", "saturn", "uranus", "neptune"};
		int count = 0;
		
		for(int i=0; i<planet.length; i++)
		{
			for(int j=0; j<planet[i].length(); j++)
			{
				switch(planet[i].charAt(j))
				{
					case 'a':
					case 'e':
					case 'i':
					case 'o':
					case 'u':
						count++;
						break;
						default: 
				}				
			}
		}
		System.out.println("陣列總共有"+count+"個母音");
		
	}
}
