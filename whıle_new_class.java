package ilkdeneme1;
import java.util.Scanner;
public class wh�le_new_class {


   public static void main (String[] args )
   {
	   Scanner input = new Scanner(System.in);
	   int sayi1, sayi2, secim;
	   double sonuc;
      System.out.println("1.toplama\n2.��karma\n3.�arpma\n4.b�lme\n5.��k��");
      System.out.println("Men�den Bir ��lem Se�iniz");
      secim = input.nextInt();
      while(secim<1 || secim >5)
      {
    	  
    	 System.out.println("se�iminiz 1 ile 5 rakamlar� aras�nda olmal�d�r\n\n");
    	 System.out.println("1.toplama\n2.��karma\n3.�arpma\n4.b�lme\n5.��k��");
         System.out.println("Men�den Bir ��lem Se�iniz");
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
    	  
      System.out.println("i�lem sonucu : " +sonuc);
      input.nextLine();
      input.nextLine();
      
      System.out.println("1.toplama\n2.��karma\n3.�arpma\n4.b�lme\n5.��k��");
      
      System.out.println("Men�den Bir ��lem Se�iniz");
      secim = input.nextInt();
    	  
      while(secim<1 || secim >5)
      {
    	  
    	 System.out.println("se�iminiz 1 ile 5 rakamlar� aras�nda olmal�d�r\n\n");
    	 System.out.println("1.toplama\n2.��karma\n3.�arpma\n4.b�lme\n5.��k��");
         System.out.println("Men�den Bir ��lem Se�iniz");
         secim = input.nextInt();
      
      }
    	  }
    	  }
}
