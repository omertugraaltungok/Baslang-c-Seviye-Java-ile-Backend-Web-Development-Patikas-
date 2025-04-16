import java.util.Scanner;

public class PratikÜslüSayiHesaplayanProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int toplam = 1;

        System.out.print("Bir sayı giriniz : ");
        int x = input.nextInt();

        System.out.print("Bir sayı giriniz : ");
        int y = input.nextInt();

        for(int i=1; i<=y; i++){
            toplam *= x;
        }
        System.out.println(toplam);

    }
}
