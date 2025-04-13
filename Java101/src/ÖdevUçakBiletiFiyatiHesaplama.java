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
Author: Ömer Tuğra Altungök
*/

import java.util.Scanner;

public class ÖdevUçakBiletiFiyatiHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float km , yaş , normalTutar = 0 , yaşİndirmi = 0 , yaşİndirmiUygulanmışTutar = 0,
        gidişDönüşBiletİndirimi = 0, gidişDönüşBiletİndirimiUygulanmışTutatar = 0 ;
        
        System.out.println("Uçak Bileti Fiyatı Hesaplama \n");

        System.out.print("Mesafeyi km türünden giriniz : ");
        km = input.nextFloat();
        if (km < 0){
            System.out.print("Hatalı Veri Girdiniz !");
        }

        System.out.print("Yaşınızı giriniz : ");
        yaş = input.nextFloat();
        if (yaş < 1){
            System.out.print("Hatalı Veri Girdiniz !");
        }

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ) : ");
        int yolculukTipi = input.nextInt();
        if (!((yolculukTipi == 1) || (yolculukTipi == 2))){
            System.out.print("Hatalı Veri Girdiniz !");
        }

        normalTutar = (float) (km * 0.10);
        System.out.println("Normal tutar = " + normalTutar);

        if (yaş < 12){
            yaşİndirmi = (normalTutar / 100) * 50;
            yaşİndirmiUygulanmışTutar = normalTutar - yaşİndirmi;
            System.out.println("Yaş indirimi uygulanmış tutar = " + yaşİndirmiUygulanmışTutar);
        }else if ((yaş >= 12) && (yaş <= 24)){
            yaşİndirmi = (normalTutar / 100) * 10;
            yaşİndirmiUygulanmışTutar = normalTutar - yaşİndirmi;
            System.out.println("Yaş indirimi uygulanmış tutar = " + yaşİndirmiUygulanmışTutar);
        }else if (yaş > 65){
            yaşİndirmi = (normalTutar / 100) * 30;
            yaşİndirmiUygulanmışTutar = normalTutar - yaşİndirmi;
            System.out.println("Yaş indirimi uygulanmış tutar = " + yaşİndirmiUygulanmışTutar);
        }

        switch(yolculukTipi){
            case 2:
            gidişDönüşBiletİndirimi = (yaşİndirmiUygulanmışTutar / 100) *20;
            gidişDönüşBiletİndirimiUygulanmışTutatar = yaşİndirmiUygulanmışTutar - gidişDönüşBiletİndirimi;
            if (gidişDönüşBiletİndirimiUygulanmışTutatar == 0.0){
                gidişDönüşBiletİndirimi = (normalTutar / 100) *20;
                gidişDönüşBiletİndirimiUygulanmışTutatar = normalTutar - gidişDönüşBiletİndirimi;
            }
            System.out.println("Gidiş Dönüş Bilet İndirimi uygulanmış tutar = " + gidişDönüşBiletİndirimiUygulanmışTutatar);
                break;
        }

        System.out.println("BİZİ TERCİH ETTİĞİNİZ İÇİN TEŞEKKÜRLER... İYİ YOLCULUKLAR DİLERİZ");

    }
}
