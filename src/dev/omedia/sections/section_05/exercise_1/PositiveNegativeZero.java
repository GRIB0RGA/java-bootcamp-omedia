package dev.omedia.sections.section_05.exercise_1;

public class PositiveNegativeZero {

    public static void checkNumber(int number) {

        String output = number == 0 ? "zero" : number > 0 ? "positive" : "negative";

        System.out.println(output);
    }
}
