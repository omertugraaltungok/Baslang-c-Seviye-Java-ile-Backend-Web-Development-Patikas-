import java.util.Scanner;
public class ÖdevVücutKitleİndeksiHesaplayanProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        float boy = input.nextFloat();

        System.out.print("Lütfen kilonuzu giriniz : ");
        float kilo = input.nextFloat();

        float indexs = kilo / (boy * boy);
        System.out.println(indexs);


    }
}
