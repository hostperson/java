package ilkdeneme1;
import java.util.Scanner;
public class programlama_mant�g�2B {
	public static void main (String[] args)
	{
		Scanner input = new Scanner(System.in);
		int kok1,kok2,b,c;
		System.out.println("L�tfen 1.K�k � Giriniz");
		kok1 = input.nextInt();
		System.out.println("L�tfen 2.K�k � Giriniz");
		kok2 = input.nextInt();
		kok1 = kok1 * (-1);
		kok2 *=(-1);///yukardaki koddan fark� yok yaln�zca "=" den �nce "*" girilirse i�lem kendi ile �arp�l�r ve burda(-1) verildi�i i�in onla �arp�l�r
		b = kok1 + kok2;
		c = kok1 * kok2;
		System.out.println("x^2 + (" +b +")x + (" +c+ ")");	
	}
}
