package day01;

import java.util.Scanner;

public class C04_Java_Variables {
    public static void main(String[] args) {

        System.out.println("Hello World");

        Scanner input = new Scanner(System.in);

        System.out.println("Bir karakter giriniz...");
        char ch = input.next().charAt(0);
        if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z')){
            System.out.println("Alfabe");
        } else {
            System.out.println("Alfabe degil");}



    }

}
