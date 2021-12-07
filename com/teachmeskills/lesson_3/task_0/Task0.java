package com.teachmeskills.lesson_3.task_0;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Create an array of integers.
 * Write a program that prints out a message about whether a given number is in an array or not.
 * Let value to be searched be set from the console (Scanner class).
 */

public class Task0 {
    public static void main(String[] args) {
        int[] arrayOfIntegers = {3, 1, 4, 5, 9, 2, 6, 5, 3, 5};
        System.out.println("Array: " + Arrays.toString(arrayOfIntegers));
        int valueToFind = enterValueToFind();
        if (isInArray(arrayOfIntegers, valueToFind)) {
            System.out.println("The array contains this value.");
        } else {
            System.out.println("The array doesn't contain this value.");
        }
    }

    private static int enterValueToFind() {
        System.out.print("Enter value to find: ");
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
}