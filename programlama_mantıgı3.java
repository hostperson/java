package ilkdeneme1;
import java.util.Scanner;
public class programlama_mant�g�3 {
	public static void main (String[] args )
	
	   {
		
		Scanner input = new Scanner(System.in);
		String marka,model,kontrol;
		int y�l,yas;
		System.out.println("araban�z�n markas�n� giriniz");
		marka = input.nextLine();
		System.out.println("araban�z�n modelini giriniz");
		model = input.nextLine();
		System.out.println("araban�z�n model y�l�n�z giriniz: ");
		y�l = input.nextInt();
		yas = 2017-y�l;	
		
		if(yas>=1 && yas<5)
		{
	          System.out.println("araban�z " +marka.substring(0,1) +model.substring(0,1)+ " yeni say�l�r");
		}

		else if(yas>=5 && yas<20)
		{
	
			System.out.println("araban�z " +marka.substring(0,1) +model.substring(0,1)+ " motoru a��lm��t�r");
		}
		else if(yas>=20 && yas<35)
		{
			System.out.println("araban�z " +marka.substring(0,1) +model.substring(0,1)+ " bak�ma ihtiyac� var");
		}
		else if(yas>=35 && yas<50)
		{
			System.out.println("araban�z " +marka.substring(0,1) +model.substring(0,1)+ " de�i�tirme vakti geldi");
		}
		else if(yas>=50)
		{
			System.out.println("araban�z " +marka.substring(0,1) +model.substring(0,1)+ " bir hurdad�r");

		}
		

	   }

}

