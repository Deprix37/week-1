/*Manav Kasa Programı
        Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.

        Meyveler ve KG Fiyatları

        Armut : 2,14 TL
        Elma : 3,67 TL
        Domates : 1,11 TL
        Muz: 0,95 TL
        Patlıcan : 5,00 TL*/
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double armut = 2.14;
        double elma = 3.67;
        double domates = 1.11;
        double muz = 0.95;
        double patlican = 5.0;
        Scanner input = new Scanner(System.in);
        double armutKg, elmaKg, domatesKg, muzKg, patlicanKg, toplam;
        System.out.print("Armut Kaç Kilo ? : ");
        armutKg = input.nextDouble();
        System.out.print("Elma Kaç Kilo ? : ");
        elmaKg = input.nextDouble();
        System.out.print("Domates Kaç Kilo ? : ");
        domatesKg = input.nextDouble();
        System.out.print("Muz kaç Kilo ? : ");
        muzKg = input.nextDouble();
        System.out.print("Patlıcan Kaç Kilo ? : ");
        patlicanKg = input.nextDouble();
        toplam = (armutKg * armut) + (elmaKg*elma) + (domatesKg*domates) + (muzKg*muz) + (patlicanKg*patlican);
        System.out.println("Toplam Tutar : " + toplam + " TL ");



    }
}