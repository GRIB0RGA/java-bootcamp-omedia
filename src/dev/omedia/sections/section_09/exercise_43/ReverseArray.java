package dev.omedia.sections.section_09.exercise_43;

import java.util.Arrays;

public class ReverseArray {

    private static void reverse(int[] arr) {
        System.out.printf("Array = %s", Arrays.toString(arr));

        int[] reversedArray = Arrays.copyOf(arr, arr.length);
        for (int i = 0; i < reversedArray.length; i++) {
            arr[i] = reversedArray[reversedArray.length - 1 - i];
        }

        System.out.printf("Reversed array = %s", Arrays.toString(arr));
    }
}
