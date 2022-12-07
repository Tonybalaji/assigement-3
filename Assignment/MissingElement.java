package Assignment;

public class MissingElement {

	public static void main(String[] args) 
	{
		
		int[] meow = {1,2,3,4,5,7,8,9,10};
		
		
		for (int i = 0; i < meow.length; i++) 
		{
			if (meow[i]!=i+1)
			{
				System.out.println(meow[i]-1);
				break;
			}
		}
	}
		

	}


