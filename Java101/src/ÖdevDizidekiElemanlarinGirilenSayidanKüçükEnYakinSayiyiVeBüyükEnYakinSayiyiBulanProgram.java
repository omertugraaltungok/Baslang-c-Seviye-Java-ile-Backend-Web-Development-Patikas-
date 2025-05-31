import java.util.Scanner;
import java.util.Arrays;

public class ÖdevDizidekiElemanlarinGirilenSayidanKüçükEnYakinSayiyiVeBüyükEnYakinSayiyiBulanProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] Dizi = { 15, 12, 788, 1, -1, -778, 2, 0 };
        System.out.println("Dizi : " + Arrays.toString(Dizi));
        System.out.print("Girilen Sayı : ");
        int girilenDeger = input.nextInt();

        int girilendenKucuk = Integer.MAX_VALUE;
        int girilendenBuyuk = Integer.MIN_VALUE;

        boolean kucukBulundu = false;
        boolean buyukBulundu = false;

        for (int i : Dizi) {
            if (i < girilenDeger) {

                if (!kucukBulundu || (girilenDeger - i) < (girilenDeger - girilendenKucuk)) {
                    girilendenKucuk = i;
                    kucukBulundu = true;
                }
            }
            if (i > girilenDeger) {

                if (!buyukBulundu || (i - girilenDeger) < (girilendenBuyuk - girilenDeger)) {
                    girilendenBuyuk = i;
                    buyukBulundu = true;
                }
            }
        }

        System.out.println("Girilen sayıdan küçük en yakın sayı : " + girilendenKucuk);
        System.out.println("Girilen sayıdan büyük en yakın sayı : " + girilendenBuyuk);

    }
}
