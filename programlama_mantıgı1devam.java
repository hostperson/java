package ilkdeneme1;
import java.util.Scanner;
public class programlama_mant�g�1devam {
	public static void main (String[] args)
	{
		Scanner input = new Scanner(System.in);
		String c�mle;
		int karakter;		
		System.out.println("bir c�mle giriniz");
		c�mle = input.nextLine();
		karakter = c�mle.length();
		System.out.println("karakter say�s� : " + karakter);
	}
}
