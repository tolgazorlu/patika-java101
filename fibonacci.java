import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a value:  ");
        int number = input.nextInt();
        int  x = 0, y = 1, sum;

        for (int i = 1; i <= number; ++i) {
            System.out.print(x + " ");
            sum = x + y;
            x = y;
            y = sum;
        }

    }
}

