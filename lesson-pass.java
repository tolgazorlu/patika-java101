import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        int math, physic, turkish, chemistry, music;
        int lessons = 5;

        Scanner input = new Scanner(System.in);

        System.out.print("Math: ");
        int mathInput = input.nextInt();
        if(mathInput > 0 && mathInput < 100){
            math = mathInput;
        }
        else{
            lessons -= 1;
            math = 0;
        }

        System.out.print("Physic: ");
        int physicInput = input.nextInt();
        if(physicInput > 0 && physicInput < 100){
            physic = physicInput;
        }
        else{
            lessons -= 1;
            physic = 0;
        }

        System.out.print("Turkish: ");
        int turkishInput = input.nextInt();
        if(turkishInput > 0 && turkishInput < 100){
            turkish = turkishInput;
        }
        else{
            lessons -= 1;
            turkish = 0;
        }

        System.out.print("Chemistry: ");
        int chemistryInput = input.nextInt();
        if(chemistryInput > 0 && chemistryInput < 100){
            chemistry = chemistryInput;
        }
        else{
            lessons -= 1;
            chemistry = 0;
        }

        System.out.print("Music: ");
        int musicInput = input.nextInt();
        if(musicInput > 0 && musicInput < 100){
            music = musicInput;
        }
        else{
            lessons -= 1;
            music = 0;
        }

        double avarage  = (math + physic + turkish + chemistry + music) / lessons;

        if(avarage > 55 ){
            System.out.println("You passed!: " + avarage);
        }
        else{
            System.out.println("You failed!:" + avarage);
        }

    }

}
