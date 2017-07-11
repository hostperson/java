package ilkdeneme1;
import java.util.Scanner;
public class ders_disi_ornek_calýsmam {
	   public static void main (String[] args )
	   {
		   Scanner input = new Scanner(System.in);
		   String isim1,isim2;
		   int    not1,not2,not3,sayi1,sayi2,sayi3;
		   double ortalama1,ortalama2;
		   System.out.println("lütfen ilk öðrenci adýný giriniz");
		   isim1 = input.nextLine();
		   System.out.println("lütfen ikinci öðrenci adýný giriniz");
		   isim2 = input.nextLine();
		   System.out.println("lütfen ilk öðrencinin arasýnav 1.notunu giriniz");
		   not1 = input.nextInt();
		   System.out.println("lütfen ilk öðrencinin arasýnav 2.notunu giriniz");
		   not2 = input.nextInt();
		   System.out.println("lütfen ilk öðrencinin final.notunu giriniz");
		   not3 = input.nextInt();
		   System.out.println("lütfen ikinci öðrencinin arasýnav 1.notunu giriniz");
		   sayi1 = input.nextInt();
		   System.out.println("lütfen ikinci öðrencinin arasýnav 2.notunu giriniz");
		   sayi2 = input.nextInt();
		   System.out.println("lütfen ikinci öðrencinin final.notunu giriniz");
		   sayi3 = input.nextInt();	  
		   ortalama1 = not1*0.2 + not2*0.2 +not3*0.6;
		   System.out.println("ilk öðrenci geçme notu :" + ortalama1 +":" + isim1);
		   ortalama2 = sayi1*0.2 + sayi2*0.2 + sayi3*0.6 ;
		   System.out.println("ikinci öðrenci geçme notu :" + ortalama2 +":" + isim2);
		   if(ortalama1<40)
		   {   
			   System.out.println("kaldýnýz = " +isim1);
			   ortalama1 = input.nextDouble();
		   }
		   if(ortalama2<40)
		   {   
			   System.out.println("kaldýnýz = " +isim2);
			   ortalama1 = input.nextDouble();
		   }
	   }
}
