import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter month:");
        int month = input.nextInt();

        System.out.print("Enter day:");
        int day = input.nextInt();

        if(month == 1){
            if(day <= 21 && day > 0){
                System.out.print("Capricorn");
            }
            else if(day > 21 && day < 30){
                System.out.print("Aquarius");
            }
            else{
                System.out.print("Day value is invalid");
            }
        }
        else if(month == 2){
            if(day <= 19 && day > 0){
                System.out.print("Aquarius");
            }
            else if(day > 19 && day < 30){
                System.out.print("Pisces");
            }
            else{
                System.out.print("Day value is invalid");
            }
        }
        else if(month == 3){
            if(day <= 20 && day > 0){
                System.out.print("Pisces");
            }
            else if(day > 20 && day < 30){
                System.out.print("Aries");
            }
            else{
                System.out.print("Day value is invalid");
            }
        }
        else if(month == 4){
            if(day <= 21 && day > 0){
                System.out.print("Aries");
            }
            else if(day > 21 && day < 30){
                System.out.print("Taurus");
            }
            else{
                System.out.print("Day value is invalid");
            }
        }
        else if(month == 5){
            if(day <= 21 && day > 0){
                System.out.print("Taurus");
            }
            else if(day > 21 && day < 30){
                System.out.print("Gemini");
            }
            else{
                System.out.print("Day value is invalid");
            }
        }
        else if(month == 6){
            if(day <= 22 && day > 0){
                System.out.print("Gemini");
            }
            else if(day > 22 && day < 30){
                System.out.print("Cancer");
            }
            else{
                System.out.print("Day value is invalid");
            }
        }
        else if(month == 7){
            if(day <= 23 && day > 0){
                System.out.print("Cancer");
            }
            else if(day > 22 && day < 30){
                System.out.print("Leo");
            }
            else{
                System.out.print("Day value is invalid");
            }
        }
        else if(month == 8){
            if(day <= 22 && day > 0){
                System.out.print("Leo");
            }
            else if(day > 22 && day < 30){
                System.out.print("Virgo");
            }
            else{
                System.out.print("Day value is invalid");
            }
        }
        else if(month == 9){
            if(day <= 22 && day > 0){
                System.out.print("Virgo");
            }
            else if(day > 22 && day < 30){
                System.out.print("Libra");
            }
            else{
                System.out.print("Day value is invalid");
            }
        }
        else if(month == 10){
            if(day <= 22 && day > 0){
                System.out.print("Libra");
            }
            else if(day > 22 && day < 30){
                System.out.print("Scorpio");
            }
            else{
                System.out.print("Day value is invalid");
            }
        }
        else if(month == 11){
            if(day <= 22 && day > 0){
                System.out.print("Scorpio");
            }
            else if(day > 22 && day < 30){
                System.out.print("Sagittarius");
            }
            else{
                System.out.print("Day value is invalid");
            }
        }
        else if(month == 12){
            if(day <= 22 && day > 0){
                System.out.print("Saggitarius");
            }
            else if(day > 22 && day < 30){
                System.out.print("Capricorn");
            }
            else{
                System.out.print("Day value is invalid");
            }
        }
    }

}
