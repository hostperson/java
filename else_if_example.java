package ilkdeneme1;
import java.util.Scanner;

import javax.print.DocFlavor.STRING;
public class else_if_example {
	public static void main (String[]args)
	{
		Scanner input = new Scanner(System.in);
		String username = "recepaslan443344@gmail.com", password = "deneme44";
		String kullanici_adi, sifre;
		System.out.println("kullan�c� ad�n�z� giriniz");
		kullanici_adi = input.next();
		System.out.println("�ifrenizi giriniz");
		sifre = input.next();
		if(username.equals(kullanici_adi) && password.equals(sifre))
		{
			System.out.println("giri� do�ruland�");
		}
		else
		{
			System.out.println("kullan�c� ad� veya �ifre yanl��");
		}
		
		}
	}



