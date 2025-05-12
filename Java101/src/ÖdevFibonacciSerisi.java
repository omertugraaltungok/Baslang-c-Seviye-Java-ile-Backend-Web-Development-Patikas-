import java.util.Scanner;

public class ÖdevFibonacciSerisi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Fibonacci serisinde kaç eleman istiyorsunuz: ");
        int n = input.nextInt();

        int ilköncesi = 0, ilk = 1;

        System.out.print("Fibonacci serisi: " + ilköncesi + " " + ilk);

        for (int i = 3; i <= n; i++) {
            int son = ilköncesi + ilk;
            System.out.print(" " + son);
            ilköncesi = ilk;
            ilk = son;
        }

    }
}
