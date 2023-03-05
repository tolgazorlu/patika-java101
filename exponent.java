import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("number: ");
        int n = input.nextInt();
        System.out.print("exponent: ");
        int r = input.nextInt();
        input.close();
        int result = n;

        for(int i = 1; i < r ; i++){
            result *= n;
        }

        System.out.print("Result: " + result);

    }
}

