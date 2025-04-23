import java.util.Scanner;

public class PratikYildizlarİleÜçgenYapimi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz : ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= (2 * i) - 1; k++) {
                System.out.print("*");
            }

            System.out.println();

        }

        
    }
}
