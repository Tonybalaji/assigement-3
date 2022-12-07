package Assignment;

public class FindInterSection
{

	public static void main(String[] args)
	{
		int[] lee={1,5,2,4,6,7,};
		int[] tzu={1,2,0,4,9,7};
		for(int i=0;i<=lee.length-1;i++) 
		{
			for(int j=0;j<=tzu.length-1;j++) 
			{
				if(lee[i]==tzu[j])
					System.out.println(lee[i]);
			}
		}

	}

		
		

	}


