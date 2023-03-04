import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter temperature:");
        int temperature = input.nextInt();

        if(temperature <= 5){
            System.out.println("Go to skiing");
        }
        else if(temperature > 5 && temperature <= 15){
            System.out.println("Go to cinema");
        }
        else if(temperature > 15 && temperature <= 25){
            System.out.println("Go to barbecue");
        }
        else{
            System.out.println("Go to swimming");
        }

    }

}
