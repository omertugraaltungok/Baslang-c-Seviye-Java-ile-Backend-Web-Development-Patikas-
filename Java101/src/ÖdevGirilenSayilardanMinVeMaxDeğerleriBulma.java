import java.util.Scanner;

public class ÖdevGirilenSayilardanMinVeMaxDeğerleriBulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int büyükSayı = Integer.MIN_VALUE;
        int küçükSayı = Integer.MAX_VALUE;

        System.out.print("Kaç tane sayı gireceksiniz: ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print(i + " Sayıyı giriniz: ");
            int sayı = input.nextInt();
            if (sayı > büyükSayı) {
                büyükSayı = sayı;
            }
            if (sayı < küçükSayı) {
                küçükSayı = sayı;
            }

        }
        System.out.println("En büyük sayı: " + büyükSayı + "\nEn küçük sayı: " + küçükSayı);

    }
}
