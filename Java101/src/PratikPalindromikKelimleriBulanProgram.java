import java.util.Scanner;

public class PratikPalindromikKelimleriBulanProgram {

    static boolean isPalindrome(String str) {
        for (int i = 0, j = str.length() - 1; i < j; i++, j--) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
        }
        return true;
    }

    static boolean isPalindrome2(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }

        if (str.equals(reverse)) {
            return true;
        }
        return false;
    }

    static void toPrint(boolean isTrue, String str){
        if(isTrue){
            System.out.println(str + " Palindromik bir kelimedir");
        }else{
            System.out.println(str + " Palindromik bir kelime değildir");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("PALİNDROMİK kelime bulan program\nSorgulanacak kelimeyi giriniz : ");
        String str = input.nextLine();
        toPrint(isPalindrome(str), str);
        toPrint(isPalindrome2(str), str);


    }
}
