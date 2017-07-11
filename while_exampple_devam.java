package ilkdeneme1;
import java.util.Scanner;
public class while_exampple_devam {
	public static void main (String[] args )
	{
	int faktoriyel=1, sayi, count=1;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Bir Sayý Giriniz :");
		sayi = input.nextInt();
		
		while(count<sayi || count<-1  || count>10)
		{
			faktoriyel = faktoriyel*count;
			count++;			
		}		
		System.out.println("Ýþlem Sonucu : " + faktoriyel);		
	}
}
