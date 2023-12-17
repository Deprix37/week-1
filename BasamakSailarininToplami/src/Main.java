import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Sayınızı giriniz: ");
        int number = input.nextInt();
        int total = 0;
        while (number!=0){
            total =  total + (number % 10);
            number = number / 10;
        }
        System.out.println("Girdiğiniz sayının basamaklarının toplamı : " +total);
    }
}