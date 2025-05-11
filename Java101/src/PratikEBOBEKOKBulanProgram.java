import java.util.Scanner;

public class PratikEBOBEKOKBulanProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 1, ebob = 1, ekok = 1;

        System.out.print("N1 sayısını giriniz : ");
        int n1 = input.nextInt();

        System.out.print("N1 sayısını giriniz : ");
        int n2 = input.nextInt();

        while (i <= n1 && i <= n2) {
            if (n1 % i == 0 && n2 % i == 0) {
                ebob = i;
            }
            i++;
        }

        ekok = n1 * n2 / ebob;
        System.out.println("Ebob : " + ebob + "\nEkok : " + ekok);

    }
}
