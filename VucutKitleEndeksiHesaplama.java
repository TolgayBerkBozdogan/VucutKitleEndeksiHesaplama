import java.util.Scanner;
public class VucutKitleEndeksiHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double kilo,boy,indeks;
        String ad,soyAd;
        System.out.print("Adınızı Giriniz:");
        ad = input.next();
        System.out.print("Soy Adınızı Giriniz:");
        soyAd= input.next();
        System.out.print("Kilonuzu kg cinsinden girin:");
        kilo= input.nextDouble();
        System.out.print("Boyunuzu metre cinsinden giriniz:");
        boy = input.nextDouble();
        indeks = (kilo/(boy*boy));
        System.out.println(ad +" " + soyAd);
        System.out.println("Vücut Kitle Endeksiniz: "+indeks);


    }
}
