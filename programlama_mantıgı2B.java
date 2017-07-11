package ilkdeneme1;
import java.util.Scanner;
public class programlama_mantýgý2B {
	public static void main (String[] args)
	{
		Scanner input = new Scanner(System.in);
		int kok1,kok2,b,c;
		System.out.println("Lütfen 1.Kök ü Giriniz");
		kok1 = input.nextInt();
		System.out.println("Lütfen 2.Kök ü Giriniz");
		kok2 = input.nextInt();
		kok1 = kok1 * (-1);
		kok2 *=(-1);///yukardaki koddan farký yok yalnýzca "=" den önce "*" girilirse iþlem kendi ile çarpýlýr ve burda(-1) verildiði için onla çarpýlýr
		b = kok1 + kok2;
		c = kok1 * kok2;
		System.out.println("x^2 + (" +b +")x + (" +c+ ")");	
	}
}
