import java.util.Scanner;

public class ÖdevMükemmelSayiBulanProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int toplam = 0;

        System.out.print("Bir sayı giriniz: ");
        int sayi = input.nextInt();

        for (int j = 1; j < sayi; j++) {
            if (sayi % j == 0) {
                toplam = +sayi;
            }
        }

        if (toplam == sayi){
            System.out.print(sayi + " Mükemmel sayıdır");
        }else {
            System.out.println(sayi + " Mükemmel sayı değildir");
        }

    }
}
