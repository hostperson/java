package ilkdeneme1;
import java.util.Scanner;
public class if_else_example_contunied {
public static void main(String[] args) {
    Scanner giris=new Scanner(System.in);
    double kilo,boy,sonuc;
    System.out.println("L�tfen kilonuzu kg cinsinden giriniz:");
    kilo=giris.nextDouble();
    System.out.println("L�tfen boyunuzu metre cinsinden giriniz: �rnek:(1,75)");
    boy=giris.nextDouble();
    sonuc=kilo/(boy*boy);
    System.out.println("V�cut kitle indeksiniz:"+sonuc);
    if(sonuc<18.5){
    System.out.println("V�cut kitle indeksinize g�re durumunuz:Zay�f");
    } else if(sonuc>=18.5&&sonuc<=24.9) {
    System.out.println("V�cut kitle indeksinize g�re durumunuz:Normal");
    } else if(sonuc>24.9&&sonuc<=29.9) {
    System.out.println("V�cut kitle indeksinize g�re durumunuz:Kilolu");
    } else if(sonuc>29.9&&sonuc<=34.9) {
    System.out.println("V�cut kitle indeksinize g�re durumunuz:1.Derece obez");
    } else if(sonuc>34.9&&sonuc<=39.9) {
    System.out.println("V�cut kitle indeksinize g�re durumunuz:2.Derece obez");
    } else if(sonuc>39.9) {
    System.out.println("V�cut kitle indeksinize g�re durumunuz:3.Derece obez");
    } else {
    System.out.println("Hata olu�tu");
    }
    }
    
}
	
		
	

	
	




