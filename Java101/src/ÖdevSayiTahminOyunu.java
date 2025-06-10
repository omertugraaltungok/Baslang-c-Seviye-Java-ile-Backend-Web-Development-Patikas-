import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ÖdevSayiTahminOyunu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int number = rand.nextInt(100);
        int selected, right = 0;
        int[] wrong = new int[5];
        boolean isWin = false;
        boolean isWrong = false;

        while (right < 5) {
            System.out.print("Bir sayı giriniz : ");
            selected = input.nextInt();

            if (selected < 0 || selected > 99) {
                System.out.println("Lütfen 0-100 arasında bir değer giriniz !");
                if (isWrong) {
                    right++;
                    System.out.println("Çok fazla hatalı giriş denemesi. Kalan hak : " + (5 - right));
                } else {
                    isWrong = true;
                    System.out.println("Bir daha hatalı denemenizde hakkınızdan düşülecektir !");
                }
                continue;
            }

            if (selected == number) {
                System.out.println("Tebrikler, doğru tahmin ! Tahmin ettiğini sayı : " + number);
                isWin = true;
                break;
            } else {
                System.out.println("Hatalı bir sayı girdiniz");
                if (selected > number) {
                    System.out.println(selected + " sayısı, gizli sayıdan büyüktür.");
                } else {
                    System.out.println(selected + " sayısı gizli sayıdan küçüktür");
                }
                wrong[right++] = selected;
                System.out.println("Kalan hakkınız : " + (5 - right));

            }
        }

        if (!isWin) {
            System.out.println("Kaybettiniz :)");
            if (!isWrong) {
                System.out.println("Tahminleriniz : " + Arrays.toString(wrong));
            }
            System.out.println("GİZLİ SAYI => " + number);
        }

    }
}
