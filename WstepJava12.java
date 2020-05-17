import java.util.Scanner;

public class WstepJava12 {
    public static void main(String[] args) {

        int random = (int) (Math.random() * 100.0 + 1); // <1;100>

        //random()   <0.0; 1.0>


        Scanner scanner = new Scanner(System.in);

        int read;

        do {
            read = scanner.nextInt();
            if (read < random) {
                System.out.println("Podałeś za małą liczbę.");
            } else if (read > random) {
                System.out.println("Podałeś za dużą liczbę.");
            } else {
                System.out.println("Gratulacje! Zgadłeś!");
            }

        } while (read != random);
    }
}
