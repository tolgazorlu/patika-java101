package Giris;

import java.util.Scanner;

public class Baslangic {
    public static void main(String[] args) {

        float boy, vki;
        int kilo;

        Scanner input = new Scanner(System.in);

        System.out.print("Boyunuzu (metre cinsinden) giriniz: ");
        boy = input.nextFloat();

        System.out.print("Kilonuzu giriniz: ");
        kilo = input.nextInt();

        vki = kilo / (boy*boy);

        System.out.println("Vücut kitle indeksiniz: " + vki);

    }
}
