package ilkdeneme1;
import java.util.Scanner;
public class scannerornekdevam {
	public static void main (String[] args)
    {
		Scanner input = new Scanner(System.in);
double sayi1,sayi2,sonuc;
 System.out.println("iki sayýyý giriniz :" );
 sayi1 = input.nextDouble();
 sayi2 = input.nextDouble();
 sonuc = sayi1 + sayi2;
 System.out.println("islem sonucu : " + sonuc);
 String isim,soyisim;
 isim = input.next();
 soyisim = input.next();
 System.out.println("isminiz : " + isim.charAt(0));
 System.out.println("isminiz : " + soyisim.charAt(0));

    }
}
