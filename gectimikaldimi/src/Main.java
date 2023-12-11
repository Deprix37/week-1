import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // değişkenlerimi tanımladım.
        int mat, fizik, kimya, turkce, tarih, muzik, toplam;
        double ortalama;

        // kullanıcıdan değiklenler için veri girdiriyorum
        Scanner input = new Scanner(System.in);
        System.out.print("Matematik notunuzu giriniz: ");
        mat = input.nextInt();

        System.out.print("Fizik notunuzu giriniz: ");
        fizik = input.nextInt();

        System.out.print("Kimya notunuzu giriniz: ");
        kimya = input.nextInt();

        System.out.print("Türkçe notunuzu giriniz: ");
        turkce = input.nextInt();

        System.out.print("Tarih Notunuzu giriniz: ");
        tarih = input.nextInt();

        System.out.print("Müzik Notunuzu giriniz: ");
        muzik = input.nextInt();

        //toplam ve ortalama değişkenlerimi aritmetik işlemler ile buluyorum.
        toplam = mat + fizik + kimya + turkce + tarih + muzik;
        ortalama = toplam / 6;

        System.out.println("Ortalamanız =  " + ortalama);
        // boolean değişkeni ile ortalamayı koşul durumuna sokuyorum
        boolean kosul1 = ortalama >= 60;

        String gectimi = (kosul1) ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(gectimi);


    }
}