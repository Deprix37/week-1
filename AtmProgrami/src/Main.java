import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userName, password;
        int right = 3;
        int balance = 1500;
        int select;
        while (right>0) {
            System.out.print("Kullanıcı adını giriniz : ");
            userName = input.nextLine();
            System.out.print("Parolanızı giriniz : ");
            password = input.nextLine();
            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Giriş Başarılı, Kodluyoruz bankasına hoş geldiniz. ");
                do {
                    System.out.println("1) Para yatırma \n 2)Para çekme \n " +
                            "3)Bakiye sorgulama \n 4)Çıkış");
                    System.out.print("Yapmak istediğiniz işlemi seçiniz: ");
                    select = input.nextInt();
                    switch (select){
                        case 1:
                            System.out.print("Yatırmak istediğiniz tutar : ");
                            int deposit = input.nextInt();
                            balance = deposit+balance;
                            break;
                        case 2:
                            System.out.print("Çekmek istediğiniz tutarı giriniz: ");
                            int withdraw = input.nextInt();
                            if (withdraw>balance){
                                System.out.println("Bakiye yetersiz!");
                            }else {
                                balance = balance-withdraw;
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz : " + balance);
                            break;
                        default:
                    }
                }while (select!=4);

                break;
            } else {
                right--;
                System.out.println("Hatalı Kullanıcı adı veya parola. Tekrar deneyiniz");
                if (right==0){
                    System.out.println("Hesabınız bloke olmuştur. Lüfen banka ile iletişime geçin");
                }else {
                    System.out.println("Kalan hakkınız: " + right);
                }
            }
        }

    }
}