import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int k;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz : ");
        int sayac = 0;
        int toplam = 0;
        k = input.nextInt();
        for (int i = 1; i<=k;i++){
            if (i%3==0 && i %4==0){
                System.out.println(i + " hem 3 e hem 4 e tam bölünmektedir");
                toplam = toplam + i;
                sayac++;
            }
        }
        System.out.println("Sayıların toplamı : " + toplam);
        System.out.println(sayac + " adet sayı vardır ");
        double ortalama = toplam / sayac;
        System.out.println("Ortalama = " + ortalama);

    }
}