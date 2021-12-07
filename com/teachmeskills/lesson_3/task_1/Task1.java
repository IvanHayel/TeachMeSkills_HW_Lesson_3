package com.teachmeskills.lesson_3.task_1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Create an array of integers.
 * Remove all occurrences of the given number from the array.
 * Let the number be set from the console (Scanner class).
 * If there is no such number, print messages about it.
 * The result should be a new array without the specified number.
 */

public class Task1 {
    public static void main(String[] args) {
        int[] arrayOfIntegers = {3, 1, 4, 5, 9, 2, 6, 5, 3, 5};
        System.out.println("Array: " + Arrays.toString(arrayOfIntegers));
        int valueToDelete = enterValueToDelete();
        if (isInArray(arrayOfIntegers, valueToDelete)) {
            int[] arrayWithoutValue = getArrayWithoutValue(arrayOfIntegers, valueToDelete);
            System.out.printf("Array without value %d: ", valueToDelete);
            System.out.println(Arrays.toString(arrayWithoutValue));
        } else {
            System.out.println("The value isn't in the array.");
        }
    }

    private static int enterValueToDelete() {
        System.out.print("Enter value to delete: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static boolean isInArray(int[] array, int value) {
        for (int item : array) {
            if (item == value) {
                return true;
            }
        }
        return false;
    }

    private static int[] getArrayWithoutValue(int[] arrayOfIntegers, int valueToDelete) {
        int numberOfOccurrences = getOccurrences(arrayOfIntegers, valueToDelete);
        int[] arrayWithoutValue = new int[arrayOfIntegers.length - numberOfOccurrences];
        for (int counter = 0, newCounter = 0; counter < arrayOfIntegers.length; counter++) {
            if (arrayOfIntegers[counter] != valueToDelete) {
                arrayWithoutValue[newCounter++] = arrayOfIntegers[counter];
            }
        }
        return arrayWithoutValue;
    }

    private static int getOccurrences(int[] arrayOfIntegers, int valueToDelete) {
        int numberOfOccurrences = 0;
        for (int item : arrayOfIntegers) {
            if (item == valueToDelete) {
                numberOfOccurrences++;
            }
        }
        return numberOfOccurrences;
    }
}