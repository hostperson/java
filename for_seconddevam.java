package ilkdeneme1;
import java.util.Scanner;
public class for_seconddevam
{
	public static void main (String[] args)
	{
		int i=1, faktoriyel=1,secim;
		Scanner input = new Scanner(System.in);
		secim = input.nextInt();
		System.out.println("lütfen bir rakam giriniz");
		while(i<10)
		{
			faktoriyel= faktoriyel*i;
			i++;		
		}				
				System.out.println("10! = " +faktoriyel);			
	}

}
