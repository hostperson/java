package ilkdeneme1;
import java.util.Scanner;
import java.util.Random;

public class dizi_random_int {
	public static void main(String[] args)
	{
		Random randomNum =new Random();
		Scanner  input = new Scanner(System.in);	
		int array[],sayi,yedek,j=0;
		boolean kontrol = false;
		sayi =6;
		array = new int[6];
		for(int i = 0;i<6;i++)
		{
			array[i] = 0;
		}
		while(j<6)
		{
			yedek = randomNum.nextInt(49)+1;
			for(int i = 0;i<6;i++)
			{
				if(array[i] == yedek)
				{
					kontrol =true;
				}
			}
			if(kontrol)
			{
				
			}
		}
		System.out.println();
		System.out.println("sıralanmamış dizi şu şekildedir = ");
		for(int i =0;i<sayi;i++)
		{
		    System.out.println(array[i] +"-");
		}
		for(int k =1;k<sayi;k++)
            {
			for(int i =0;i<sayi-k;i++)
			{
				if(array[i]>array[i+1])
				{
					yedek = array[i];
					array[i] = array[i+1];
					array[i+1] = yedek;
				}
			  }
	    }
		System.out.println();
		System.out.println("sıralanmış dizi şu şekildedir = ");
		for(int i =0;i<sayi;i++)
		{
		    System.out.println(array[i] +"-");
		}
	    }
}
