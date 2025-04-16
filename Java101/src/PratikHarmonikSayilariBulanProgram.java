import java.util.Scanner;

public class PratikHarmonikSayilariBulanProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz : ");
        int n = input.nextInt();

        double işlem = 0.0;
        for (double i = 1; i <= n; i++) {
            işlem += (1 / i);
        }

        System.out.print(işlem);
    }
}
