package ilkdeneme1;
import java.util.Scanner;
import java.util.Random;
public class iki_boyutlu_diziler {
	public static void main(String[] args)
	{
		Random randomNum =new Random();
		Scanner  input = new Scanner(System.in);
		
		int [][]dizi;
	    dizi = new int[5][5];////"1.[5]=toplam dizi miktarý,2.[5]=toplam artýþ miktarý
	    
		for(int i =0;i<5;i++)
		{
			for(int c =0 ;j<5;j++)
			{
		      dizi[i][j] =randomNum.nextInt(9)+1;
			}
		}
		for(int i =0;i<5;i++)
		{
			for(int c =0 ;j<5;j++)
			{
		      System.out.println("");
			}
		}
		
		
	}

}
