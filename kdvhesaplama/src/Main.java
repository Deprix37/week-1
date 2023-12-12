import java.text.DecimalFormat;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double tutar;
        double kdvorani = 0.18;
        double kdvtutari;
        double kdvfiyat;
        System.out.print("Tutar giriniz: ");
        tutar = input.nextDouble();
        System.out.println("Kdvsiz fiyatı = " + tutar);
        if (tutar<=1000)
        {
            kdvtutari = tutar * kdvorani;
            System.out.println("KDV Oranınız = " + kdvorani);
            System.out.println("Kdv tutarı " + kdvtutari);

            kdvfiyat = kdvtutari + tutar;
            System.out.println("KDV'li tutar = " + kdvfiyat);
        }
        if (tutar > 1000){
            kdvorani = 0.08;
            kdvtutari = tutar * kdvorani;
            System.out.println("KDV Oranınız = " + kdvorani);
            System.out.println("Kdv tutarı " + kdvtutari);

            kdvfiyat = kdvtutari + tutar;
            System.out.println("KDV'li tutar = " + kdvfiyat);
        }


    }
}