package ilkdeneme1;
import java.util.Scanner;
public class programlama_mantýgý1devam {
	public static void main (String[] args)
	{
		Scanner input = new Scanner(System.in);
		String cümle;
		int karakter;		
		System.out.println("bir cümle giriniz");
		cümle = input.nextLine();
		karakter = cümle.length();
		System.out.println("karakter sayýsý : " + karakter);
	}
}
