public class Main {
    public static void main(String[] args) {
        for (int i =2; i<=100; i++){ // ilk sayımızı 1 den 100 e kadar döndürüyoruz
            boolean asal = true;
            for (int j =2; j<i; j++){ // ikinci sayımızı i den küçük yapıyoruz çünkü j=i zaten kendisi asal
                if(i %j==0){ // eğer i nin j ye bölümünden kalan 0 ise asal değildir boolen false olur
                    asal = false;
                    break;
                }

            }
            if (asal){ // asal değişkeni true gelirse ekrana yazdırır
                System.out.print(i + " ");
            }
        }
    }
}