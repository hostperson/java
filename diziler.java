package ilkdeneme1;
import java.util.Scanner;
public class diziler {
	public static void main (String[] args )
	   {
		Scanner input = new Scanner(System.in);
		int array[] = new int [5];
		int toplam = 0;
		double ortalama;
        for(int i = 0 ; i<5; i++)///ba�lang�� miktar� ,art�� miktar� , biti� miktar�
        {
        	System.out.println(i+1 +".say�s�n� giriniz");//ekrana 6 kere yazd�r�l�r
        	array[i] = input.nextInt(); //i de�eri int cinsinden klavyeden girmek i�in tan�mlan�r
        	System.out.println();//bir alt sat�ra ge�meye yarar
        }
        for(int i = 0 ; i<5; i++)//ba�lang�� miktar� ,art�� miktar� , biti� miktar�
        {
        	toplam += array[i];        	
        }        
        ortalama = (double)toplam/5;
        System.out.println("ortalam = " +ortalama);
	   }
}
