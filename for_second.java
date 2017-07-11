package ilkdeneme1;

public class for_second {
	public static void main (String[] args)
	{
		int i=1, faktoriyel=1;
		
		while(i<=5)
		{
			faktoriyel = faktoriyel*i;
			i++;		
		}				
	
		System.out.println("5! = " + faktoriyel);
		faktoriyel = 1;
		for(int k=1;k<=5;k++)
				{
			faktoriyel = faktoriyel*k;
				}
		System.out.println("5! = " + faktoriyel);
	}

}
