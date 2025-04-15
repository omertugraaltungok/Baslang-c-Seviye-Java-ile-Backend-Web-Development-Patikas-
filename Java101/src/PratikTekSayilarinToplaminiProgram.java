/*Ödev
 *Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve
 *girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.
 * 
 */

import java.util.Scanner;

public class PratikTekSayilarinToplaminiProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi , toplami = 0;

        do{
        System.out.print("Bir sayı giriniz : ");
        sayi = input.nextInt();
        if (sayi%2==0 && sayi%4==0){
            toplami += sayi;
            System.out.println(toplami);
        }
        }while(sayi%2==0);
    }
}
