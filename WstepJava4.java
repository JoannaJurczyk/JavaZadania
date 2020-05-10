import java.util.Scanner;

public class WstepJava4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj roczny dochód:");
        double dochod = scanner.nextDouble();
        double podatek1 = 0.18 * dochod - 556.02;
        double podatek2 = 14_839.02 + 0.32 * (dochod - 85528);

        if (dochod < 85_528){
            System.out.println("Należny podatek: " + podatek1);
        } else{
            System.out.println("Należny podatek: " + podatek2);
        }
    }
}

