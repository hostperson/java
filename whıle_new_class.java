package ilkdeneme1;
import java.util.Scanner;
public class whýle_new_class {


   public static void main (String[] args )
   {
	   Scanner input = new Scanner(System.in);
	   int sayi1, sayi2, secim;
	   double sonuc;
      System.out.println("1.toplama\n2.çýkarma\n3.çarpma\n4.bölme\n5.çýkýþ");
      System.out.println("Menüden Bir Ýþlem Seçiniz");
      secim = input.nextInt();
      while(secim<1 || secim >5)
      {
    	  
    	 System.out.println("seçiminiz 1 ile 5 rakamlarý arasýnda olmalýdýr\n\n");
    	 System.out.println("1.toplama\n2.çýkarma\n3.çarpma\n4.bölme\n5.çýkýþ");
         System.out.println("Menüden Bir Ýþlem Seçiniz");
         secim = input.nextInt();
      
      }
      while(secim!=5)
    	  {
    	        System.out.println("iki tam say giriniz");
    	        sayi1 = input.nextInt();
    	        sayi2 = input.nextInt();
    	        if(secim ==1)
    	        {
    	        	sonuc = sayi1 + sayi2;
    	        }
    	        else if(secim ==2 )
    	        {
    	        	sonuc = sayi1 - sayi2;
    	        }
    	        else if(secim==3)
    	        {
    	        	sonuc = sayi1 * sayi2;
    	        }
                else
                {
                	sonuc = sayi1 / sayi2;
                }
    	  
      System.out.println("iþlem sonucu : " +sonuc);
      input.nextLine();
      input.nextLine();
      
      System.out.println("1.toplama\n2.çýkarma\n3.çarpma\n4.bölme\n5.çýkýþ");
      
      System.out.println("Menüden Bir Ýþlem Seçiniz");
      secim = input.nextInt();
    	  
      while(secim<1 || secim >5)
      {
    	  
    	 System.out.println("seçiminiz 1 ile 5 rakamlarý arasýnda olmalýdýr\n\n");
    	 System.out.println("1.toplama\n2.çýkarma\n3.çarpma\n4.bölme\n5.çýkýþ");
         System.out.println("Menüden Bir Ýþlem Seçiniz");
         secim = input.nextInt();
      
      }
    	  }
    	  }
}
