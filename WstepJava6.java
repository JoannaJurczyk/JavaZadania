import java.util.Scanner;

public class WstepJava6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Prosty kalkulator");
        System.out.println("Podaj pierwszą liczbę:");
        double pierwszaLiczba = scanner.nextDouble();
        System.out.println("Podaj symbol operacji arytmetycznej +,-,*,/ :");
        char symbol = scanner.next().charAt(0);
        System.out.println("Podaj drugą liczbę: ");
        double drugaliczba = scanner.nextDouble();

        switch (symbol){
            case '+':
                System.out.println(pierwszaLiczba + drugaliczba);
                break;
            case '-' :
                System.out.println(pierwszaLiczba - drugaliczba);
                break;
            case '*':
                System.out.println(pierwszaLiczba * drugaliczba);
                break;
            case '/':
                if (drugaliczba == 0){
                    System.out.println("Nie można wykonać działania");
                } else{
                    System.out.println(pierwszaLiczba / drugaliczba);
                }
                break;
            default:
                System.out.println("Nie można wykonać działania");
                break;
        }
    }
}


