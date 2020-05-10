import java.util.Scanner;

public class WstepJava10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double liczba;
        double suma = 0;

        do {
            System.out.println("Podaj liczbę:");
            liczba = scanner.nextDouble();
            suma += liczba;
        }
        while( liczba != 0);
        System.out.println(suma);
    }
}



