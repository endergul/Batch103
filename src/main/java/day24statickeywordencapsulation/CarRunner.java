package day24statickeywordencapsulation;

public class CarRunner {

 /*   static keyword nedir?
      1) Static keyword, class'a bağlanmış class elemanlarıdır.
         static variable/method class'a bağlıdır.
      2) Static class elemanları, tüm objelerin ortak elemanıdır.
      3) Static'ler üzerinde yapılan her değişiklik, tüm objeleri etkiler ve tüm objeler tarafından görülür.
      4) Static class elemanlarına, class üzerinden ulaşılır. Objeler, static'lere ulaşmak için kullanılmaz.
         Kullanılırsa hata vermez, fakat tavsiye edilmez.
*/

  /*   Static Class Nedir?
 Değişiklik yaptığınızda tüm objeler etkileniyorsa ona static denir.
 Değişiklik sadece bazılarını etkiliyorsa buna non-static denir.
 Static olmayanlar objeye bağlı,static olan Class a bağlıdır.
 Static keyword Class a bağlanmış Class elemanlarıdır.Static keyword ve method variable'lara bağlı.
 Tüm objelerin ortak elemanıdır.Static Class elemanları her objenin ortak elemanıdır.
 Static lder üzerinde yapılan değişiklikler,
tüm objelrden görülür.Static class elemanlarına class üzerinde ulaşılır,
objeler üzerinde ulaşılması tavsiye edilmez.Static ler Override edilemez çünkü tüm objeler bundan etkilenir.
    */

    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();
        Car car4 = new Car();

//static variable'lara objeleri kullanarak mumkun ama tavsiye edilmez.
        System.out.println(car1.counter);
        //static variable'lara Class ismi kullanarak ulaşılmalıdır.
        System.out.println(Car.counter);
        System.out.println(car1.price);

        System.out.println(Car.counter);
        System.out.println(car2.price);

        System.out.println(Car.counter);
        System.out.println(car3.price);

        System.out.println(Car.counter);
        System.out.println(car4.price);
    }
}



