package dev.omedia.sections.section_05.exercise_6;

public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double par1, double par2) {
        return (int) (par1 * 1000) == (int) (par2 * 1000);
    }
}
