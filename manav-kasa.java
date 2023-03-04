package Giris;

import java.util.Scanner;

public class Baslangic {
    public static void main(String[] args) {

        float armut=2.14f, elma=3.67f, domates=1.11f, muz=0.95f, patlican=5.00f;
        int armutKilo, elmaKilo, domatesKilo, muzKilo, patlicanKilo;
        float toplam;

        Scanner input = new Scanner(System.in);

        System.out.print("Armut kac kilo ? : ");
        armutKilo = input.nextInt();

        System.out.print("Elma kac kilo ? : ");
        elmaKilo = input.nextInt();

        System.out.print("Domates kac kilo ? : ");
        domatesKilo = input.nextInt();

        System.out.print("Muz kac kilo ? : ");
        muzKilo = input.nextInt();

        System.out.print("Patlıcan kac kilo ? : ");
        patlicanKilo = input.nextInt();

        toplam = (armut * armutKilo) + (domates * domatesKilo) + (muz * muzKilo) + (elma * elmaKilo) + (patlican * patlicanKilo);

        System.out.println("Toplam tutar: " + toplam);

    }
}
