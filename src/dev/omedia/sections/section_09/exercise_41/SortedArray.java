package dev.omedia.sections.section_09.exercise_41;

import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {

    public static int[] getIntegers(int size) {
        int[] array = new int[size];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Write " + size + " values:");

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static int[] sortIntegers(int[] unsortedArray) {
        int[] sortedArray = Arrays.copyOf(unsortedArray, unsortedArray.length);
        Arrays.sort(sortedArray);
        int[] reversedArray = new int[sortedArray.length];
        for (int i = 0; i < unsortedArray.length; i++) {
            reversedArray[i] = sortedArray[sortedArray.length - 1 - i];
        }
        return reversedArray;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            String output = String.format("Element %d contents %d", i, array[i]);
            System.out.println(output);
        }
    }
}
