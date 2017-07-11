package ilkdeneme1;
import java.util.Scanner;
public class while_devam {
	public static void main (String[] args )
	   {
		Scanner input = new Scanner(System.in);
		int sayi1, toplam=0, count=0;
		double ortalama;
		while(count<5)
		{
			System.out.println("bir tam sayý giriniz");
			sayi1 = input.nextInt();
			toplam +=sayi1;/// toplam = toplam+sayý
			count++;	
			while(sayi1<1 || sayi1>10)
			{
				System.out.println("lütfen rasyonel sayý giriniz");
				sayi1 = input.nextInt();
				
			}
			while(count<5)
			{
				System.out.println("bir tam sayý giriniz");
				sayi1 = input.nextInt();
				toplam +=sayi1;/// toplam = toplam+sayý
				count++;	
			}
			
			
		}
		ortalama = toplam/count;
		System.out.println("ortalama =" + ortalama);		
	   }
}
