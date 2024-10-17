package dev.omedia.sections.section_09.exercise_42;

import java.util.Scanner;

public class MinimumElement {

    private static int readInteger() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number:");
        return scanner.nextInt();
    }

    private static int[] readElements(int numberOfElements) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Please enter %d numbers of ur choice to create an array based on them:%n", numberOfElements);

        int[] intArray = new int[numberOfElements];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = scanner.nextInt();
        }
        return intArray;
    }

    private static int findMin(int[] numbers) {
        int minNumber = Integer.MAX_VALUE;
        for (int number : numbers) {
            minNumber = number < minNumber ? number : minNumber;
        }
        return minNumber;
    }
}
