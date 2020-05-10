import java.util.Scanner;

public class WstepJava9 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę całkowitą dodatnią:");
        int n= scanner.nextInt();

        for (int i=1; i <= n; i *=2 ){
            System.out.println(i);
        }
    }
}
