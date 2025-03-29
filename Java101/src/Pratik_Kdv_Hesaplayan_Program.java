/* Pratik - KDV Tutarı Hesaplayan Program

KOŞULLU İFADELERDE İF KULLANILMAYACAK 
Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran programı yazın.
(Not : KDV tutarını 18% olarak alın)
KDV'siz Fiyat = 10;
KDV'li Fiyat = 11.8;
KDV tutarı = 1.8;
 
Ödev
Aynı program içerisinde koşullu ifadeler kullanılarak, **İF KULLANMADAN**
Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 ,
tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız. 

 */

import java.util.Scanner;

public class Pratik_Kdv_Hesaplayan_Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    
        System.out.print("tutari giriniz : ");
        Float tutar = input.nextFloat();
    
    
        boolean indrm = tutar <= 1000 ; 
    
        float kdv = indrm ? tutar * 0.18f : tutar * 0.08f ;
        System.out.println("kdv tutari " + kdv + " TL");
    
    
        float kdvliTutar = tutar + kdv ;
        System.out.println("kdv'li tutar " + kdvliTutar + " TL"); 

        
    }
}
