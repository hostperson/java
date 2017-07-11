package ilkdeneme1;
import java.util.Scanner;
public class PROGRAMLAMA_MANTIGI1 {
	public static void main (String[] args)
	{
		Scanner input = new Scanner(System.in);
		int sayi1, sayi2, sayi3,toplam;
		System.out.println("lütfen bir sayý giriniz");
		sayi1 = input.nextInt();
		System.out.println("lütfen ikinci sayýyý giriniz");
		sayi2 = input.nextInt();
		System.out.println("lütfen üçüncü sayýyý giriniz");
		sayi3 = input.nextInt();
		toplam = (sayi1*sayi1)+(sayi2*sayi2)+(sayi3*sayi3);
		System.out.println("iþlem sonucu:" +toplam);
	}
}
