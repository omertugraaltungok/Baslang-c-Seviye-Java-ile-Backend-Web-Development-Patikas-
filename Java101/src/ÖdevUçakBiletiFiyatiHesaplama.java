/*Ödev - Uçak Bileti Fiyatı Hesaplama
Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın.
Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın.
Mesafe başına ücret 0,10 TL / km olarak alın.
İlk olarak uçuşun toplam fiyatını hesaplayın ve sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;

Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır.
Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.
 */

import java.util.Scanner;

public class ÖdevUçakBiletiFiyatiHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float km, normalTutar = 0, yaşİndirimi = 0, yaşİndirimiUygulanmişTutar = 0,
        gidişDönüşİndirimi = 0, gidişDönüşİndirimiUygulanmişlitutar = 0;
        boolean isError = false;

        System.out.print("Mesafeyi km türünden giriniz : ");
        km = input.nextFloat();
        if (km < 1) {
            isError = true;
        }

        System.out.print("Yaşınızı giriniz : ");
        int yaş = input.nextInt();
        if (yaş < 1) {
            isError = true;
        }

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ) : ");
        int yolculukTipi = input.nextInt();
        if ((yolculukTipi == 1) || (yolculukTipi == 2)) {
            isError = false;
        } else {
            isError = true;
        }

        normalTutar = (float) (km * 0.10);
        System.out.println("Normal Tutar = " + normalTutar);

        if (yaş < 12) {
            yaşİndirimi = normalTutar / 2;
            yaşİndirimiUygulanmişTutar = normalTutar - yaşİndirimi;
            System.out.println("Yaş indirimi uygulanmış tutuar = " + yaşİndirimiUygulanmişTutar);
        } else if ((yaş >= 12) && (yaş <= 24)) {
            yaşİndirimi = (normalTutar / 100) * 10;
            yaşİndirimiUygulanmişTutar = normalTutar - yaşİndirimi;
            System.out.println("Yaş indirimi uygulanmış tutar = " + yaşİndirimiUygulanmişTutar);
        } else if (yaş > 65) {
            yaşİndirimi = (normalTutar / 100) * 30;
            yaşİndirimiUygulanmişTutar = normalTutar - yaşİndirimi;
            System.out.println("Yaş indirimi uygulanmış tutar = " + yaşİndirimiUygulanmişTutar);
        }

        switch (yolculukTipi) {
            case 2:
                gidişDönüşİndirimi = (yaşİndirimiUygulanmişTutar / 100) * 20;
                gidişDönüşİndirimiUygulanmişlitutar = yaşİndirimiUygulanmişTutar - gidişDönüşİndirimi;
                if (gidişDönüşİndirimiUygulanmişlitutar == 0.0) {
                    gidişDönüşİndirimi = (normalTutar / 100) * 20;
                    gidişDönüşİndirimiUygulanmişlitutar = normalTutar - gidişDönüşİndirimi;
                }
                System.out.println("Gidiş Dönüş Bilet İndirimi uygulanmış tutar = " + gidişDönüşİndirimiUygulanmişlitutar);
                break;
        }

        if (isError){
            System.out.print("Hatalı Veri Girdiniz !");
        }

    }
}
