import java.util.Scanner;

public class ÖdevÜsHesabiYapanProgram {

    static int Exponentiation(int Base, int Exponent) {

        if (Exponent == 0) {
            return 1;
        } else {
            return Base * Exponentiation(Base, Exponent - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Taban değerini giriniz :");
        int taban = scan.nextInt();

        System.out.print("Üs değerini giriniz :");
        int üs = scan.nextInt();

        if (üs < 0) {
            System.out.println("Negatif üs desteklenmiyor.");
        } else {
            System.out.println(Exponentiation(taban, üs));
        }

    }
}
