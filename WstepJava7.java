import java.util.Scanner;

public class WstepJava7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę całkowitą dodatnią:");
        int liczba = scanner.nextInt();

        for (int i=1; i <= liczba; i+=2){
            System.out.println(i);
        }
    }
}
