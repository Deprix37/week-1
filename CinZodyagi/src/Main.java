import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // kullanıcıdan doğum yılını girdirme ve sonuc değişkeni tanımlayıp mod işlemi ile doğum yılını 12 ye böldüğümde kalanı sonucu atma
        int dogumYili;
        Scanner input = new Scanner(System.in);
        System.out.print("Doğum Yılını giriniz: ");
        dogumYili = input.nextInt();
        int sonuc;
        sonuc = dogumYili % 12;
        String burc;

        // sonuc değerim ile caseler açılıyorum ve her kalan case sırasıyla çin zodyağına eş değer ve bunu yazdırıyorum
        switch (sonuc){
            // her bir case in içinde tanımladığım burc değişkenimi case göre değiştirip yazdırıyorum
            case 0:
                burc = "Maymun";
                System.out.println("Çin Zodyağı burcunuz: " + burc);
                break;
            case 1:
                burc = "Horoz";
                System.out.println("Çin Zodyağı burcunuz: " + burc);
                break;
            case 2:
                burc = "Köpek";
                System.out.println("Çin Zodyağı burcunuz: " + burc);
                break;
            case 3:
                burc = "Domuz";
                System.out.println("Çin Zodyağı burcunuz: " + burc);
                break;
            case 4:
                burc = "Fare";
                System.out.println("Çin Zodyağı burcunuz: " + burc);;
                break;
            case 5:
                burc = "Öküz";
                System.out.println("Çin Zodyağı burcunuz: " + burc);
                break;
            case 6:
                burc = "Kaplan";
                System.out.println("Çin Zodyağı burcunuz: " + burc);
                break;
            case 7:
                burc = "Tavşan";
                System.out.println("Çin Zodyağı burcunuz: " + burc);
                break;
            case 8:
                burc = "Ejderha";
                System.out.println("Çin Zodyağı burcunuz: " + burc);
                break;
            case 9:
                burc = "Yılan";
                System.out.println("Çin Zodyağı burcunuz: " + burc);
                break;
            case 10:
                burc = "At";
                System.out.println("Çin Zodyağı burcunuz: " + burc);
                break;
            default:
                burc = "Koyun";
                System.out.println("Çin Zodyağı burcunuz: " + burc);
        }
    }
}