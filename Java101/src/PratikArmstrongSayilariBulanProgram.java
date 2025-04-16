/*Java döngüler ile sayının armstrong sayı olup olmadığını bulan programı yazıyoruz.

Armstrong Sayı Nedir ?
N haneli bir sayının basamaklarının n’inci üstlerinin toplamı,
sayının kendisine eşitse, böyle sayılara Armstrong sayı denir.

Örneğin 407 sayısını ele alalım. (4^3)+ (0^3)+(7^3) = 64+0+343 = 407 sonucunu verir.
Bu da 407 sayısının armstrong bir sayı olduğunu gösterir.

1342 sayısına da bakalım. (1^4)+(3^4)+(4^4)+(2^4) =1+81+256+16=354 sayısı 1342’ye eşit olmadığı için
armstrong sayı olmaz.

1634=1^4+6^4+3^4+4^4=1+1296+81+256=1634

54748=5^5+4^5+7^5+4^5+8^5=3125+1024+16807+1024+32768=54748 */

import java.util.Scanner;

public class PratikArmstrongSayilariBulanProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int basSayisi = 0;
        int sonBasamakDeğeri;
        int toplam;
        int armstrongSonuç = 0;

        System.out.print("Bir sayı giriniz : ");
        int sayi = input.nextInt();

        int sayiKopyasi = sayi;

        // Basamak sayısı bulma
        while (sayiKopyasi != 0) {
            sayiKopyasi /= 10;
            basSayisi++;
        }
        sayiKopyasi = sayi;

        // Armstrong
        while (sayiKopyasi != 0) {
            sonBasamakDeğeri = sayiKopyasi % 10;
            toplam = 1;
            for (int i = 1; i <= basSayisi; i++) {
                toplam *= sonBasamakDeğeri;
            }
            armstrongSonuç += toplam;
            sayiKopyasi /= 10;
        }

        if (armstrongSonuç == sayi) {
            System.out.println(sayi + " Bir Armstrong sayıdır.");
        } else {
            System.out.println(sayi + " Bir Armstrong sayı değildir.");
        }

    }
}
