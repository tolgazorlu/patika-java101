import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        System.out.print("Kaç tane sayı gireceksiniz:");
        int number = input.nextInt();
        int max = 0, min = 0;

        for (int i = 0; i<number; i++){
            System.out.print((i+1) + ". sayiyi giriniz: ");
            int value = input.nextInt();
            if(value < min){
                min = value;
            }
            else if(value > max){
                max = value;
            }
        }

        System.out.println("En büyük sayı:"+max);
        System.out.println("En küçük sayı:"+min);
    }
}

