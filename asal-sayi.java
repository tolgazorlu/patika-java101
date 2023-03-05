import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        
        for(int i = 2; i <= 100; i++){
            int temp = 0;
            for(int j = 1; j <= i; j++){
                if(i % j == 0){
                    temp++;
                }
            }
            if(temp <= 2){
                System.out.print(i + " ");
            }
        }
        
    }
}

