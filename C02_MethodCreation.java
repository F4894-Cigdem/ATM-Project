package J11_MethodCreation;

import java.util.Scanner;

public class C02_MethodCreation {
    public static void main(String[] args) {
        //task-> girilen 3 notun ortalamasını hesaplayan method create ediniz

        Scanner scan=new Scanner(System.in);
        System.out.println("1. notunuzu giriniz : ");
        double not1= scan.nextDouble();

        System.out.println("2. notunuzu giriniz : ");
        double not2= scan.nextDouble();

        System.out.println("3. notunuzu giriniz : ");
        double not3= scan.nextDouble();

        double ortalamanız=ortalamaHesapla(not1,not2,not3);
        System.out.println("not ortalamanız : " +ortalamanız);


    }// main sonu

    public static double ortalamaHesapla(double a, double b, double c) {
        return (a+b+c)/3;

    }


}
