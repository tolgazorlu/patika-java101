package Giris;

import java.util.Scanner;

public class Baslangic {
    public static void main(String[] args) {
        double tutar, kdvOran = 0.18, kdvTutar, kdvliTutar;
        Scanner input = new Scanner (System.in);
        System.out.print ("Ücret Tutarana Giriniz: ");
        tutar = input. nextDouble ();

        kdvTutar = tutar * kdvOran;
        kdvliTutar = tutar + kdvTutar;
        System.out.println("KDV'siz Tutar:" + tutar);
        System.out.println("KDV Orana :" + kdvOran) ;
        System.out.println("KDV Tutara :" + kdvTutar);
        System.out.println("KDV'Li Tutara: " + kdvliTutar);

    }
}
