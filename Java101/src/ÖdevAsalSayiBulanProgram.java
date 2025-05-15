import java.util.Scanner;

public class ÖdevAsalSayiBulanProgram {
    static boolean asal(int n, int i) {
        if (n <= 1)//en küçük asal sayı 2 olduğu için yani 1  ve negatif sayılar asal sayı değildir
            return false;
        if (i == n)// i n"e kadar n"ni bölmeden n"e geldiyse artık n de dursun
            return true;
        if (n % i == 0)
            return false;

        return asal(n, i + 1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı giriniz :");
        int sayı = scan.nextInt();

        if (asal(sayı, 2)) { // burada n" e girilen sayıyı i" ye ise 2 değerini verdik.
            System.out.println(sayı + " Bir asal sayıdır");
        } else {
            System.out.println(sayı + " Bir asal sayı değildir");
        }

    }
}
