import java.util.Scanner;
public class PratikDaireninAlaniniveCevresiniBulanProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Dairenin yarı çapını giriniz : ");
        int r = input.nextInt();

        System.out.print("Merkez açı ölçüsünü giriniz : ");
        int a = input.nextInt();

        double pi = 3.14 , alan = (pi * (r*r) * a / 360 );
        System.out.println("Yarı çapı " + r + " Merkez açı ölçüsü " + a + " Olan dairenin alanı : " + alan);


        /*
         * Ödev
           Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.

           𝜋 sayısını = 3.14 alınız.

           Formül : (𝜋 * (r*r) * 𝛼) / 360
         */
        




    }
}
