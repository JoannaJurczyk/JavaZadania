import java.util.Scanner;

public class WstepJava11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int numer;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        do{
            System.out.println("Podaj liczbę całkowitą:");
            numer = scanner.nextInt();
            if (numer > max && numer != 0){
                max = numer;
            }
            if (numer < min && numer != 0){
                min = numer;
            }
        } while (numer != 0);

        System.out.println(max + min);
        System.out.println( (max + min) / 2.0);

    }
}



