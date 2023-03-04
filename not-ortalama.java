package Giris;

import java.util.Scanner;

public class Baslangic {
    public static void main(String[] args) {

        int mat, fizik, biyoloji;

        Scanner input = new Scanner(System.in);
        
        System.out.println("Matematik notunuz: ");
        mat = input.nextByte();

        System.out.println("Fizik notunuz: ");
        fizik = input.nextByte();
        
        System.out.println("Biyoloji notunuz: ");
        biyoloji = input.nextByte();
        
        float notOrtalaması = (mat + fizik + biyoloji) / 3;
        
        System.out.println("Not ortalamanız: " + notOrtalaması);

    }
}
