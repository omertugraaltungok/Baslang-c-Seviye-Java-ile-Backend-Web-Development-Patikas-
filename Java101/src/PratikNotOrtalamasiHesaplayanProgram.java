/*Pratik - Not Ortalaması Hesaplayan Program
 * 
 * KOŞULLU İFADELERDE İF KULLANILMAYACAK 
 * Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sınav puanlarını
 * kullanıcıdan alan ve ortalamalarını hesaplayıp ekrana bastırılan programı yazın.

Ödev
Aynı program içerisinde koşullu ifadeler kullanılarak, **İF KULLANMADAN**
eğer kullanıcının ortalaması 60'dan büyük ise ekrana "Sınıfı Geçti" , küçük ise "Sınıfta Kaldı" yazsın.
 */

import java.util.Scanner;

public class PratikNotOrtalamasiHesaplayanProgram {
    public static void main(String[] args) throws Exception {
        
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Matematik notunuz : ");
            int Matematik = input.nextInt();

            System.out.print("Fizik notunuz : ");
            int Fizik = input.nextInt();

            System.out.print("Kimya notunuz : ");
            int Kimya = input.nextInt();

            System.out.print("Türkçe notunuz : ");
            int Türkçe = input.nextInt();

            System.out.print("Trih notunuz : ");
            int Tarih = input.nextInt();

            System.out.print("Müzik notunuz : ");
            int Müzik = input.nextInt();

            float toplam = (Matematik + Fizik + Kimya + Türkçe + Tarih + Müzik);
            float ort = toplam / 6 ;

            System.out.println("ortalamaniz " + ort);
            
            boolean sonuc = ort > 60 ;
            String durum = sonuc ? "Sinifi Geçti" : "Sinifta Kaldi" ;
            System.out.print(durum);
        }



    }
}
