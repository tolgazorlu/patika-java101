import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        int result = 0, number;
        Scanner input = new Scanner(System.in);


        do {
            System.out.print("Enter a number : ");
            number = input.nextInt();

            if(number % 4 == 0){
                result += number;
            }

        }while(number > 0);

        input.close();

        System.out.print("Result: " + result);

    }
}
