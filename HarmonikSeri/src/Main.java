import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number;
        System.out.print("N sayısını giriniz: ");
        double harmonik = 0;
        number = input.nextInt();
        for (double i =1; i<=number;i++){
            harmonik = harmonik + (1/i);
        }
        System.out.println(harmonik);

    }
}