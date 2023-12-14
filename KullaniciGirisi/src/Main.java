import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // kullanıcıdan kullacını adı ve şifre girmesini istiyorum
        Scanner input = new Scanner(System.in);
        String userName, password;
        String ysifre, secim;
        System.out.print("Kullanıcı adınız: ");
        userName = input.nextLine();
        System.out.print("Şifrenizi giriniz: ");
        password = input.nextLine();
        // giriş yapılan bilgilerin her ikisi doğru ise ekrana giriş yaptınız yazdırıyorum.
        if (userName.equals("patika") && password.equals("java123")) {
            System.out.println("Giriş yaptınız ! ");
            // eğer kullanıcı adı yanlış ama parola doğru ise kullanıcı adının yanlış olduğunu bildiriyorum
        } else if ((userName != "patika") && (password.equals("java123"))) {
            System.out.println("kullanıcı adınız yanlış");

            // burada koşul durumuna kullanıcı adı doğruysa fakat parola yanlışsa şeklinde koşul bloğuna giriyorum
        } else if (userName.equals("patika") && password != "java123") {
            System.out.println("Şifreniz yanlış");
            //yukarıda ekrana şifre yanlış yazdırıyorum eğer şifre sıfılamak isterse y/n (yes or no şeklinde koşula alıyorum)
            System.out.print("Şifrenizi sıfırlamak ister misiniz ? y/n: ");
            // kullanıcının tercihini secim değişkenine atadım
            secim = input.nextLine();
            // aşağıda y yi seçmesi durumda kullanıcıdan yeni şifre alıyorum tekrar koşula sokup eski şire ile aynıysa hata yazdırıyorum.
            if (secim.equals("y")) {
                System.out.print("Yeni şifrenizi giriniz: ");
                ysifre = input.nextLine();
                if (ysifre.equals("java123")) {
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                    // yukarıda ki blokta geriye kalan koşulumuz şifrenin eski şifreyle aynı olmaması durumu ve yeni şifre oluşuturulduyu yazdırıyorum
                } else {
                    System.out.println("Şifre oluşturuldu");
                }
            }
        }


    }
}