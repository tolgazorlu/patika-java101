import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a value: ");
        int number = input.nextInt();
        input.close();

        int i;

        for(i = 0; i < number; i++){
            if(i % 4 == 0 || i % 5 == 0){
                System.out.print(i + " ");
            }
        }

    }
}
