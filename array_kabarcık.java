package ilkdeneme1;
import java.util.Scanner;
public class array_kabarc�k {
	public static void main (String[] args) 
			{
		Scanner input = new Scanner(System.in);
		int kac_sayi,yedek,unsort[],array[];
		int sayac= 0;
		System.out.println("l�tfen ka� say� girmek istedi�inizi yaz�n�z");
		kac_sayi = input.nextInt();
		array = new int[kac_sayi];
		unsort = new int[kac_sayi];
		for(int i =0;i<kac_sayi;i++)
		{
			System.out.println(i+1 +".say� y� giriniz");
			array[i] = input.nextInt();
			unsort[i] = array[i];	
		}
		for(int j =0;j<kac_sayi;j++)
		{
			for(int i =0;i<kac_sayi-1;i++)
			{
				sayac++;
				if(array[i] >array[i+1])
				{
					yedek = array[i];
					array[i] = array[i+1];
					array[i+1] = yedek;
				}
			}
		}
		System.out.println("s�ralanmam�� ve �u s�ralanm�� dizi �u �ekildedir = ");
		System.out.println("\n\n");
		for(int i =0;i<kac_sayi;i++)
		{
			System.out.print(unsort[i]+ "-");
		}
		System.out.println();
		for(int i =0;i<kac_sayi;i++)
		{
			System.out.print(array[i]+ "-");
		}
		System.out.println("sayac: "+sayac);
	   }
}
