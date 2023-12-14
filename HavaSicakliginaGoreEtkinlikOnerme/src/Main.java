import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // kullanıcıdan sıcaklık girdisi alıyorum
        int heat;
        System.out.print("Sıcaklık giriniz: ");
        heat = input.nextInt();
        // koşul durumlarına sokuyorum.
        if (heat < 5) {
            System.out.println("Kayak yapabilirsiniz.");
        } else if (heat >= 5 && heat <= 9) {
            System.out.println("Sinemaya gidebilirsiniz.");
            // burada matematik olarak daha pratik çözüm yapıp kesişim noktalarına farklı bir koşul koyuyorum
        } else if (heat > 9 && heat <= 15) {
            System.out.println("sinemaya gidebilirsiniz\n pikniğe gidebilirsiniz");

        } else if (heat >= 15 && heat <= 25) {
            System.out.println("Pikniğe gidebilirsiniz");
        } else {
            System.out.println("Yüzmeye gidebilirsiniz");
        }
    }
}