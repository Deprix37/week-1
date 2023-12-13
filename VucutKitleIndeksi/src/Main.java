import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // değişkenlerimi oluşturuyorum.
        double boy, vki;
        int kg;

        // kullanıcıdan girdileri alıp vücut kitle indeksini hesaplıyor ardından yazdırıyorum.
        System.out.print("Lütfen boyunuzu (metre cinsinden) giriniz: ");
        boy = input.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz: ");
        kg = input.nextInt();
        vki = kg / (boy * boy);
        System.out.println("Vücut Kitle İndeksiniz: " + vki);

    }
}