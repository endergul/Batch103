package day19datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class DayTime03 {
    public static void main(String[] args) {
        //Example 1: Japonya ile Almanya arasindaki zaman farkini hesaplayan kodu yaziniz

        LocalDateTime japan= LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        LocalDateTime germany= LocalDateTime.now(ZoneId.of("Europe/Berlin"));
        Long fark=ChronoUnit.HOURS.between(germany,japan);
        System.out.println("fark = " + fark);

        LocalDate myDate = LocalDate.of(2011, Month.APRIL,13);
        System.out.println("myDate = " + myDate);
 /*
              Java'da sabit datalari(Gun isimler, Ay isimleri, Amerika'daki eyalet isimleri etc.) depolamak ve gerektiginde kullanmak icin depolar
              olustururuz. Bu depolara "Enum" denir.
         */

//Example 3: USA icin "Woow!", UK icin "Big", "CANADA" icin "Cold",
// "TURKEY" icin "Vatan", "GERMANY" icin "Araba", "RWANDA" icin "Cay"

Countries country = Countries.GERMANY;

switch (country){
    case USA:
        System.out.println("Woow!");
        break;
    case UK:
        System.out.println("Big!");
        break;
    case CANADA:
        System.out.println("Cold!");
        break;
    case TURKEY:
        System.out.println("Vatan!");
        break;
    case GERMANY:
        System.out.println("Araba!");
        break;
    case RWANDA:
        System.out.println("Cay!");
        break;
}







    }
}
