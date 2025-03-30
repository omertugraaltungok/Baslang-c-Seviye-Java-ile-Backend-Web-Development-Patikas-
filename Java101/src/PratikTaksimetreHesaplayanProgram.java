import java.util.Scanner;
public class PratikTaksimetreHesaplayanProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Mesafeyi Km cinsinden giriniz : ");
        float km = input.nextFloat();

        float tutar = km * 2.20f ;
        tutar += 10 ;
        tutar = (tutar < 20 ) ? 20 : tutar ; 
       
        System.out.println(tutar + " TL");

    }   
}

