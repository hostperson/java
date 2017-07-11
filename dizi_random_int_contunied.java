package ilkdeneme1;
import java.util.Scanner;
import java.util.Random;
public class dizi_random_int_contunied {
	public static void main(String[] args)
	{
		Random randomNum =new Random();
		Scanner  input = new Scanner(System.in);	
		int array[],sayi,yedek,j=0,kolon;
		boolean kontrol ;
		sayi =10;
		array = new int[sayi];
		System.out.println("Kaç Kolon Oynamak Ýstersiniz");
		kolon = input.nextInt();
		for(int z = 0;z<kolon;z++)
		{
			for(int i = 0;i<10;i++)
			{
				array[i] = 0;
			}
			j=0;
			while(j<10)
			{
				yedek = randomNum.nextInt(100)+1;
				kontrol = true;
				for(int i = 0;i<10;i++)
				{
					if(array[i] == yedek)
					{
						kontrol =false;
					}
				}
				if(kontrol)
				{
					array[j] = yedek;
					j++;
				}
			}
			System.out.println();
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
			System.out.println(z+1 +".kolon = ");
			for(int i =0;i<sayi;i++)
			{
			    System.out.print(array[i] +"-");
			}
			System.out.println();
		}
	}
}
