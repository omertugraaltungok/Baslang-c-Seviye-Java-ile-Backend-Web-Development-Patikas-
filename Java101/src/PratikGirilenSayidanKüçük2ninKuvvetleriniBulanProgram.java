/*
 * Ödev
 * Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini
 * ekrana yazdıran programı yazıyoruz.
 */

import java.util.Scanner;

public class PratikGirilenSayidanKüçük2ninKuvvetleriniBulanProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran program\nBir sayı giriniz : ");
        int sayi = input.nextInt();
        System.out.println("\n");

        System.out.println("Girilen sayıdan küçük 4 ün üssü olan sayılar ");
        for(int i=1;i<sayi;i*=4){
            System.out.print(i +" ");
        }System.out.println("\n");

        System.out.println("Girilen sayıdan küçük 5 ün üssü olan sayılar ");
        for(int j=1;j<sayi;j*=5){
            System.out.print(j +" ");
        }


    }
}
