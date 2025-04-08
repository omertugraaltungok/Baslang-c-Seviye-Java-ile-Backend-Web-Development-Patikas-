import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Kullanci adinizi girin : ");
        String kullaniciadi = inp.nextLine();

        System.out.print("Şifrenizi girin: ");
        String sifre = inp.nextLine();

        if (kullaniciadi.equals("Mahzun") && sifre.equals("Mahzun123")) {
            System.out.println("Başarıyla giriş yaptınız!");
        } else {
            System.out.print("Hatalı giriş denemsi:\nŞifre Değiştirilsinmi\n1-EVET . 0-HAYIR : ");
            int sifredegis = inp.nextInt();
            inp.nextLine();

            if (sifredegis == 1) {

                System.out.print("Yeni şifrenizi girin: ");
                sifre = inp.nextLine();

                if (sifre.equals("Mahzun123")) {
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                } else {
                    System.out.println("Şifre oluşturuldu.");
                }
            }
        }



    }
}