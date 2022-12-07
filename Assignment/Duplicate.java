package Assignment;

public class Duplicate
{

	public static void main(String[] args)
	{
		
		int[] a = {5,7,9,1,2,4,8,4,3};
		

		for(int i=0;i<a.length;i++)
		{
		
		for(int j=i+1;j<a.length;j++)
		 {
			if(a[i]==a[j])
			{
			System.out.println(a[i]);
		    }
		 }
		}
			
	}

	}


