import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: "); // Kullanıcıdan sayısını girdiriyorum
        int number = input.nextInt();
        int mukemmelSayi = 0; // bölenlerinin toplamlarını tutmak için döngü ve koşul öncesi değişken tanımlıyorum
        for (int i = 1; i<number; i++){
            if (number %i ==0){ // tam sayı çarpanları için koşulum
                mukemmelSayi+= i; // koşulu sağlayan her değişkeni topluyorum ve saklıyorum
            }

        }
        if (mukemmelSayi==number){ // tam sayı bölenleri kullanıcının girdiği sayıya eşitse mükemmel sayıdır.
            System.out.println(number + " Mükemmel sayıdır.");
        }else {
            System.out.println(number + "Mükemmel sayı değildir");
        }

    }
}