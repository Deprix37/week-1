import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ondalıklı sayı giriniz: ");
        double tempDouble = input.nextDouble();
        System.out.print("Tam sayı giriniz: ");
        int tempInt= input.nextInt();

        int tamSayi = tempInt;
        System.out.println((int)tempDouble);
        System.out.println((double)tamSayi);


    }
}