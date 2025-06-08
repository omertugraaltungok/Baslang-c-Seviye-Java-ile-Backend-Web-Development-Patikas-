import java.util.HashMap;
import java.util.Map;

public class ÖdevDizidekiElemanlarinFrekansi {
    public static void main(String[] args) {
        int[] dizi = { 10, 20, 20, 10, 10, 20, 5, 20 };

        System.out.println("Tekrar Sayıları ");

        Map<Integer, Integer> tekrarSayilari = new HashMap<>();

        for (int sayi : dizi) {
            tekrarSayilari.put(sayi, tekrarSayilari.getOrDefault(sayi, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : tekrarSayilari.entrySet()) {
            System.out.println(entry.getKey() + " sayısı " + entry.getValue() + " kere tekrar edildi.");
        }
    }
}
