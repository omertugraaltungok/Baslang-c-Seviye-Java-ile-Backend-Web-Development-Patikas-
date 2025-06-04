import java.util.Arrays;
import java.util.Scanner;

public class ÖdevDizidekiElemanlariSiralama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Dizinin boyutu n : ");
        int n = input.nextInt();
        long[] list = new long[n];

        System.out.println("Dizinin elemanlarını giriniz :");

        for (int i = 0, j = 1; i < list.length; i++, j++) {
            System.out.print(j + ". Elemanı : ");
            Long sayi = input.nextLong();
            list[i] = sayi;
        }
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));

    }
}
