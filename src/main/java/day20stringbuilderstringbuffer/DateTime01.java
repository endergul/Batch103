package day20stringbuilderstringbuffer;

import java.time.LocalDate;

public class DateTime01 {
    public static void main(String[] args) {

        //EXample 8: Tom, Ali'den 3 yil 8 ay 13 gun sonra dogdu. Ali is Veli'den 1 yil 15 gun once dogdu.
//           Tom'un dogum tarihi 18 Kasim 2011 ise Veli ve Ali'nin dogum tarihlerini bulunuz.

        LocalDate dobTom=LocalDate.of(2011,11,18);
        System.out.println("tom " + dobTom);
        LocalDate dobAli1= dobTom.minusYears(3).minusMonths(8).minusDays(13);
        System.out.println("ali " + dobAli1);
        LocalDate dopVeli1= dobAli1.plusYears(1).plusDays(15);
        System.out.println("veli " + dopVeli1);

    }

}
