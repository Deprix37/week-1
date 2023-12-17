public class Main {
    public static void main(String[] args) {

        // kişi klavyeden değil 3 basamaklı sayılar olduğu için 100 ile 999 arasında ki sayılar için döngü kuruyoruz
        for (int i = 100; i <= 999; i++) {
            int armstrong = 0;
            int tempNumber = i;
            int basamakSayisi = 0;
            int basValue;
            int basPow;

            // Basamak sayısını bulma
            while (tempNumber != 0) {
                tempNumber /= 10;
                basamakSayisi++;
            }

            tempNumber = i; // Gecici sayıyı sıfırla

            // Armstrong sayısı kontrolü
            while (tempNumber != 0) {
                basValue = tempNumber % 10;
                basPow = 1; // Her basamak için basPow sıfırlanmalı

                // basamak ile basamak sayısının üssünü alma işlemi
                for (int j = 1; j <= basamakSayisi; j++) {
                    basPow *= basValue;
                }

                armstrong += basPow;
                tempNumber /= 10;
            }

            if (armstrong == i) {
                System.out.println(i);
            }
        }
    }
}