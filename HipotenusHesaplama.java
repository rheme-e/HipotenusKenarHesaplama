package Giris;
import java.util.Scanner;
public class HipotenusHesaplama {
    public static void main(String[] args) {
        int a,b;
        double c;
        Scanner inp= new Scanner(System.in);
        System.out.print("Birinci Kenarı Giriniz:");
        a=inp.nextInt();
        System.out.print("İkinci Kenarı Giriniz:");
        b=inp.nextInt();
        c= Math.sqrt((a*a)+(b*b));
        System.out.print("Hipotenüs Kenar Uzunluğu:" + c);
    }
}
