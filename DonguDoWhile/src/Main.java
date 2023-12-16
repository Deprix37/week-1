import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int k;
        int total = 0;
        do {
            System.out.print("Sayı giriniz : ");
            k = input.nextInt();
            if ((k % 2 == 0) && (k % 4 == 0)){
                total += k;
                System.out.println( k + " Hem çift hem de 4 ün katı bir sayıdır.");
            }

        } while (k % 2 == 0);

        System.out.println("toplam " + total);
    }
}