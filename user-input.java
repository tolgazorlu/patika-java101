import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String username = "patika", password = "123";

        System.out.print("Username: ");
        String userInput = input.nextLine();

        System.out.print("Password: ");
        String passwordInput = input.nextLine();

        if(userInput.equals(username) && !passwordInput.equals(password)){
            System.out.print("Password is invalid. Do you want to change password? 1 or 2: ");
            int select = input.nextInt();

            switch(select){
                case 1: {
                    Scanner newInput = new Scanner(System.in);
                    System.out.print("Enter a new password!: ");
                    String newPassword = newInput.nextLine();
                    if(newPassword.equals(password)){
                        System.out.println("New password can't be a old one!");
                    }
                    else{
                        System.out.println("New password generated!");
                    }
                }
                case 2: {
                    System.out.println("Come back later!");
                }
            }

        }
        else{
            System.out.println("Login Successful");
        }
    }

}
