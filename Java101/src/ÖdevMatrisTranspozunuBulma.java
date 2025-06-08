public class ÖdevMatrisTranspozunuBulma {

    public static void yazdir(int[][] matris) {
        for (int[] satir : matris) {
            for (int eleman : satir) {
                System.out.print(eleman + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matris = {
                { 2, 3, 4 },
                { 5, 6, 4 }
        };


        int[][] transpoze = new int[3][2];


        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[0].length; j++) {
                transpoze[j][i] = matris[i][j];
            }
        }


        System.out.println("Matris:");
        yazdir(matris);


        System.out.println("\nTranspoze:");
        yazdir(transpoze);

    }
}
