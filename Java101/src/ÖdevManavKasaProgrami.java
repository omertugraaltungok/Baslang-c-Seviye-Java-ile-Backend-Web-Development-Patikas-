import java.util.Scanner;
public class ÖdevManavKasaProgrami {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Armut Kaç Kilo ? : ");
        float armut = input.nextFloat();
        armut *= 2.14f;

        System.out.print("Elma Kaç Kilo ? : ");
        float elma = input.nextFloat();
        elma *= 3.67f;

        System.out.print("Domates Kaç Kilo ? : ");
        float domates = input.nextFloat();
        domates *= 1.11f;

        System.out.print("Muz Kaç Kilo ? : ");
        float muz = input.nextFloat();
        muz *= 0.95f;

        System.out.print("Patlıcan Kaç Kilo ? : ");
        float patlican = input.nextFloat();
        patlican *= 5f;

        float toplam = armut + elma + domates + muz + patlican ;
        System.out.print("Toplam tutar : " + toplam);



    }
}
