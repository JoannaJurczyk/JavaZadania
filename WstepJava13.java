import java.util.Scanner;

public class WstepJava13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.nextLine();
        String zn = scanner.nextLine();

        if(zn.length() !=1){
            return;
        }
        for (int i=0; i< y -1; i++){
            System.out.println();
        }
        String xShift = "";
        for(int i=0; i<x-1; i++){
            xShift = xShift + " ";
        }
        for (int i=0; i<b; i++){
            System.out.print(xShift);
            for (int j=0; j<a; j++){
                System.out.print(zn);
            }
            System.out.println();
        }
    }
}
