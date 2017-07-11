package ilkdeneme1;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class calculatorApplet
{
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
        JOptionPane.showMessageDialog(null,"Hesap Makinesine Hoş Geldiniz!");
        String option = JOptionPane.showInputDialog(null, "Hangi hangi işlemi yapmak İstediğinizi Seçiniz.örnek.toplama,çıkarma,çarpma,bölme");
        
        if (option.equals("toplama"))
        {
            Double add1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Girmek İstediğiniz İlk Sayıyı Lütfen Yazınız."));
            Double add2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Lütfen İkinci Sayıyı  Yazınız."));
            Double preAdd = add1+add2;
            Double Add = preAdd;
            JOptionPane.showMessageDialog(null, "The sum is " + Add + ".");
        }
  
        if (option.equals("çıkarma"))
        {
            Double sub1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Girmek İstediğiniz İlk Sayıyı Lütfen Yazınız."));
            Double sub2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Lütfen İkinci Sayıyı  Yazınız."));
            Double preSub = sub1-sub2;
            Double Sub = preSub;
            JOptionPane.showMessageDialog(null, "fark şu şekil dedir : " + Sub + ".");
        }

        if (option.equals("çarpma"))
        {
            Double mult1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Lütfen Çarpma İşlemi İçin İlk Sayıyı Giriniz."));
            Double mult2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Lütfen Çarpma İşlemi İçin İkinci Sayıyı Giriniz."));
            Double preMult = mult1*mult2;
            Double Mult = preMult;
            JOptionPane.showMessageDialog(null, "The product is " + Mult + ".");
        }
        else 
        if (option.equals("bölme"))
        {
            Double div1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Lütfen bölme İşlemi İçin İlk Sayıyı Giriniz."));
            Double div2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Lütfen bölme İşlemi İçin İkinci Sayıyı Giriniz."));
            Double preDiv = div1/div2;
            Double Div = preDiv;
            JOptionPane.showMessageDialog(null, "bölüm sonucu :  " + Div + ".");
        }

    } 

}
