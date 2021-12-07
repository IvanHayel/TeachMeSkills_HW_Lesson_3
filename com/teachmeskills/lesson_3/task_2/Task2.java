package com.teachmeskills.lesson_3.task_2;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.random;

/**
 * Create and fill an array with random numbers and print the maximum, minimum and average values.
 * Use the Math.random () method to generate a random number.
 * Let it be possible to create an array of arbitrary size.
 * Let the size of the array be entered from the console.
 */

public class Task2 {
    public static void main(String[] args) {
        int arrayLength = enterArrayLength();
        int[] randomArray = getRandomArray(arrayLength);
        System.out.printf("Random array of %d elements: ", arrayLength);
        System.out.println(Arrays.toString(randomArray));
        System.out.printf("Max value: %d\n", getMaxValue(randomArray));
        System.out.printf("Min value: %d\n", getMinValue(randomArray));
        System.out.printf("Middle value: %d\n", getMiddleValue(randomArray));
        System.out.printf("Average value: %.2f\n", getAverageValue(randomArray));
    }

    private static int enterArrayLength() {
        System.out.print("Enter the length of the array: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static int[] getRandomArray(int arrayLength) {
        int[] randomArray = new int[arrayLength];
        for (int counter = 0; counter < arrayLength; counter++) {
            randomArray[counter] = (int) (random() * 100);
        }
        return randomArray;
    }

    private static int getMaxValue(int[] array) {
        int maxValue = array[0];
        for (int item : array) {
            if (maxValue < item) {
                maxValue = item;
            }
        }
        return maxValue;
    }

    private static int getMinValue(int[] array) {
        int minValue = array[0];
        for (int item : array) {
            if (minValue > item) {
                minValue = item;
            }
        }
        return minValue;
    }

    private static int getMiddleValue(int[] array) {
        int[] arrayCopy = Arrays.copyOf(array, array.length);
        Arrays.sort(arrayCopy);
        int indexOfMiddleValue = arrayCopy.length >> 1;
        return arrayCopy[indexOfMiddleValue];
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