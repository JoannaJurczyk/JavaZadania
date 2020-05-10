import java.util.Scanner;

public class WstepJava {

    public static void main(String[] args) {
        
        System.out.println("Zadanie 1");
        Scanner scanner= new Scanner(System.in);
        System.out.println("Podaj temperaturę w stopniach Celsjusza:");
        double temperatura = scanner.nextDouble();
        double nowaTemp= 1.8 * temperatura + 32.0;
        System.out.println("Temperatura w stopniach Fahrenheita: "+ nowaTemp);

    }
}
