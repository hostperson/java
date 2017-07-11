package ilkdeneme1;

public class for_dongusu {
	public static void main (String[] args)
	{
		int toplam=0, i=0;
		while(i<10)
		{
			toplam = toplam+i;
			i++;
			
		}
		System.out.println("'while'toplamýn deðeri = " + toplam);
		i=0;
		toplam=35;
		for( ;i<10; i++);
		{
			toplam +=i;
			
					
		}
		System.out.println("'for'toplamýn deðeri = " + toplam);
				
	}

}
