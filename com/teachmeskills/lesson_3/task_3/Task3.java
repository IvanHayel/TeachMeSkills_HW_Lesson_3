package com.teachmeskills.lesson_3.task_3;

import java.util.Arrays;

/**
 * Create 2 arrays of 5 numbers.
 * Print the arrays to the console on two separate lines.
 * Calculate the average of the elements of each array and report
 * for which of the arrays this value turned out to be greater
 * (or report that their averages are equal).
 */

public class Task3 {
    public static void main(String[] args) {
        int[] firstArray = {3, 1, 4, 5, 9};
        int[] secondArray = {2, 6, 5, 3, 5};
        System.out.println("First array: " + Arrays.toString(firstArray));
        System.out.println("Second array: " + Arrays.toString(secondArray));
        printAverageStatus(firstArray, secondArray);
    }

    private static void printAverageStatus(int[] firstArray, int[] secondArray) {
        double firstAverageValue = getAverageValue(firstArray);
        double secondAverageValue = getAverageValue(secondArray);
        System.out.printf("Average value of first array = %.2f\n", firstAverageValue);
        System.out.printf("Average value of second array = %.2f\n", secondAverageValue);
        if (firstAverageValue > secondAverageValue) {
            System.out.printf("Average value of first array is greater than second array.\n");
        } else if (firstAverageValue < secondAverageValue) {
            System.out.printf("Average value of second array is greater than first array.\n");
        } else {
            System.out.println("Average values are equal.");
        }
    }

    private static double getAverageValue(int[] array) {
        return getValuesSum(array) / (double) array.length;
    }

    private static int getValuesSum(int[] array) {
        int sum = 0;
        for (int item : array) {
            sum += item;
        }
        return sum;
    }
}