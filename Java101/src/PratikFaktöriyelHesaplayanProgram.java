import java.util.Scanner;

public class PratikFaktöriyelHesaplayanProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int toplam = 1, toplam2 = 1, toplam3 = 1, j = 1, c = 1, sayi;

        System.out.print("Faktöriyal hesaplama\nBir sayı giriniz : ");
        sayi = input.nextInt();

        for (int i = 1; i <= sayi; i++) {
            toplam *= i;
        }
        System.out.println(toplam);

        while (j <= sayi) {
            toplam2 *= j;
            j++;
        }
        System.out.println(toplam2);

        do {
            toplam3 *= c;
            c++;
        } while (c <= sayi);

        System.out.println(toplam3);

        /* for , while ve do while döngüleri ile faktöriyal hesapladım */

    }
}
