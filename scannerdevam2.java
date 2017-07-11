package ilkdeneme1;
import java.util.Scanner;
public class scannerdevam2 
{
	public static void main (String[] args)
    {
		Scanner input = new Scanner(System.in);
 String isim,soyisim;
 System.out.println("isminiz ve soy isminiz: ");
 isim = input.next();
 soyisim = input.next();
 System.out.println("isminiz : " + isim.charAt(0));
  System.out.println("soy isminiz : " + soyisim.charAt(0));

  ////"Scanner input = new Scanner(System.in);   ve   import java.util.Scanner;
  ///kalýplarýný unutma
    }
}
