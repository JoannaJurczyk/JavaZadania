import java.util.Scanner;

public class WstepJava16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę całkowitą:");
        int liczba = scanner.nextInt();

        for(int i= 1; i <= liczba; i++){
            if (liczba % i == 0){
                System.out.println(i);
            }
        }
    }
}
