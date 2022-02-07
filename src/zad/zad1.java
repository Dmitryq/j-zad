package zad;

import java.util.Scanner;
public class zad1 {
    public static void main (String[] args) {
        int sum = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your string: ");
        String str = scan.nextLine();
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                sum += Character.getNumericValue(str.charAt(i));
            }
        }
        System.out.println(sum);
    }
}
