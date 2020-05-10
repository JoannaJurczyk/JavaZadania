import java.util.Scanner;

public class WstepJava3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wagę w kg: ");
        double waga = scanner.nextDouble();
        System.out.println("Podaj wzrost w metrach: ");
        double wzrost = scanner.nextDouble();
        double wynik = waga / (wzrost * wzrost);

        if (wynik < 18.5) {
            System.out.println("Niedowaga");
        } else if (wynik >= 18.5 && wynik <= 24.9) {
            System.out.println("Waga prawidłowa");
        } else {
            System.out.println("Nadwaga");
        }
    }
}
