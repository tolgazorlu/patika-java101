import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = input.nextInt();
        input.close();
        int result = 0, i=0;

        while(i <= number){
            if(i % 3 == 0 && i % 4 == 0){
                result += i;
            }
            i++;
        }

        System.out.print("Result: " + result);

    }
}
