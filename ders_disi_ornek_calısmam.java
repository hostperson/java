package ilkdeneme1;
import java.util.Scanner;
public class ders_disi_ornek_cal�smam {
	   public static void main (String[] args )
	   {
		   Scanner input = new Scanner(System.in);
		   String isim1,isim2;
		   int    not1,not2,not3,sayi1,sayi2,sayi3;
		   double ortalama1,ortalama2;
		   System.out.println("l�tfen ilk ��renci ad�n� giriniz");
		   isim1 = input.nextLine();
		   System.out.println("l�tfen ikinci ��renci ad�n� giriniz");
		   isim2 = input.nextLine();
		   System.out.println("l�tfen ilk ��rencinin aras�nav 1.notunu giriniz");
		   not1 = input.nextInt();
		   System.out.println("l�tfen ilk ��rencinin aras�nav 2.notunu giriniz");
		   not2 = input.nextInt();
		   System.out.println("l�tfen ilk ��rencinin final.notunu giriniz");
		   not3 = input.nextInt();
		   System.out.println("l�tfen ikinci ��rencinin aras�nav 1.notunu giriniz");
		   sayi1 = input.nextInt();
		   System.out.println("l�tfen ikinci ��rencinin aras�nav 2.notunu giriniz");
		   sayi2 = input.nextInt();
		   System.out.println("l�tfen ikinci ��rencinin final.notunu giriniz");
		   sayi3 = input.nextInt();	  
		   ortalama1 = not1*0.2 + not2*0.2 +not3*0.6;
		   System.out.println("ilk ��renci ge�me notu :" + ortalama1 +":" + isim1);
		   ortalama2 = sayi1*0.2 + sayi2*0.2 + sayi3*0.6 ;
		   System.out.println("ikinci ��renci ge�me notu :" + ortalama2 +":" + isim2);
		   if(ortalama1<40)
		   {   
			   System.out.println("kald�n�z = " +isim1);
			   ortalama1 = input.nextDouble();
		   }
		   if(ortalama2<40)
		   {   
			   System.out.println("kald�n�z = " +isim2);
			   ortalama1 = input.nextDouble();
		   }
	   }
}
