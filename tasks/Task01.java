package J11_MethodCreation.tasks;

import java.util.Scanner;

class Task01 {
    public static void main(String[] args) {

    /*
    Ismi randomNum olan bir method oluşturun.
    Parametre olarak int max almalı.
    Bu method, 0 ile max arasında.random bir değer döndürmelidir.
    Random numarayı döndürünüz.
    Note: Eğer bir class oluşturmaya ihtiyaç duyuyorsanız oluşturabilirsiniz.
    Note: Methodun adı istenilenle birebir aynı olmalı (randomNum), aksi taktirde cevap yanlış olur.
     */

        Scanner scan = new Scanner(System.in);
        System.out.print("rastgele bir sayı giriniz : ");
        int max1 = scan.nextInt();
        System.out.println("sonuc"+randomNum(max1));

    } //main sonu

    public static double randomNum(int max) {

        double sonuc= Math.random()* max;
        return sonuc;

    }
}
