import java.util.Scanner;

public class ONEFUNCTIONCALCULATOR {
    public static void main(String[] args) throws Exception {

        int x;
        int y;

        try (Scanner s = new Scanner(System.in)) {

            System.out.print("Num 1 : ");
            x = s.nextInt();

            System.out.print("Num 2 : ");
            y = s.nextInt();

            int result = x + y;

            System.out.println();
            System.out.println(x + " + " + y + " = " + result);
        }
    }
}
