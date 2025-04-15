/*
 * Ödev
 *Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan
 *3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.
 */

import java.util.Scanner;

public class Ödev3ve4TamBölünenSayilarinOrtalamasiniHesaplayanProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi , ortalama , tamBölünenler = 0 , sayiAdedi = 0; 

        System.out.print("Bir sayı giriniz : ");
        sayi = input.nextInt();

        for(int i=0; i<sayi ; i++){
            if ((i>0) && (i%3==0) && (i%4==0)){
                System.out.print(i + " ");
                tamBölünenler += i;
                sayiAdedi++;
            }
        }System.out.println();
        System.out.print("3 ve 4'e tam bölünen sayıların ort. = " + tamBölünenler / sayiAdedi);

    }
}
