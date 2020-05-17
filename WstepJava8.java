import java.sql.SQLOutput;
import java.util.Scanner;

public class WstepJava8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Podaj pierwszą liczbę całkowitą");
        int A = scanner.nextInt();
        System.out.println("Podaj drugą liczbę całkowitą większą od pierwszej:");
        int B = scanner.nextInt();
        int suma = 0;

        if(A >= B){
            return;
        }
        int whileSum =0;
        int whileA= A;
        int whileB = B;

        while (whileA <= whileB ){
            whileSum = whileSum + whileA;
            whileA++;
        }
        System.out.println(whileSum);

        int doWhileSum=0;
        int doWhileA=A;
        int doWhileB= B;
        do{
            doWhileSum= doWhileSum + doWhileA;
            doWhileA++;
        } while(doWhileA <= doWhileB);
        System.out.println(doWhileSum);

        int forSum =0;
        for(int forA =A; forA <= B; forA++){
            forSum = forSum + forA;
        }
        System.out.println(forSum);
    }
}

