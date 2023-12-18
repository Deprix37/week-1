import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Basamak sayısını girin: ");
        int basamakSayisi = input.nextInt(); // kaç basamaklı olacağını öğreniyorum

        for (int i = basamakSayisi; i >= 1; i--) {
            // inlk döngün ile boşlukları ekliyorum
            for (int j = 0; j < basamakSayisi - i; j++) {
                System.out.print(" ");
            }

            // Yıldızları eklediğim döngüm
            for (int k = 0; k < 2 * i - 1; k++) {
                System.out.print("*");
            }

            // Bir satır atla
            System.out.println();
        }


    }
}


