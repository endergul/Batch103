package day01;

import java.util.Scanner;

public class StringManipulationDnm {
    public static void main(String[] args) {
        /*
                Bir password'un gecerli olup olmadigini asagidaki kurallara gore kontrol eden kodu yaziniz.
                            i)En az 8 character icermeli
                            ii)Space characteri icermemeli
                            iii)Ilk harfi "M" veya "m" olmali
                            iv)Son characteri "?" olmali
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Pasword Giriniz");
        String pwd = input.next();

       // i)En az 8 character icermeli
       boolean first= pwd.length()>7;
        //ii)Space characteri icermemeli
        boolean second =!pwd.contains(" ");

        //iii)Ilk harfi "M" veya "m" olmali
        boolean three=(pwd.charAt(0)=='M' ||pwd.charAt(0)=='m');

        //iv)Son characteri "?" olmali
        boolean four=(pwd.charAt(pwd.length()-1)=='?');
        boolean sonuc=(first&&second&&three&&four);

        System.out.println(sonuc);









        }
    }
