import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // değişkenlerimi tanımladım
        double pi= 3.14;
        double alan,cevre;
        System.out.print("Dairenin yarı çapını giriniz: ");
        int r = input.nextInt();
        // alan ve çevre değerlerimi hesaplayıp ekrana yazdırdım
        alan = pi * r * r;
        cevre= 2 * pi * r;
        System.out.println("Dairenin alanı: " + alan);
        System.out.println("Dairenin çevresi: " + cevre);
    }
}
