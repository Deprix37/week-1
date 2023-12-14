import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // değişkenlerimi oluşturup kullanıcıdan veri alıyorum
        int mat, fizik, turkce, kimya, muzik, dersler;
        dersler = 0;
        int toplam = 0;
        System.out.print("Matematik notunuz: ");
        mat = input.nextInt();
        // burada if bloklarında kullanıcı 0 ile 100 arası sayı girerse dersler sayısını 1 arttırıp toplam değerime ders notumu ekliyorum
        if (mat > 0 && mat <= 100) {
            dersler++;
            toplam = toplam + mat;
        }
        System.out.print("Fizik notunuz: ");
        fizik = input.nextInt();
        if (fizik > 0 && fizik <= 100) {
            dersler++;
            toplam = toplam + fizik;
        }
        System.out.print("Türkçe notunuz: ");
        turkce = input.nextInt();
        if (turkce >0 && turkce<=100){
            dersler++;
            toplam= toplam + turkce;
        }
        System.out.print("Kimya notunuz: ");
        kimya=input.nextInt();
        if (kimya>0 && kimya<=100){
            dersler++;
            toplam=toplam+kimya;
        }
        System.out.print("Müzik notunuz : ");
        muzik= input.nextInt();
        if (muzik>0 && muzik<=100){
            dersler++;
            toplam = toplam+muzik;
        }
        // ortalama değişkenimi tanımlayıp bunu bulmak için toplam notu ders sayısına bölüyorum ve if bloklarında geçip kalmasını koşula alıyorum.
        double avarage = toplam / dersler;
        if (avarage<55){
            System.out.println("Sınıfta kaldınız, seneye tekrar görüsmek üzere!");

        }
        else {
            System.out.println("Tebrikler sınıfı geçtiniz! ");
        }
        System.out.println("Ortalamanız : " +avarage);


    }
}