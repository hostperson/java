package ilkdeneme1;
import java.util.Scanner;
public class swýtch {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int secim;
		int num1, num2, sonuc;
		System.out.println("1.toplama\n2.çýkarma\n3.çarpma\n4.bölme");
		secim = input.nextInt();
		System.out.println("1.sayýyý giriniz:");
		num1 = input.nextInt();
		num2 = input.nextInt();
		switch (secim)
		{
		case 1:
			sonuc = num1 + num2;
			System.out.println("iþleminizin sonucu :" + sonuc);
			break;
		case 2:
			sonuc = num1 - num2;
			System.out.println("iþleminizin sonucu :" + sonuc);
			break;
		case 3:
			sonuc = num1 * num2;
			System.out.println("iþleminizin sonucu :" + sonuc);
			break;
		case 4:
			sonuc = num1 / num2;
			System.out.println("iþleminizin sonucu :" + sonuc);
			break;
			default:
				System.out.println("menuden bir iþlem seçmediniz");
				break;
				
			
		}
		}
		
		}
		
		
	

