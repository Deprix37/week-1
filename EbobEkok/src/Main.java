import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz: ");
        int n1 = input.nextInt();
        int i = 1;
        System.out.print("İkinci sayıyı giriniz: ");
        int n2 = input.nextInt();
        int ekok =1;
        int j =1;

        while (j<=(n1*n2)){
            if (j%n1 == 0 && j%n2 ==0){
                ekok = j;
                System.out.println("Ekok : " + ekok);
                break;



            }
         j++;

        }
        int ebob = 1;
        if (n1 > n2) {
            while (i <= n2){
                if (n1 % i == 0 && n2 % i == 0) {
                    ebob = i;
                }
                    i++;
            }
        }
        if (n1 < n2) {
            while (i <= n1) {
                if (n1 % i == 0 && n2 % i == 0) {
                    ebob = i;
                }
                    i++;
            }
        }
        System.out.println("Ebob : " + ebob);

    }
}