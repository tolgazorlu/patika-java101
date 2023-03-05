import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        System.out.print("Bir sayı giriniz:");
        int number = input.nextInt();
        int result = 0;

        for(int i = 1; i < number; i ++){
            if(number % i == 0){
                result += i;
            }
        }

        if(result == number){
            System.out.print(number + " mükkemmel sayıdır.");
        }
        else{
            System.out.print(number + " mükkemmel sayı değildir.");
        }

    }
}

