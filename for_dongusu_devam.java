package ilkdeneme1;
import java.util.Scanner;
public class for_dongusu_devam {
	public static void main (String[] args)
	{
		Scanner input = new Scanner(System.in);
		int Ssayisi;
		System.out.println("l�ten bir say� giriniz");
		Ssayisi = input.nextInt();
		while(Ssayisi<1 || Ssayisi>99)
		{
			System.out.println("l�tfen pozitif 1 veya 2 basamakl� tam say� girdi�inizden emin olun!");
			System.out.println("l�ten bir say� giriniz");
			Ssayisi = input.nextInt();
			
		}
		for(int i = 1;i<=Ssayisi;i++)
		{
			for(int k=0;k<Ssayisi-i;k++)
			{
				System.out.print(" ");
			}
			for(int m =0;m<2*i-1;m++)
			{
			       System.out.print("*");	
			}
			System.out.println();
		}
		for (int i = Ssayisi-1;i>0;i--)
		{
			for(int k=0;k<Ssayisi-i;k++)
			{
				System.out.print(" ");
			}
			for(int m =0;m<2*i-1;m++)
			{
			       System.out.print("*");	
			}
			System.out.println();
	}
	}
}
