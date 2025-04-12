import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class ÖdevSayilariKüçüktenBüyügeSİralama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Sayıları küçükten büyüğe sıralayan program \n");

        System.out.print("bir sayı giriniz : ");
        int a = input.nextInt();

        System.out.print("bir sayı giriniz : ");
        int b = input.nextInt();

        System.out.print("bir sayı giriniz : ");
        int c = input.nextInt();

        if ((a < b) && (a < c)) {
            if (b < c) {
                System.out.println(a + " < " + b + " < " + c);

            } else if (c < b) {
                System.out.println(a + " < " + c + " < " + b);

            }
        } else if ((b < a) && (b < c)) {
            if (a < c) {
                System.out.println(b + " < " + a + " < " + c);

            } else if (c < a) {
                System.out.println(b + " < " + c + " < " + a);

            }
        } else if ((c < a) && (c < b)) {
            if (a < b) {
                System.out.println(c + " < " + a + " < " + b);

            } else if (b < a) {
                System.out.println(c + " < " + b + " < " + a);

            }
        } else {
            System.out.println("bir birine eşit sayı girmeyiniz");

        }

    }
}
