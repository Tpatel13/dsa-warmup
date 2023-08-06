package org.example.arrays;

import java.util.Arrays;
import java.util.Random;

public class SingleDArrayOperations {
    public static void main(String[] args) {
        int[] randomArray = getRandomArray(10, 20);
        int[] randomArray2 = getRandomArray(20, 40);

        System.out.println(Arrays.toString(randomArray));
        System.out.println(replaceValue(randomArray, 1, 2));
        System.out.println(Arrays.toString(randomArray));
        int[] updatedArray = Arrays.stream(randomArray).map(e -> e + 1).toArray();

        System.out.println(Arrays.toString(updatedArray));
    }


    private static boolean replaceValue(int[] inputArray, int baseValue, int newValue) {
        if (inputArray == null) return false;

        boolean statusFlag = false;
        int replacedValueCounter = 0;
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] == baseValue) {
                inputArray[i] = newValue;
                statusFlag = true;
                replacedValueCounter++;
            }
        }
        System.out.println("Total Values updated :: " + replacedValueCounter);
        return statusFlag;
    }

    private static boolean searchFromArray(int[] inputArray, int searchElement) {
        if (inputArray == null) return false;

        for (int eachElement : inputArray) {
            if (eachElement == searchElement) return true;
        }
        return false;
    }

    private static int[] getRandomArray(int arraySize, int upperBound) {
        try {
            if (arraySize < 0) throw new RuntimeException();

            int[] intArray = new int[arraySize];
            Random random = new Random();
            for (int i = 0; i < intArray.length; i++) {
                intArray[i] = random.nextInt(upperBound);
            }
            return intArray;
        } catch (Exception e) {
            System.out.println("Error while creating array ");
            System.out.println(e.getMessage());
            return null;
        }
    }

}