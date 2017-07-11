package ilkdeneme1;
import java.util.Scanner;
public class do_while_devam {
	public static void main (String[] args)
	{
		Scanner input = new Scanner(System.in);
		int sayi1=0, sayi2=0, secim, sonuc=0;
	do 
	{
		
	    System.out.println("1.toplama\n2.çýkarma\n3.çarpma\n4.bölme\n5.çýkýþ");
	    
	    System.out.println("Menüden Bir Ýþlem Seçiniz");
	    secim = input.nextInt();
	    System.out.println("iki tam sayý giriniz");
		if(secim!=5)
		{	
			sayi1 = input.nextInt();
			sayi2 = input.nextInt();
			
		}
		if(secim==1)
		{
			sonuc = sayi1+sayi2;
		}
		else if(secim==2)
		{
			sonuc = sayi1-sayi2;
		}
		if(secim==3)
		{
			sonuc = sayi1*sayi2;
		}
		else if(secim==4)
		{
			sonuc = sayi1/sayi2;
		}
		System.out.println("iþleminizin sonucu : " + sonuc);
	  }
	while(secim!=5);
	   {
		   
	   }
	
	}
	
}
	


