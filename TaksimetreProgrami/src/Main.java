
/*
Taksimetre Programı
Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.
Taksimetre KM başına 2.20 TL tutmaktadır.
Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
Taksimetre açılış ücreti 10 TL'dir.*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // verilen bilgiler ile değişkenlerimi oluşturdum.
        double perKm=2.20;
        int startPrice = 10;
        double mesafe;
        double total;

        // yolcudan gideceği yolu alıyorum ve ödemesi gereken ücreti çıkartıyorum
        System.out.print("Toplam gideceğiniz kilometreyi giriniz: ");
        mesafe = input.nextDouble();               // kullanıcıdan gideceği mesafeyi alıp koşul durumuna sokuyorum.
        total= startPrice+ (perKm*mesafe);  total = (total<20) ? 20 : total;
        System.out.println("Toplam tutar: " + total);




    }
}
