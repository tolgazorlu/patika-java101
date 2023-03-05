import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("n: ");
        int n = input.nextInt();
        System.out.print("r: ");
        int r = input.nextInt();
        input.close();

        int nFactor = 1;

        for(int i = 1; i <= n; i++){
            nFactor *= i;
        }

        int rFactor = 1;

        for(int i = 1; i <= r; i++){
            rFactor *= i;
        }

        int n_rFactor = 1;
        for(int i = 1; i <= n-r; i++){
            n_rFactor *= i;
        }

        double combination = nFactor / (rFactor * (n_rFactor));

        System.out.print("Result: " + combination);

    }
}

