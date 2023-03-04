import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Mesafeyi km türünden giriniz : ");
        int km = input.nextInt();
        System.out.print("Yaşınızı giriniz :");
        int yas = input.nextInt();
        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ):");
        int yolculuk_tipi = input.nextInt();
        if(yolculuk_tipi != 1 && yolculuk_tipi !=2){
            System.out.print("Hatalı veri girdiniz !");
        }
        input.close();

        float toplamTutar = km * 0.1f;

        if(yas < 12){
            toplamTutar *= 0.5;
        }
        else if ((yas >= 12) && (yas <= 24)){
            toplamTutar *= 0.9;
        } else if (yas > 65){
            toplamTutar *= 0.7;
        }

        toplamTutar = (yolculuk_tipi == 2) ? (toplamTutar * 1.6f) : (toplamTutar * 2);

        System.out.print("Toplam Tutar = " + toplamTutar);

    }
}
