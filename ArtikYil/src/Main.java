import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int yil;
        System.out.print("Yıl Giriniz: ");
        yil = input.nextInt();

        // ilk koşulum olan 4 ün katlarını koşuluma sokuyorum
        if (yil % 4 == 0) {
            // 4 e bölünenlerden 100 ün katı olanları tekrar koşula sokuyorum
            if (yil % 100 ==0){
                // 100 ün katlarından sadece 400 e tam bölünenleri ayırıyorum ve artık yıl olduğunu yazdırıyorum
                if(yil % 400 ==0){
                    System.out.println(yil + " Bir artık yıldır" );
                }// 100 ün katıysa fakat 400 e tam bölüünmeyenleri buluyorum
                else {
                    System.out.println("Artık bir yıl değildir");
                }
            } else  {// sayı eğer 4 e tam bölünüyorsa aama 100 ün katı değilse koşuluna alıyorum
                System.out.println(" Bir artık yıldır.");
            }
        }
        else {// ilk içtığım koşulun tersi eğer 4 e bölünmüyorsa
            System.out.println("Artık bir yıl değildir");
        }

    }
}