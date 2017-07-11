package ilkdeneme1;

import java.util.Scanner;

public class scannerornek {
	private static Scanner input;

	public static void main (String[] args)
    {
		
		
		input = new Scanner(System.in);
		
		double yas;
		String isim;
		String soyisim;
		System.out.println("isminizi giriniz :");
		isim = input.nextLine();
		System.out.println("soy giriniz :");
		soyisim = input.nextLine();
		System.out.println("yaþýnýzý giriniz :");
		yas = input.nextDouble();
		System.out.println("isminizi giriniz : " + isim);
		System.out.println("soy giriniz :" + soyisim);
		System.out.println("yaþýnýzý giriniz : " + yas);
    }
////import ,export,input,next..,scanner küçük kalýp kodlar var onu ezberle
}
