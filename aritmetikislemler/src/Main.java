import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //değişkenlerimi kullacınıdan girdi olarak aldım
        int a,b,c, sonuc;
        System.out.print("A sayınızı giriniz : ");
        a = input.nextInt();
        System.out.print("B sayınızı giriniz: ");
        b = input.nextInt();
        System.out.print("C sayınızı giriniz: ");
        c = input.nextInt();
        // sonuç değişkenimi hesaplayıp ekrana yazdırdım
        sonuc = a+b*c-b;
        System.out.println(sonuc);


    }
}