package dev.omedia.sections.section_06.exercise_16;

public class NumberPalindrome {

    public static boolean isPalindrome(int number) {
        int copyOfOriginal = number, reversed = 0;

        while (number != 0) {
            reversed = reversed * 10 + number % 10;
            number /= 10;
        }

        return reversed == copyOfOriginal;
    }
}

