package dev.omedia.sections.section_05.exercise_12;

public class PlayingCat {

    public static boolean isCatPlaying(boolean summer, int temperature) {
        int upperLimit = summer ? 45 : 35;
        return temperature >= 25 && temperature <= upperLimit;
    }
}
