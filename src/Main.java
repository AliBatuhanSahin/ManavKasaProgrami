import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double armut, elma, domates, muz, patlican;
        armut = 2.74;
        elma = 3.67;
        domates = 1.11;
        muz = 0.95;
        patlican = 5.00;

        Scanner fiyat = new Scanner(System.in);

        System.out.print("Armut Kaç Kilo? : ");
        double armutKilo = fiyat.nextDouble();

        System.out.print("Elma Kaç Kilo? : ");
        double elmaKilo = fiyat.nextDouble();

        System.out.print("Domates Kaç Kilo? : ");
        double domatesKilo = fiyat.nextDouble();

        System.out.print("Muz Kaç Kilo? : ");
        double muzKilo = fiyat.nextDouble();

        System.out.print("Patlıcan Kaç Kilo? : ");
        double patlicanKilo = fiyat.nextDouble();

        double tutar = (armut *armutKilo) + (elma * elmaKilo) + (domates * domatesKilo) + (muz * muzKilo) + (patlican * patlicanKilo);

        System.out.println("Toplam Tutar :" + tutar);





    }
}