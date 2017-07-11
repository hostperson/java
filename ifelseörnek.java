package ilkdeneme1;
import java.util.Scanner;
public class ifelseörnek {
	public static void main (String[]args)
{
		
	Scanner input = new Scanner(System.in);
	int sayi1,sayi2,sonuc,secim;
	System.out.println("1.toplama\n2.çýkartma\n3.çarpma\n4.bölme\n5.&iþlemi");
	System.out.println("seçiminizi yapýnýz");
	secim = input.nextInt();
	System.out.println("iki tam sayý giriniz");
	sayi1 = input.nextInt();
	sayi2 = input.nextInt();
	if(secim == 1)///1.seçenek
	{
		sonuc = sayi1+sayi2;
	System.out.println("iþlemin sonucu: " + sonuc);
	}
	else if(secim == 2)//2.seçenek
	{
		sonuc = sayi1-sayi2;
		System.out.println("iþlemin sonucu: " + sonuc);
	}
	else if(secim == 3)//3.seçenek
	{
		sonuc = sayi1*sayi2;
		System.out.println("iþlemin sonucu: " + sonuc);
	}
	else if(secim == 4)//4.seçenek
	{
		sonuc = sayi1 / sayi2;
		System.out.println("iþlemin sonucu: " + sonuc);
	}
	else if(secim == 5)
	{
		sonuc = sayi1 & sayi2;
	System.out.println("iþlemin sonucu: " + sonuc);
	}
	else
	{
	}
	}
	{
	}	
	}
	
	//////özet olarak :toplama çýkarma çarpma bölme seçeneðini 9.satýrda,1.2.3.4
    /////seçenekler için if else kullanýldý
