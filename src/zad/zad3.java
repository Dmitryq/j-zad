package zad;

import java.util.ArrayList;
import java.util.Scanner;

public class zad3 {
    public static boolean isVowel (int ch) {
        if (      Character.toLowerCase(ch) == 'а' ||Character.toLowerCase(ch) == 'о'
                ||Character.toLowerCase(ch) == 'у' ||Character.toLowerCase(ch) == 'э'
                ||Character.toLowerCase(ch) == 'ы' ||Character.toLowerCase(ch) == 'я'
                ||Character.toLowerCase(ch) == 'ё' ||Character.toLowerCase(ch) == 'е'
                ||Character.toLowerCase(ch) == 'ю' ||Character.toLowerCase(ch) == 'и') {
            return true;
        } else return false;
    }

    public static int countVowels (String word) {
        int vowelsCount = 0;
        for (int i = 0; i < word.length(); i++) {
            if (isVowel(word.charAt(i))) {
                vowelsCount++;
            }
        }
        return vowelsCount;
    };

    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String[] words = str.split(" ");
        ArrayList<String> sortedWords = new ArrayList<>();
        String tmp;
        System.out.println("\nзадание 1: ");
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i] + ", количество гласных: " + countVowels(words[i]));
        }
        System.out.println("\nзадание 2: ");
        for (int i = 0; i < words.length - 1; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (countVowels(words[j]) > countVowels(words[i])) {
                    tmp = words[i];
                    words[i] = words[j];
                    words[j] = tmp;
                }
            }
        }
        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i] + " ");
        }
        System.out.println("\n\nзадание 3: ");
        for (int i = 0; i < words.length; i++) {
            if (isVowel(words[i].charAt(0))) {
                words[i] = words[i].substring(0, 1).toUpperCase() + words[i].substring(1);
            }
        }
        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i] + " ");
        }
    }
}
