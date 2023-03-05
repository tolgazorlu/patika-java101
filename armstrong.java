import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a value: ");
        int r = input.nextInt();
        int temp_r = r;
        input.close();

        int digit = 0;

        while(temp_r != 0){
            temp_r /= 10;
            digit++;
        }

        int result = r % 10;

        while (r != 0) {
            r /= 10;
            result += r % 10;
        }

        System.out.print("Result " + result);

    }
}

