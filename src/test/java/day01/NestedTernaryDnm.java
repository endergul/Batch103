package day01;

import java.util.Scanner;

public class NestedTernaryDnm {
    public static void main(String[] args) {

        /*
            Asagidaki kurallara gore password'un gecerli olup olmadigini kontrol eden kodu yaziniz
            i)Sekiz karakterden fazla veya sekiz karakter varsa ilk harfi 'i' olmalidir
            ii)Sekiz karakterden az karakter varsa ilk harfi 'K' olmalidir
        */

        Scanner input= new Scanner(System.in);
        System.out.println("Pasword Gir");
        String psw=input.next();

        char ilkHarf=psw.charAt(0);//bir methodu iki farklı yerde kullanacaksan onu bir sepete at (atama yap) yeni oluşanı kullan
                                    // 2 ekmek için bakkala iki defa gitme!!!

        String sonuc = psw.length()<8 ? (ilkHarf=='K' ? "geçerli" :"geçersiz") :(ilkHarf=='i' ? "geçerli" :"geçersiz");
        System.out.println(sonuc);

    }

}
