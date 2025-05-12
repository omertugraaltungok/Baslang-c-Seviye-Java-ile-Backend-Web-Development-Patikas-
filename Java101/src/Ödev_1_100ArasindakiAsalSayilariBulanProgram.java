import java.util.Scanner;

public class Ödev_1_100ArasindakiAsalSayilariBulanProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int i = 2; i <= 100; i++) {
            boolean asalmi = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    asalmi = false;
                    continue;
                }
            }

            if (asalmi) {
                System.out.print(i + " ");
            }
        }
        

    }
}
