package ilkdeneme1;
import java.util.Scanner;
import java.util.Random;
public class dizi_sayi_tahmini {
	public static void main(String[] args)
	{		
		Random randomNum =new Random();
		Scanner  input = new Scanner(System.in);
		int Rsayi,Fsayi,Tsayi,sayac=0;
		Rsayi = randomNum.nextInt(44)+1;
		do
		{	
			System.out.println("tahmininizi giriniz");
			Tsayi = input.nextInt();
			sayac++;
			Fsayi = Math.abs((Rsayi - Tsayi));
			if(Fsayi>0 && Fsayi<=5)
             System.out.println("Sayýya çok yaklaþtýnýz ortam çok sýcak");
			else if(Fsayi>5 && Fsayi<=15)
				System.out.println("Sayýya yaklaþtýnýz ortam sýcak ");
			else if(Fsayi>15 && Fsayi<=25)
				System.out.println("ortam ýlýk çabalamaya devam. ");
			else if(Fsayi>25 && Fsayi<=35)
				System.out.println("ortam normal daha mantýklý deðer gir .");
			else if(Fsayi>35 && Fsayi<=45)
				System.out.println("ortam soðuk sayý nerde sen nerdesin! ");
			else if(Fsayi>=45)
				System.out.println("ortam buz gibi. ");
			}
		while(Fsayi !=0);
		System.out.println("bulduðunuz sayi : " + Rsayi);
		System.out.println();
		System.out.println(sayac +" "+ " defa denediniz");
	}
}
