import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int k ;
        System.out.print("Sayı giriniz: ");
        k = input.nextInt();
        for (int i = 1; i <=k; i*=4){

            System.out.print(i + " , ");
        }
        System.out.println("");
        for (int j =1; j<=k; j*=5){
            System.out.print(j + " ,  " );
        }
    }
}