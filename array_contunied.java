package ilkdeneme1;
import java.util.Scanner;
public class array_contunied {
	public static void main (String[] args )
	
	   {
		Scanner input = new Scanner(System.in);
		int array[],bsayi,ksayi,dizi_uzunlugu;
		System.out.println("Kaç Sayý Girmek Ýstersiniz: ");
		dizi_uzunlugu = input.nextInt();
		while(dizi_uzunlugu<=0)
		
		{
			System.out.println("lütfen pozitif tam sayý giriniz");
			dizi_uzunlugu = input.nextInt();			
		}
		array = new int[dizi_uzunlugu];
		for(int i = 0 ;i<dizi_uzunlugu;i++)
		{
			System.out.println(i+1 + ".sayýyý giriniz");
			array[i] = input.nextInt();
		}
		bsayi = array[0];
		ksayi = array[0];
		for(int i = 0 ; i<dizi_uzunlugu; i++)
		{
			if(bsayi<array[i])
			{
				bsayi = array[i];
				
			}
			if(ksayi>array[i])
			{
				ksayi = array[i];
			}
		}
		System.out.println("girilen en büyük sayi: " + bsayi);
		System.out.println("girilen en küçük sayi: " + ksayi);
	   }
}
