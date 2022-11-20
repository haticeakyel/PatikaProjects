package com.company;

// A program to find the frequency of the elements in the array.

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {11,22,33,44,55,66,66,44,52,11,66,77,44};
        int[] frequency = new int[array.length];

        for (int i = 0; i < array.length; i++)
            frequency[i] = 1;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if ((i != j) && (array[i] == array[j]))
                    frequency[i]++;
            }
        }

        System.out.println("Array: " + Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if ((i != j) && (array[i] == array[j]))    
                    array[j] = 0;
            }
        }

        for (int i = 0; i < array.length; i++) {
            if (frequency[i] > 1) {
                if (array[i] != 0)
                    System.out.println("The number " + array[i] + " repeated " + frequency[i] + " times.");
            }
        }
    }
}
