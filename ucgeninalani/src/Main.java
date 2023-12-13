import java.util.Scanner;
public class Main {

    /*Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.
    Formül
    Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢
     𝑢 = (a+b+c) / 2
    Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐) */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // programımda kullanıcıdan alacağım ve alan için gerekli değişkenleri tanımlıoyorum.
        int a,b,c;
        double u, d,  cevre;
        System.out.print("Birinci kenarı giriniz: ");
        a = input.nextInt();
        System.out.print("İkinci kenarı giriniz: ");
        b = input.nextInt();
        System.out.print("Üçüncü kenarı giriniz: ");
        c = input.nextInt();
        //formuldeki gibi u değişkenimi bulup çevreyi hesaplatıp ekrana yazdıyırorum
        u = (a + b + c) / 2;
        cevre = u *2 ;
        System.out.println("Üçgeninizin çevresi : " + cevre);
        // d  değişkenim burada alanın karesini göstermekte alanın karesini buluyorum
        d =  u * (u-a) * (u-b) * (u-c);
        // math formulünden yararlanıp karesini bulmuş olduğum alanın karekkökünü yazdırıyorum.
        System.out.println("Üçgenin alanı ; "+ Math.sqrt(d));

    }
}
