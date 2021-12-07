package com.teachmeskills.lesson_3.task_4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * If the user entered an unsuitable number, then the program should ask the user to re-enter.
 * Create an array of n random integers and print it to the screen.
 * Let the size of the array be set from the console and
 * the size of the array can be greater than 5 and less than or equal to 10.
 * If n does not satisfy the condition, print a message about it.
 * Create a second array from only the even elements of the first array, if any, and display it.
 */

public class Task4 {
    public static void main(String[] args) {
        int arrayLength = enterArrayLength();
        int[] randomArray = getRandomArray(arrayLength);
        System.out.println("Random array: " + Arrays.toString(randomArray));
        int[] arrayWithEvenElements = createWithEvenElementsFrom(randomArray);
        System.out.print("Array with even elements of random array: ");
        System.out.println(Arrays.toString(arrayWithEvenElements));
    }

    private static int enterArrayLength() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int arrayLength;
        while (true) {
            arrayLength = scanner.nextInt();
            if (arrayLength > 5 && arrayLength <= 10) {
                return arrayLength;
            }
            System.out.print("Value of length must be in range (5,10] : ");
        }
    }

    private static int[] getRandomArray(int arrayLength) {
        Random generator = new Random();
        int[] randomArray = new int[arrayLength];
        for (int counter = 0; counter < arrayLength; counter++) {
            randomArray[counter] = generator.nextInt(100);
        }
        return randomArray;
    }

    private static int[] createWithEvenElementsFrom(int[] randomArray) {
        int numberOfEvenValues = getEvenOccurrences(randomArray);
        int[] arrayOfEvenElements = new int[numberOfEvenValues];
        int counter = 0;
        for (int item : randomArray) {
            if (isEven(item)) {
                arrayOfEvenElements[counter++] = item;
            }
        }
        return arrayOfEvenElements;
    }

    private static int getEvenOccurrences(int[] arrayOfIntegers) {
        int numberOfOccurrences = 0;
        for (int item : arrayOfIntegers) {
            if (isEven(item)) {
                numberOfOccurrences++;
            }
        }
        return numberOfOccurrences;
    }

    private static boolean isEven(int item) {
        return item % 2 == 0;
    }
}