import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz: ");
        int number = input.nextInt(); // Kullanıcıdan kaç tane sayı gireceğini aldım
        int enBuyukSayi = 0; int enKucukSayi = 0; // burada ki değişkenlerimi döngüde ki sayıları saklamak için aldım
        int i = 1;
        do {  // kullanıcı en az 1 kere sayı gireceği için do while döngüsünü kullanıyorum
            System.out.print(i+". Sayıyı giriniz: ");
            int tempNumber = input.nextInt(); // döngü her döndüğünde kullanıcıdan yeni bir sayı alıyorum
            if (tempNumber<enKucukSayi){
                enKucukSayi = tempNumber;  // eğer dönküde ki sayı küçük bir sayı ise bu değişkenimde saklıyorum

            } else if (tempNumber>enBuyukSayi) {
                enBuyukSayi = tempNumber; //eğer dönküde ki sayı büyük bir sayı ise bu değişkenimde saklıyorum
            }
            i++;

        }while (i<=number); // döngümü kullanıcının girmek isteyeceği sayı kadar döndürüyorum
        System.out.println("En büyük sayı: " + enBuyukSayi);
        System.out.println("En küçük sayı: " + enKucukSayi);


    }
}