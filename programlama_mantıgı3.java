package ilkdeneme1;
import java.util.Scanner;
public class programlama_mantıgı3 {
	public static void main (String[] args )
	
	   {
		
		Scanner input = new Scanner(System.in);
		String marka,model,kontrol;
		int yıl,yas;
		System.out.println("arabanızın markasını giriniz");
		marka = input.nextLine();
		System.out.println("arabanızın modelini giriniz");
		model = input.nextLine();
		System.out.println("arabanızın model yılınız giriniz: ");
		yıl = input.nextInt();
		yas = 2017-yıl;	
		
		if(yas>=1 && yas<5)
		{
	          System.out.println("arabanız " +marka.substring(0,1) +model.substring(0,1)+ " yeni sayılır");
		}

		else if(yas>=5 && yas<20)
		{
	
			System.out.println("arabanız " +marka.substring(0,1) +model.substring(0,1)+ " motoru açılmıştır");
		}
		else if(yas>=20 && yas<35)
		{
			System.out.println("arabanız " +marka.substring(0,1) +model.substring(0,1)+ " bakıma ihtiyacı var");
		}
		else if(yas>=35 && yas<50)
		{
			System.out.println("arabanız " +marka.substring(0,1) +model.substring(0,1)+ " değiştirme vakti geldi");
		}
		else if(yas>=50)
		{
			System.out.println("arabanız " +marka.substring(0,1) +model.substring(0,1)+ " bir hurdadır");

		}
		

	   }

}

