import java.util.Scanner;

public class WstepJava14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int stars = 1;
        for(int i=0, s=n -1; i<n; i++, s--){
            for(int j =0; j<s; j++){
                System.out.print(" ");
            }
            for (int j=0; j< stars; j++){
                System.out.print("*");
            }
            System.out.println();
            stars = stars + 2;
        }

    }
}
