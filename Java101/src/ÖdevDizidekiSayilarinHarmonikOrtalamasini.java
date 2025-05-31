public class ÖdevDizidekiSayilarinHarmonikOrtalamasini {
    public static void main(String[] args) {
        int[] list = { 1, 3, 55, 12, 45, 78 };
        double Process = 1;
        double average;

        //elemanların harmonik serisi
        for (int i = 2, j = 1; i <= list.length; i++) {
            Process += j/i;
        }

        // Harmonik Ortalama formülü : n (eleman sayısı) / elemanların harmonik serisi
        average = list.length/Process;
        System.out.println(average);
    }
}
