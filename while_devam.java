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
			System.out.println("bir tam say� giriniz");
			sayi1 = input.nextInt();
			toplam +=sayi1;/// toplam = toplam+say�
			count++;	
			while(sayi1<1 || sayi1>10)
			{
				System.out.println("l�tfen rasyonel say� giriniz");
				sayi1 = input.nextInt();
				
			}
			while(count<5)
			{
				System.out.println("bir tam say� giriniz");
				sayi1 = input.nextInt();
				toplam +=sayi1;/// toplam = toplam+say�
				count++;	
			}
			
			
		}
		ortalama = toplam/count;
		System.out.println("ortalama =" + ortalama);		
	   }
}
