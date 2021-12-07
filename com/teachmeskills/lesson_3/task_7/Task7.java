package com.teachmeskills.lesson_3.task_7;

import java.util.Arrays;

/**
 * Realize the bubble sort algorithm.
 */

public class Task7 {
    public static void main(String[] args) {
        double[] arrayOfDoubles = {-3.14, 1.59, 2.65, 3.58, -9.79, 3.23};
        System.out.print("Before bubble sort: ");
        System.out.println(Arrays.toString(arrayOfDoubles));
        bubbleSort(arrayOfDoubles);
        System.out.print("After bubble sort: ");
        System.out.println(Arrays.toString(arrayOfDoubles));
    }

    private static void bubbleSort(double[] array) {
        boolean alreadySorted;
        for (int pass = 1; pass < array.length - 1; pass++) {
            alreadySorted = true;
            for (int counter = 0; counter < array.length - pass; counter++) {
                if (array[counter] > array[counter + 1]) {
                    alreadySorted = false;
                    swap(array, counter, counter + 1);
                }
            }
            if (alreadySorted) {
                break;
            }
        }
    }

    private static void swap(double[] array, int firstIndex, int secondIndex) {
        double tempValue = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = tempValue;
    }
}