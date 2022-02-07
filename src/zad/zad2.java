package zad;

import java.util.ArrayList;
import java.util.Scanner;

public class zad2 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter your number: ");
        float num = scan.nextFloat();
        ArrayList<Integer> dividers = new ArrayList<Integer>();
        if (num == (int)num) { //решето эратосфена
            for (int i = 0; i <= num; i++) {
                dividers.add(i);
            }
            for (int i = 2; i * i <= num; i++) {
                if (dividers.get(i) != 0) {
                    for (int j = i * i; j <= num; j += i) {
                        dividers.set(j, 0);
                    }
                }
            }
            for (int i = 2; i <= num; i++) {
                if (dividers.get(i) != 0 && num % dividers.get(i) == 0) { //поиск делителей среди простых чисел
                    System.out.print(i + " ");
                }
            }
        } else {
            System.out.println("your number is not an integer!");
        }

    }
}
