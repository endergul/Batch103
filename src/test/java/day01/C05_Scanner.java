package day01;

import java.util.Scanner;

////Kullanicidan ad, soyad, memleket,konum,yas,boy,kilo,Javayi sevdinizmi bilgilerini aliniz

public class C05_Scanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz");
        String isim=scan.nextLine();

        System.out.println("Lütfen soy isminizi giriniz");
        String soyisim=scan.nextLine();

        System.out.println("Lütfen memleketinizi giriniz");
        String memleket=scan.nextLine();

        System.out.println("Lütfen konumunuzu giriniz");
        String konum=scan.nextLine();

        System.out.println("Lütfen yasinizi giriniz" );
        byte yas=scan.nextByte();

        System.out.println("Lütfen boyunuzu giriniz" );
        short boy=scan.nextShort();

        System.out.println("javayı sevdiniz mi?");
        boolean seviyormusun=scan.hasNextBoolean();




    }




}
