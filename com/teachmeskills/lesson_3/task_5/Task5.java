package com.teachmeskills.lesson_3.task_5;

import java.util.Arrays;

/**
 * Create an array and populate the array.
 * Display the array to a string.
 * Replace each odd-numbered element with zero.
 * Display the array again on a separate line.
 */

public class Task5 {
    public static void main(String[] args) {
        int[] arrayOfIntegers = {3, 1, 4, 5, 9, 2, 6, 5, 3, 5};
        System.out.println("Array: " + Arrays.toString(arrayOfIntegers));
        replaceOddIndexElements(arrayOfIntegers, 0);
        System.out.println("Array with 'zero' at odd indices : " + Arrays.toString(arrayOfIntegers));
    }

    private static void replaceOddIndexElements(int[] arrayOfIntegers, int valueToReplace) {
        for (int counter = 0; counter < arrayOfIntegers.length; counter++) {
            if (isOdd(counter)) {
                arrayOfIntegers[counter] = valueToReplace;
            }
        }
    }

    private static boolean isOdd(int number) {
        return number % 2 != 0;
    }
}