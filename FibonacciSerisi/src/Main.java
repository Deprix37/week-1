public class Main {
    public static void main(String[] args) {
        int elemanSayisi = 10;
        int ilkSayi = 0;  // serinin ilk sayısı
        int ikinciSayi = 1; // ikinci sayısı



        for (int i = 2; i < elemanSayisi; i++) { // ilk iki değişkenimi el ile girdiğim için ikiden bassalıyorum
            int yeniSayi = ilkSayi + ikinciSayi;
            System.out.println(ilkSayi + " + " + ikinciSayi + " = "+yeniSayi); //her rakama bir önceki rakamla toplayıp sonucu sağ tarafa yazdırıyorum

            ilkSayi = ikinciSayi; // sayılarımı yukarıda ki değikenlerime atıyorum
            ikinciSayi = yeniSayi;
        }
    }
}