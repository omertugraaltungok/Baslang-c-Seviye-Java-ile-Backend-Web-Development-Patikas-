/* BASİT HESAP MAKİNESİ 
   Ödev
 * SWİTCH CASE KULLANARAK YAPINIZ.
*/

import java.net.Socket;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
import javax.sound.midi.SoundbankResource;

public class PratikBasitHesapMakinesi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("BASİT HESAP MAKİNESİ\nBir sayı giriniz : ");
        float n1 = input.nextFloat();

        System.out.print("Bir sayı giriniz : ");
        float n2 = input.nextFloat();

        System.out.print("1-TOPLAMA\n2-ÇIKARMA\n3-BÖLME\n4-ÇARPMA\nİşlem Seçiniz : ");
        int select = input.nextInt();

        switch (select) {
            case 1:
                System.out.print("Toplama işlemi sonucu : " + (n1 + n2));
                break;
            case 2:
                System.out.print("Çıkarma işlemi sonucu : " + (n1 - n2));
                break;
            case 3:
                if (n2 == 0) {
                    System.out.println("Bir sayı 0 a bölünemez ");
                } else {
                    System.out.print("Bölme işlemi sonucu : " + (n1 / n2));
                }
                break;
            case 4:
                System.out.print("Çarpma işlemi sonucu : " + (n1 * n2));
        }


    }
}
