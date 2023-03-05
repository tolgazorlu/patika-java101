import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a value: ");
        int number = input.nextInt();
        input.close();
        double i = 1;
        double result = 0;
        while(i <= number){
            result += (1/i);
            i++;
        }

        System.out.print("Result: "+ result);

    }
}

