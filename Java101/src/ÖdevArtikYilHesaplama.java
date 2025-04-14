import java.util.Scanner;

public class ÖdevArtikYilHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean artıkYılMesj = false;

        System.out.print("Artık YIl Hesaplama ~\nYıl Giriniz : ");
        int yıl = input.nextInt();

        if (yıl % 4 == 0) {
            artıkYılMesj = true;
            if (yıl % 100 == 0) {
                artıkYılMesj = false;
                if (yıl % 400 == 0) {
                    artıkYılMesj = true;
                }
            }
        }

        if (artıkYılMesj) {
            System.out.println(yıl + " bir artık yıldır !");
        } else {
            System.out.println(yıl + " bir artık yıl değildir !");
        }

    }
}
