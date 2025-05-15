import java.util.Scanner;

public class ÖdevDeseneGöreMetotOluşturma {

    static void desen(int n, int nKopya, boolean azaltmaAşaması) {
        System.out.print(n + " ");

        if (azaltmaAşaması) {
            if (n <= 0) {
                desen(n + 5, nKopya, false);
            } else {
                desen(n - 5, nKopya, true);
            }
        } else {
            if (n == nKopya) {
                return;
            }
            desen(n + 5, nKopya, false);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int sayi = scan.nextInt();

        desen(sayi, sayi, true);
    }
}
