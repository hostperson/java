package ilkdeneme1;
import java.util.Scanner;
public class programlam_mantýgý2 {
	public static void main (String[] args)
	{
		Scanner input = new Scanner(System.in);
		int sayi1,sayi2,secim;
		double toplam = 0;
		System.out.println("lütfen ilk sayý giriniz");
		sayi1 = input.nextInt();
		System.out.println("lütfen ikinci sayý giriniz");
		sayi2 = input.nextInt();
		System.out.println("1.çarpma(*)\n2.bölme(/)\n3.yüzde(%)");
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
	    System.out.println("iþleminizin sonucu = " + toplam);
	}
}
