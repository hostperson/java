package ilkdeneme1;
import java.util.Scanner;
public class programlam_mant�g�2 {
	public static void main (String[] args)
	{
		Scanner input = new Scanner(System.in);
		int sayi1,sayi2,secim;
		double toplam = 0;
		System.out.println("l�tfen ilk say� giriniz");
		sayi1 = input.nextInt();
		System.out.println("l�tfen ikinci say� giriniz");
		sayi2 = input.nextInt();
		System.out.println("1.�arpma(*)\n2.b�lme(/)\n3.y�zde(%)");
		secim = input.nextInt();
	    if(secim==1)
	    {
	    	toplam = sayi1 * sayi2;
	    }
	    else if(secim==2)
	    {
	    	toplam = (double)sayi1 / sayi2;
	    }
	    else if(secim==3)
	    {
	          toplam = sayi1 % sayi2;         
	    }
	    System.out.println("i�leminizin sonucu = " + toplam);
	}
}
