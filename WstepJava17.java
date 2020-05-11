import java.util.Scanner;

public class WstepJava17 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę całkowitą większą niż 1:");
        int n= scanner.nextInt();

         if (n<=1) {
             System.out.println("Źle podana liczba");
             return;
         }

         boolean isPrimeNumber= true;
          for (int i=2; i<=n; i++){
              if (n % i == 0){
                  isPrimeNumber = false;
                  break;
              }
          }
          if (isPrimeNumber) {
              System.out.println("Liczba pierwsza");
          }else{
              System.out.println("To nie jest liczba pierwsza");
          }
    }
}
