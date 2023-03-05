import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        System.out.print("Enter first value: ");
        int n1 = input .nextInt ();

        System.out.print("Enter a second value: ");
        int n2 = input .nextInt ();

        int ebob = 1;

        int k = n1;

        while (k >= 1) {
            if (n1 % k == 0 && n2 % k == 0) {
                ebob = k;
                System.out.println (ebob);
                break;
            }
            k--;
        }

        int i = 1;

        while (i <= (n1 * n2)) {
            if (i % n1 == 0 && i % n2 == 0) {
                System.out.println(i);
                break;
            }
            i++;
        }

    }
}

