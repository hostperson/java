package ilkdeneme1;
import java.util.Scanner;
public class diziler {
	public static void main (String[] args )
	   {
		Scanner input = new Scanner(System.in);
		int array[] = new int [5];
		int toplam = 0;
		double ortalama;
        for(int i = 0 ; i<5; i++)///baþlangýç miktarý ,artýþ miktarý , bitiþ miktarý
        {
        	System.out.println(i+1 +".sayýsýný giriniz");//ekrana 6 kere yazdýrýlýr
        	array[i] = input.nextInt(); //i deðeri int cinsinden klavyeden girmek için tanýmlanýr
        	System.out.println();//bir alt satýra geçmeye yarar
        }
        for(int i = 0 ; i<5; i++)//baþlangýç miktarý ,artýþ miktarý , bitiþ miktarý
        {
        	toplam += array[i];        	
        }        
        ortalama = (double)toplam/5;
        System.out.println("ortalam = " +ortalama);
	   }
}
