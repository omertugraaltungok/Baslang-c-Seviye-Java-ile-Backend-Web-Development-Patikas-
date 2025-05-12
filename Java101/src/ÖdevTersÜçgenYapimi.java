import java.util.Scanner;

public class ÖdevTersÜçgenYapimi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Basamak sayısını giriniz: ");
        int n = input.nextInt();

        int yıldız = 2 * n - 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= yıldız - 2 * i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
