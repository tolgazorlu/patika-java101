package Giris;

import java.util.Scanner;

public class Baslangic {
    public static void main(String[] args) {

        int a, b;
        double c;
        Scanner input = new Scanner (System.in);
        System.out.print ("1. kenar: ");
        a = input. nextInt();
        System.out.print ("2. kenar: ");
        b = input. nextInt();

        c = Math.sqrt((a*a) + (b*b));

        System.out.println("Hipotenüs:" + c);

    }
}
