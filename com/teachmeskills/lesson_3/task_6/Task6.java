package com.teachmeskills.lesson_3.task_6;

import java.util.Arrays;

/**
 * Create an array of strings.
 * Fill it in with arbitrary names of people.
 * Sort the array.
 * Output the result to the console.
 */

public class Task6 {
    public static void main(String[] args) {
        String[] names = {"Ivan", "Petr", "Mariya", "Ben", "Chuck"};
        System.out.println(Arrays.toString(names));
        Arrays.sort(names);
        System.out.println("Sorted alphabetically: " + Arrays.toString(names));
    }
}