package ilkdeneme1;
import java.util.Scanner;
public class ifelse�rnek {
	public static void main (String[]args)
{
		
	Scanner input = new Scanner(System.in);
	int sayi1,sayi2,sonuc,secim;
	System.out.println("1.toplama\n2.��kartma\n3.�arpma\n4.b�lme\n5.&i�lemi");
	System.out.println("se�iminizi yap�n�z");
	secim = input.nextInt();
	System.out.println("iki tam say� giriniz");
	sayi1 = input.nextInt();
	sayi2 = input.nextInt();
	if(secim == 1)///1.se�enek
	{
		sonuc = sayi1+sayi2;
	System.out.println("i�lemin sonucu: " + sonuc);
	}
	else if(secim == 2)//2.se�enek
	{
		sonuc = sayi1-sayi2;
		System.out.println("i�lemin sonucu: " + sonuc);
	}
	else if(secim == 3)//3.se�enek
	{
		sonuc = sayi1*sayi2;
		System.out.println("i�lemin sonucu: " + sonuc);
	}
	else if(secim == 4)//4.se�enek
	{
		sonuc = sayi1 / sayi2;
		System.out.println("i�lemin sonucu: " + sonuc);
	}
	else if(secim == 5)
	{
		sonuc = sayi1 & sayi2;
	System.out.println("i�lemin sonucu: " + sonuc);
	}
	else
	{
	}
	}
	{
	}	
	}
	
	//////�zet olarak :toplama ��karma �arpma b�lme se�ene�ini 9.sat�rda,1.2.3.4
    /////se�enekler i�in if else kullan�ld�
