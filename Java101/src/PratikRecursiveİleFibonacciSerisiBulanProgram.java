import java.util.Scanner;

public class PratikRecursiveİleFibonacciSerisiBulanProgram {

    //Fibonacci serisi, her sayının kendinden önceki ile toplanması sonucu oluşan bir sayı dizisidir 0 1 1 2 3 5 8 13 21 34....
    
    static int fibo (int n){
        if (n == 1)
            return 1;
        if (n == 0)
            return 0;
        return fibo(n - 1) + fibo(n-2);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Fibonacci serisinde kaç eleman istiyorsunuz: ");
        int x = input.nextInt();

        for (int i = 0; i <= x; i++){
            System.out.println(fibo(i));
        }

    }

}
