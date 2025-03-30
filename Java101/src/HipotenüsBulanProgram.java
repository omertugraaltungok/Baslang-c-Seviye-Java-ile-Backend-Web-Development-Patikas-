import java.util.Scanner;
public class HipotenüsBulanProgram {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

       System.out.print("a kenarı giriniz ; ");
       float k1 = input.nextFloat();

       System.out.print("b kenarı giriniz : ");
       float k2 = input.nextFloat();
       
       System.out.print("c kenarı giriniz : ");
       float k3 = input.nextFloat();

       float cevre = (k1 + k2 + k3 ) / 2 ;
       float alan = (float) Math.sqrt(cevre * (cevre - k1) * (cevre - k2) * (cevre - k3)) ;

       System.out.println("Üçgenin çevresi : " + 2*cevre);
       System.out.println("üçgenin alanı : " + alan);
    }
}
