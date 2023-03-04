import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        float a, b;
        int select;

        Scanner input = new Scanner(System.in);

        System.out.print("First value: ");
        a = input.nextFloat();

        System.out.print("Second value: ");
        b = input.nextFloat();

        System.out.print("1.Addition, 2.Subtraction, 3.Multiplication, 4.Division\nSelect:");
        select = input.nextInt();

        switch(select){
            case 1: System.out.print("Result:  " + (a + b)); break;
            case 2: System.out.print("Result:  " + (a - b)); break;
            case 3: System.out.print("Result:  " + (a * b)); break;
            case 4: System.out.print("Result:  " + (a / b)); break;
        }

    }

}
