/*
N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı grupların sayısı n’in r’li kombinasyonu olarak adlandırılır. N’in r’li kombinasyonu C(n,r) şeklinde gösterilir.

Java ile kombinasyon hesaplayan program yazınız.

Kombinasyon formülü
C(n,r) = n! / (r! * (n-r)!)
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("n faktoriyeli giriniz");
        int n = input.nextInt();
        System.out.print("r faktoriyeli giriniz");
        int r = input.nextInt();
        int faktoriyelN=1;
        int faktoriyelR=1;
        for (int i = 1; i<=n; i++){
            faktoriyelN = faktoriyelN * i;
        }
        for (int j =1; j<=r; j++){
            faktoriyelR = faktoriyelR * j;
        }
        int faktoriyelFarkSonuc = 1;
        int faktoriyelFark = n-r;
        for (int c = 1; c <=faktoriyelFark; c++){
            faktoriyelFarkSonuc = faktoriyelFarkSonuc * c;
        }
        double formul =  faktoriyelN/(faktoriyelR*faktoriyelFarkSonuc);
        System.out.println(formul);

    }
}