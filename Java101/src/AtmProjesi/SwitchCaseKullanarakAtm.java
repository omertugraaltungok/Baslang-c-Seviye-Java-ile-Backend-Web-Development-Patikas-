package AtmProjesi;

import java.util.Scanner;

public class SwitchCaseKullanarakAtm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String kullaniciAdi, sifre;
        int kalanHak = 3, bakiye = 4000, işlem, krediBorcu = 300;

        while (kalanHak > 0) {
            System.out.print("X Banka Hoş Geldiniz\nKullanıcı adı: ");
            kullaniciAdi = input.nextLine();
            System.out.print("Parola : ");
            sifre = input.nextLine();
            if (kullaniciAdi.equals("omertugra") && (sifre.equals("omer123"))) {
                System.out.println("X Bankasına hoş geldiniz " + kullaniciAdi);
                do {
                    System.out.print("1-Para Yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgulama\n" +
                            "4-Kredi Kartı Borç Ödeme\n" +
                            "5-Çıkış yapmak\n" +
                            "Yapmak istediğiniz işlemi seçiniz : ");
                    işlem = input.nextInt();
                    switch (işlem) {
                        case 1:
                            System.out.print("yatırmak istediğiniz tutarı giriniz : ");
                            int tutar = input.nextInt();
                            bakiye += tutar;
                            System.out.println("Güncel Bakiye : " + bakiye);
                            break;
                        case 2:
                            System.out.print("Çekmek istediğiniz tutarı giriniz : ");
                            tutar = input.nextInt();
                            if (tutar > bakiye) {
                                System.out.println("Yetersiz Bakiye");
                            } else {
                                bakiye -= tutar;
                                System.out.println("Güncel Bakiye : " + bakiye);
                            }
                            break;
                        case 3:
                            System.out.println("Güncel Bakiyeniz : " + bakiye);
                            break;
                        case 4:
                            if (krediBorcu == 0) {
                            System.out.println("Kredi Kartı borcunuz bulunmamaktadır ");
                            } else {
                            System.out.print("Güncel Kredi Kartı borcunuz : " + krediBorcu
                                    + "\nYatırmak istediğiniz tutarı giriniz : ");
                            tutar = input.nextInt();
                            krediBorcu -= tutar;
                            }
                            break;
                    }
                } while (işlem != 5);

                break;

            } else {
                kalanHak--;
                if (kalanHak == 0) {
                    System.out.println("Hesabınız Bloke olmuştur Bankamızla iletişime geçini.");
                }
                System.out.println("Hatalı giriş denemesi kalan hakkınız : " + kalanHak);
            }

        }

    }
}
