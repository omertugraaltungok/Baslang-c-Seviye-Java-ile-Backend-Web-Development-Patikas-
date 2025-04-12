import java.util.Scanner;
public class PratikHavaSicakliğinaGöreEtkinlikÖnerme {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    
        System.out.println("Hava Sıcaklığına Göre Etkinlik Öneren Program \n");

        System.out.print("Sıcaklık giriniz : ");
        int sıcaklık = input.nextInt();

        if(sıcaklık <5){
            System.out.print("Kayak yapabilirsiniz ");

        }else if (sıcaklık >= 10 && sıcaklık <=15){
            System.out.println("Sinemeya ve Pikniğe gidebilirsiniz");

        }else if (sıcaklık >= 5 && sıcaklık <= 15){
            System.out.println("Sinemaya gidebilirsiniz");

        }else if (sıcaklık >= 10 && sıcaklık <= 25){
            System.out.println("Pikniğe gidebilirsiniz");

        }else if (sıcaklık > 25){
            System.out.println("Yüzmeye gidebilirsiniz");

        }


    }
}
